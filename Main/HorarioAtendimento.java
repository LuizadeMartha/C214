package Main;

public class HorarioAtendimento {

    // Atributos da classe que armazenam as informações do horário de atendimento
    private String nomeDoProfessor;  // Nome do professor
    private String horarioAtendimento;  // Horário de atendimento
    private String periodo;  // Período (Integral ou Noturno)
    private int sala;  // Número da sala de atendimento
    private String predio;  // Prédio onde a sala está localizada

    // Construtor da classe que inicializa todos os atributos
    public HorarioAtendimento(
            String nomeDoProfessor,
            String horarioAtendimento,
            String periodo,
            int sala,
            String predio) {
        this.nomeDoProfessor = nomeDoProfessor;
        this.horarioAtendimento = horarioAtendimento;
        this.periodo = periodo;
        this.sala = sala;
        this.predio = predio;
    }

    // Método para obter o nome do professor
    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }

    // Método para definir o nome do professor
    public void setNomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    // Método para obter o horário de atendimento
    public String getHorarioAtendimento() {
        return horarioAtendimento;
    }

    // Método para definir o horário de atendimento
    public void setHorarioAtendimento(String horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }

    // Método para obter o período (Integral ou Noturno)
    public String getPeriodo() {
        return periodo;
    }

    // Método para definir o período (Integral ou Noturno)
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    // Método para obter o número da sala de atendimento
    public int getSala() {
        return sala;
    }

    // Método para definir o número da sala de atendimento
    public void setSala(int sala) {
        this.sala = sala;
    }

    // Método para obter o prédio onde a sala está localizada
    public String getPredio() {
        return predio;
    }

    // Método para definir o prédio onde a sala está localizada
    public void setPredio(String predio) {
        this.predio = predio;
    }
}
