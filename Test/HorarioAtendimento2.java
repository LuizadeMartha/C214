package Test;

public class HorarioAtendimento2 {

    // Sala 18 está no intervalo (16-20), portanto, o prédio deve ser "4"
    public static String SONED =
            "{\"nomeDoProfessor\": \"SONDED\", \n" +
                    "\"horarioDeAtendimento\": \"20h00\", \n" +
                    "\"periodo\": \"Noturno\", \n" +
                    "\"sala\": 18, \n" +
                    "\"predio\":[\"4\"]}";

    // Sala 16 está no intervalo (16-20), portanto, o prédio deve ser "4"
    public static String JUNIOR =
            "{\"nomeDoProfessor\": \"JUNIOR\", \n" +
                    "\"horarioDeAtendimento\": \"19h00\", \n" +
                    "\"periodo\": \"Noturno\", \n" +
                    "\"sala\": 16, \n" +
                    "\"predio\":[\"4\"]}";

    // Sala 20 está no intervalo (16-20), portanto, o prédio deve ser "4"
    public static String VITOR =
            "{\"nomeDoProfessor\": \"VITOR\", \n" +
                    "\"horarioDeAtendimento\": \"18h00\", \n" +
                    "\"periodo\": \"Noturno\", \n" +
                    "\"sala\": 20, \n" +
                    "\"predio\":[\"4\"]}";

    // Sala 11 está no intervalo (11-15), portanto, o prédio deve ser "3"
    public static String LUCAS =
            "{\"nomeDoProfessor\": \"LUCAS\", \n" +
                    "\"horarioDeAtendimento\": \"13h00\", \n" +
                    "\"periodo\": \"Integral\", \n" +
                    "\"sala\": 11, \n" +
                    "\"predio\":[\"3\"]}";

    // Sala 7 está no intervalo (6-10), portanto, o prédio deve ser "2"
    public static String MARCIO =
            "{\"nomeDoProfessor\": \"MarcIO\", \n" +
                    "\"horarioDeAtendimento\": \"10h00\", \n" +
                    "\"periodo\": \"Integral\", \n" +
                    "\"sala\": 7, \n" +
                    "\"predio\":[\"2\"]}";

    // Sala 0 é um caso inválido, não se encaixa nos intervalos esperados
    public static String INEXISTENTE =
            "{\"nomeDoProfessor\": \"Inexistente\", \n" +
                    "\"horarioDeAtendimento\": \"NULL\", \n" +
                    "\"periodo\": \"NULL\", \n" +
                    "\"sala\": 0, \n" +
                    "\"predio\": [\"0\"]}";
}