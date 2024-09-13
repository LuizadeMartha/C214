package Test.mockito;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import Main.BuscaHorarioAtendimento;
import Main.HorarioAtendimento;
import Main.HorarioAtendimentoService;
import Test.HorarioAtendimento2;

@RunWith(MockitoJUnitRunner.class)
public class TesteBuscaHorarioAtendimento {

    @Mock
    private HorarioAtendimentoService service; // Mock do serviço que será injetado na classe a ser testada
    private BuscaHorarioAtendimento buscaHorarioAtendimento;

    @Before
    public void setup() {
        buscaHorarioAtendimento = new BuscaHorarioAtendimento(service); // Inicializa a classe a ser testada com o mock
    }

    // Testes de Sucesso

    @Test
    public void testeBuscaNomeDoProfessorSonied() {
        // Configura o mock para retornar o objeto SONED quando o nome do professor é "SONED"
        Mockito.when(service.buscaHorarioAtendimento("SONED")).thenReturn(HorarioAtendimento2.SONED);

        // Executa o método a ser testado
        HorarioAtendimento soned = buscaHorarioAtendimento.buscaHorarioAtendimento("SONED");

        // Verifica se o nome do professor está correto
        assertEquals("SONED", soned.getNomeDoProfessor());
    }

    @Test
    public void testeBuscaHorarioAtendimentoJunior() {
        // Configura o mock para retornar o objeto JUNIOR quando o nome do professor é "JUNIOR"
        Mockito.when(service.buscaHorarioAtendimento("JUNIOR")).thenReturn(HorarioAtendimento2.JUNIOR);

        // Executa o método a ser testado
        HorarioAtendimento junior = buscaHorarioAtendimento.buscaHorarioAtendimento("JUNIOR");

        // Verifica se o horário de atendimento está correto
        assertEquals("19h00", junior.getHorarioAtendimento());
    }

    @Test
    public void testeBuscaPeriodoLucas() {
        // Configura o mock para retornar o objeto LUCAS quando o nome do professor é "LUCAS"
        Mockito.when(service.buscaHorarioAtendimento("LUCAS")).thenReturn(HorarioAtendimento2.LUCAS);

        // Executa o método a ser testado
        HorarioAtendimento lucas = buscaHorarioAtendimento.buscaHorarioAtendimento("LUCAS");

        // Verifica se o período está correto
        assertEquals("Integral", lucas.getPeriodo());
    }

    @Test
    public void testeBuscaSalaMarcio() {
        // Configura o mock para retornar o objeto MARCIO quando o nome do professor é "MARCIO"
        Mockito.when(service.buscaHorarioAtendimento("MARCIO")).thenReturn(HorarioAtendimento2.MARCIO);

        // Executa o método a ser testado
        HorarioAtendimento marcio = buscaHorarioAtendimento.buscaHorarioAtendimento("MARCIO");

        // Verifica se a sala está correta
        assertEquals(7, marcio.getSala());
    }

    @Test
    public void testeBuscaPredioSonied() {
        // Configura o mock para retornar o objeto SONED quando o nome do professor é "SONED"
        Mockito.when(service.buscaHorarioAtendimento("SONED")).thenReturn(HorarioAtendimento2.SONED);

        // Executa o método a ser testado
        HorarioAtendimento soned = buscaHorarioAtendimento.buscaHorarioAtendimento("SONED");

        // Verifica se o prédio está correto
        assertEquals("4", soned.getPredio());
    }

    @Test
    public void testeBuscaNomeDoProfessorLucas() {
        // Configura o mock para retornar o objeto LUCAS quando o nome do professor é "LUCAS"
        Mockito.when(service.buscaHorarioAtendimento("LUCAS")).thenReturn(HorarioAtendimento2.LUCAS);

        // Executa o método a ser testado
        HorarioAtendimento lucas = buscaHorarioAtendimento.buscaHorarioAtendimento("LUCAS");

        // Verifica se o nome do professor está correto
        assertEquals("LUCAS", lucas.getNomeDoProfessor());
    }

    @Test
    public void testeBuscaHorarioAtendimentoMarcio() {
        // Configura o mock para retornar o objeto MARCIO quando o nome do professor é "MARCIO"
        Mockito.when(service.buscaHorarioAtendimento("MARCIO")).thenReturn(HorarioAtendimento2.MARCIO);

        // Executa o método a ser testado
        HorarioAtendimento marcio = buscaHorarioAtendimento.buscaHorarioAtendimento("MARCIO");

        // Verifica se o horário de atendimento está correto
        assertEquals("10h00", marcio.getHorarioAtendimento());
    }

