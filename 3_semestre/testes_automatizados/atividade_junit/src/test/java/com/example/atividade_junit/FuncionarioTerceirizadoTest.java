package com.example.atividade_junit;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTerceirizadoTest {

    // 1) Despesa adicional
    @Test
    void despesaAdicionalAcimaDoMaximoDeveDarErro() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> new FuncionarioTerceirizado("Tânia", 20, Funcionario.VALOR_HORA_MIN, 2000)
        );
        assertEquals("A despesa adicional não pode ultrapassar R$ 1000.00.", ex.getMessage());
    }

    @Test
    void despesaAdicionalNegativaDeveDarErro() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> new FuncionarioTerceirizado("Tânia", 20, Funcionario.VALOR_HORA_MIN, -1)
        );
        assertEquals("A despesa adicional não pode ultrapassar R$ 1000.00.", ex.getMessage());
    }

    @Test
    void despesaValidaDeveSerAceita() {
        FuncionarioTerceirizado ft = new FuncionarioTerceirizado("Tânia", 20, Funcionario.VALOR_HORA_MIN, 500);
        assertEquals(500, ft.getDespesaAdicional());
    }

    // 2) Herda todas as validações de Funcionario para horas e valorHora
    @Test
    void horasInvalidasNoTerceirizadoDeveDarErro() {
        assertThrows(IllegalArgumentException.class,
                () -> new FuncionarioTerceirizado("Tânia", 10, Funcionario.VALOR_HORA_MIN, 100)
        );
    }

    @Test
    void valorHoraInvalidNoTerceirizadoDeveDarErro() {
        assertThrows(IllegalArgumentException.class,
                () -> new FuncionarioTerceirizado("Tânia", 20, Funcionario.VALOR_HORA_MIN - 1, 100)
        );
    }

    // 3) Cálculo de pagamento com bônus de 110%
    @Test
    void calcularPagamentoTerceirizadoValido() {
        // 20*80 =1600 + 100*1.1 =110  → 1710
        FuncionarioTerceirizado ft = new FuncionarioTerceirizado("Tânia", 20, 80, 100);
        assertEquals(1710, ft.calcularPagamento(), 0.0001);
    }

    @Test
    void calcularPagamentoTerceirizadoAbaixoDoMinimoDeveErro() {
        // 20*60 =1200 + 0  → 1200 < 1518
        FuncionarioTerceirizado ft = new FuncionarioTerceirizado("Tânia", 20, 60.0, 0);
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                ft::calcularPagamento
        );
        assertEquals("Pagamento inferior ao salário mínimo.", ex.getMessage());
    }

    @Test
    void calcularPagamentoTerceirizadoAcimaDoTetoDeveErro() throws Exception {
        // mesmo artifício de reflexão para disparar o teto
        FuncionarioTerceirizado ft = new FuncionarioTerceirizado("Tânia", 20, Funcionario.VALOR_HORA_MAX, 100);
        java.lang.reflect.Field field = Funcionario.class.getDeclaredField("valorHora");
        field.setAccessible(true);
        field.setDouble(ft, 3000.0);
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                ft::calcularPagamento
        );
        assertEquals("Pagamento acima do teto permitido.", ex.getMessage());
    }
}
