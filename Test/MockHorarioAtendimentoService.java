package Test;

import Main.HorarioAtendimentoService;
import Test.HorarioAtendimento2;

import java.util.ArrayList;

public class MockHorarioAtendimentoService implements HorarioAtendimentoService {

    @Override
    public String buscaHorarioAtendimento(String nomeDoProfessor) {
        // Verifica o nome do professor e retorna o horário de atendimento correspondente
        if (nomeDoProfessor.equals("SONED")) {
            return HorarioAtendimento2.SONED; // Retorna o horário de SONED
        } else if (nomeDoProfessor.equals("JUNIOR")) {
            return HorarioAtendimento2.JUNIOR; // Retorna o horário de JUNIOR
        } else if (nomeDoProfessor.equals("VITOR")) {
            return HorarioAtendimento2.VITOR; // Retorna o horário de VITOR
        } else if (nomeDoProfessor.equals("LUCAS")) {
            return HorarioAtendimento2.LUCAS; // Retorna o horário de LUCAS
        } else if (nomeDoProfessor.equals("MARCIO")) {
            return HorarioAtendimento2.MARCIO; // Retorna o horário de MARCIO
        } else {
            return HorarioAtendimento2.INEXISTENTE; // Retorna INEXISTENTE se o nome do professor não for encontrado
        }
    }

    @Override
    public boolean horarioAtendimentoExistente(String nomeDoProfessor) {
        // Cria uma lista com os nomes dos professores existentes
        ArrayList<String> list = new ArrayList<>();
        list.add("SONED");
        list.add("JUNIOR");
        list.add("VITOR");
        list.add("LUCAS");
        list.add("MARCIO");

        // Verifica se o nome do professor está na lista e retorna o resultado
        return list.contains(nomeDoProfessor);
    }

}