    @Test
    public void testeBuscaPeriodoMarcio() {
        // Configura o mock para retornar o objeto MARCIO quando o nome do professor é "MARCIO"
        Mockito.when(service.buscaHorarioAtendimento("MARCIO")).thenReturn(HorarioAtendimento2.MARCIO);

        // Executa o método a ser testado
        HorarioAtendimento marcio = buscaHorarioAtendimento.buscaHorarioAtendimento("MARCIO");

        // Verifica se o período está correto
        assertEquals("Integral", marcio.getPeriodo());
    }

    @Test
    public void testeBuscaSalaLucas() {
        // Configura o mock para retornar o objeto LUCAS quando o nome do professor é "LUCAS"
        Mockito.when(service.buscaHorarioAtendimento("LUCAS")).thenReturn(HorarioAtendimento2.LUCAS);

        // Executa o método a ser testado
        HorarioAtendimento lucas = buscaHorarioAtendimento.buscaHorarioAtendimento("LUCAS");

        // Verifica se a sala está correta
        assertEquals(11, lucas.getSala());
    }

    @Test
    public void testeBuscaPredioJunior() {
        // Configura o mock para retornar o objeto JUNIOR quando o nome do professor é "JUNIOR"
        Mockito.when(service.buscaHorarioAtendimento("JUNIOR")).thenReturn(HorarioAtendimento2.JUNIOR);

        // Executa o método a ser testado
        HorarioAtendimento junior = buscaHorarioAtendimento.buscaHorarioAtendimento("JUNIOR");

        // Verifica se o prédio está correto
        assertEquals("4", junior.getPredio());
    }

    @Test
    public void testeHorarioAtendimentoExistente() {
        // Configura o mock para indicar que o horário de atendimento existe para o nome "SONED"
        Mockito.when(service.horarioAtendimentoExistente("SONED")).thenReturn(true);

        // Verifica se a verificação do horário de atendimento é verdadeira
        assertTrue(buscaHorarioAtendimento.verificaArrayListExistente("SONED"));
    }

    // Testes de Falha

    @Test
    public void testeBuscaNomeDoProfessorVitorFalha() {
        // Configura o mock para retornar o objeto VITOR quando o nome do professor é "VITOR"
        Mockito.when(service.buscaHorarioAtendimento("VITOR")).thenReturn(HorarioAtendimento2.VITOR);

        // Executa o método a ser testado
        HorarioAtendimento vitor = buscaHorarioAtendimento.buscaHorarioAtendimento("VITOR");

        // Verifica se o nome do professor está incorreto
        assertNotEquals("VITOR_FALHA", vitor.getNomeDoProfessor());
    }

    @Test
    public void testeBuscaHorarioAtendimentoLucasFalha() {
        // Configura o mock para retornar o objeto LUCAS quando o nome do professor é "LUCAS"
        Mockito.when(service.buscaHorarioAtendimento("LUCAS")).thenReturn(HorarioAtendimento2.LUCAS);

        // Executa o método a ser testado
        HorarioAtendimento lucas = buscaHorarioAtendimento.buscaHorarioAtendimento("LUCAS");

        // Verifica se o horário de atendimento está incorreto
        assertNotEquals("14h00", lucas.getHorarioAtendimento());
    }

    @Test
    public void testeBuscaPeriodoJuniorFalha() {
        // Configura o mock para retornar o objeto JUNIOR quando o nome do professor é "JUNIOR"
        Mockito.when(service.buscaHorarioAtendimento("JUNIOR")).thenReturn(HorarioAtendimento2.JUNIOR);

        // Executa o método a ser testado
        HorarioAtendimento junior = buscaHorarioAtendimento.buscaHorarioAtendimento("JUNIOR");

        // Verifica se o período está incorreto
        assertNotEquals("Integral", junior.getPeriodo());
    }

    @Test
    public void testeBuscaSalaMarcioFalha() {
        // Configura o mock para retornar o objeto MARCIO quando o nome do professor é "MARCIO"
        Mockito.when(service.buscaHorarioAtendimento("MARCIO")).thenReturn(HorarioAtendimento2.MARCIO);

        // Executa o método a ser testado
        HorarioAtendimento marcio = buscaHorarioAtendimento.buscaHorarioAtendimento("MARCIO");

        // Verifica se a sala está incorreta
        assertNotEquals(6, marcio.getSala());
    }

    @Test
    public void testeBuscaPredioLucasFalha() {
        // Configura o mock para retornar o objeto LUCAS quando o nome do professor é "LUCAS"
        Mockito.when(service.buscaHorarioAtendimento("LUCAS")).thenReturn(HorarioAtendimento2.LUCAS);

        // Executa o método a ser testado
        HorarioAtendimento lucas = buscaHorarioAtendimento.buscaHorarioAtendimento("LUCAS");

        // Verifica se o prédio está incorreto
        assertNotEquals("2", lucas.getPredio());
    }
}
