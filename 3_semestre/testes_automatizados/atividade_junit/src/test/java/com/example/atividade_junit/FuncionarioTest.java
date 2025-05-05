package com.example.atividade_junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    // 1) Cenários do construtor / setters para nome
    @Test
    void construtorNomeVazioDeveDarErro() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> new Funcionario("", 20, Funcionario.VALOR_HORA_MIN)
        );
        assertEquals("Nome não pode ser vazio.", ex.getMessage());
    }

    @Test
    void construtorNomeNuloDeveDarErro() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> new Funcionario(null, 20, Funcionario.VALOR_HORA_MIN)
        );
        assertEquals("Nome não pode ser vazio.", ex.getMessage());
    }

    @Test
    void nomeValidoDeveSerAceito() {
        Funcionario f = new Funcionario("Ana", 20, Funcionario.VALOR_HORA_MIN);
        assertEquals("Ana", f.getNome());
    }

    // 2) Horas trabalhadas
    @Test
    void horasAbaixoDoMinimoDeveDarErro() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> new Funcionario("João", 10, Funcionario.VALOR_HORA_MIN)
        );
        assertTrue(ex.getMessage().contains("entre 20 e 40"));
    }

    @Test
    void horasAcimaDoMaximoDeveDarErro() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> new Funcionario("João", 50, Funcionario.VALOR_HORA_MIN)
        );
        assertTrue(ex.getMessage().contains("entre 20 e 40"));
    }

    @Test
    void horasValidasDeveSerAceito() {
        Funcionario f = new Funcionario("João", 30, Funcionario.VALOR_HORA_MIN);
        assertEquals(30, f.getHorasTrabalhadas());
    }

    // 3) Valor por hora
    @Test
    void valorHoraAbaixoDoMinimoDeveDarErro() {
        double abaixo = Funcionario.VALOR_HORA_MIN - 1;
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> new Funcionario("Maria", 20, abaixo)
        );
        assertTrue(ex.getMessage().contains("entre 4% e 10%"));
    }

    @Test
    void valorHoraAcimaDoMaximoDeveDarErro() {
        double acima = Funcionario.VALOR_HORA_MAX + 1;
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> new Funcionario("Maria", 20, acima)
        );
        assertTrue(ex.getMessage().contains("entre 4% e 10%"));
    }

    @Test
    void valorHoraValidoDeveSerAceito() {
        Funcionario f = new Funcionario("Maria", 20, Funcionario.VALOR_HORA_MIN);
        assertEquals(Funcionario.VALOR_HORA_MIN, f.getValorHora());
    }

    // 4) Cálculo de pagamento
    @Test
    void calcularPagamentoAbaixoDoMinimoDeveErro() {
        Funcionario f = new Funcionario("Pedro", 20, Funcionario.VALOR_HORA_MIN - 1);
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                f::calcularPagamento
        );
        assertEquals("Pagamento inferior ao salário mínimo.", ex.getMessage());
    }

    @Test
    void calcularPagamentoValidoDeveRetornarValor() {
        // 20 * 80 = 1600 >= 1518
        Funcionario f = new Funcionario("Pedro", 20, 80);
        assertEquals(1600, f.calcularPagamento());
    }

    @Test
    void calcularPagamentoAcimaDoTetoDeveErro() {
        // Simula um cenário (mesmo que não ocorra em produção)
        Funcionario f = new Funcionario("Pedro", 40, Funcionario.VALOR_HORA_MAX);
        // via reflexão forçamos valorHora pra testar teto
        java.lang.reflect.Field field = Funcionario.class.getDeclaredField("valorHora");
        field.setAccessible(true);
        field.setDouble(f, 3000.0);
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                f::calcularPagamento
        );
        assertEquals("Pagamento acima do teto permitido.", ex.getMessage());
    }
}
