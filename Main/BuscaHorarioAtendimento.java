package Main;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaHorarioAtendimento {

    // Serviço que fornece as informações de horário de atendimento
    HorarioAtendimentoService horarioAtendimentoService;

    // Construtor da classe que recebe um serviço de HorarioAtendimentoService
    public BuscaHorarioAtendimento(HorarioAtendimentoService service) {
        this.horarioAtendimentoService = service;
    }

    // Método que busca o horário de atendimento de um professor pelo nome
    public HorarioAtendimento buscaHorarioAtendimento(String nomeDoProfessor) {

        // Obtém o JSON com as informações do horário de atendimento para o professor
        String atendimentoJson = horarioAtendimentoService.buscaHorarioAtendimento(nomeDoProfessor);

        // Converte a string JSON em um objeto JsonObject
        JsonObject jsonObject = JsonParser.parseString(atendimentoJson).getAsJsonObject();

        // Cria um objeto HorarioAtendimento a partir dos dados no JsonObject
        return new HorarioAtendimento(
                jsonObject.get("nomeDoProfessor").getAsString(), // Nome do professor
                jsonObject.get("horarioDeAtendimento").getAsString(), // Horário de atendimento
                jsonObject.get("periodo").getAsString(), // Período (ex: Noturno, Diurno)
                jsonObject.get("sala").getAsInt(), // Número da sala
                jsonObject.getAsJsonArray("predio").get(0).getAsString() // Prédio
        );
    }

    // Método para verificar se o horário de atendimento existe para o professor
    public boolean verificaArrayListExistente(String nomeDoProfessor) {
        // Verifica a existência do horário de atendimento usando o serviço
        boolean horarioAtendimentoExistente = horarioAtendimentoService.horarioAtendimentoExistente(nomeDoProfessor);

        // Retorna o resultado da verificação
        return horarioAtendimentoExistente;
    }
}