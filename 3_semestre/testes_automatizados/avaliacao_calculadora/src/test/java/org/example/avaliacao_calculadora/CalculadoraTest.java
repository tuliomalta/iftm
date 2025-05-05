package org.example.avaliacao_calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calc;

    @Test
    @DisplayName("Construtor sem parâmetro deve inicializar memória com 0")
    void testConstrutorDefault() {
        Calculadora c = new Calculadora();
        assertEquals(0, c.getMemoria(),
                "Construtor padrão deveria iniciar memória em 0");
    }

    @Test
    @DisplayName("Construtor com parâmetro positivo")
    void testConstrutorComParametroPositivo() {
        Calculadora c = new Calculadora(3);
        assertEquals(3, c.getMemoria(),
                "Memória deve ser inicializada com 3");
    }

    @Test
    @DisplayName("Construtor com parâmetro negativo")
    void testConstrutorComParametroNegativo() {
        Calculadora c = new Calculadora(-3);
        assertEquals(-3, c.getMemoria(),
                "Memória deve ser inicializada com -3");
    }

    @BeforeEach
    void setup() {
        // para todos os testes de operações, iniciar com memória = 3
        calc = new Calculadora(3);
    }

    // somar
    @Test
    @DisplayName("Somar valor positivo")
    void testSomarPositivo() {
        calc.somar(5);
        assertEquals(8, calc.getMemoria());
    }

    @Test
    @DisplayName("Somar valor negativo")
    void testSomarNegativo() {
        calc.somar(-2);
        assertEquals(1, calc.getMemoria());
    }

    // subtrair
    @Test
    @DisplayName("Subtrair valor positivo")
    void testSubtrairPositivo() {
        calc.subtrair(2);
        assertEquals(1, calc.getMemoria());
    }

    @Test
    @DisplayName("Subtrair valor negativo")
    void testSubtrairNegativo() {
        calc.subtrair(-4);
        assertEquals(7, calc.getMemoria());
    }

    // multiplicar
    @Test
    @DisplayName("Multiplicar por valor positivo")
    void testMultiplicarPositivo() {
        calc.multiplicar(4);
        assertEquals(12, calc.getMemoria());
    }

    @Test
    @DisplayName("Multiplicar por valor negativo")
    void testMultiplicarNegativo() {
        calc.multiplicar(-2);
        assertEquals(-6, calc.getMemoria());
    }

    // dividir
    @Test
    @DisplayName("Dividir por zero deve lançar Exception")
    void testDividirPorZero() {
        assertThrows(Exception.class,
                () -> calc.dividir(0),
                "Divisão por zero ou ≤1 deveria lançar Exception");
    }

    @Test
    @DisplayName("Dividir por valor positivo")
    void testDividirPositivo() throws Exception {
        calc.dividir(3);
        assertEquals(1, calc.getMemoria());
    }

    @Test
    @DisplayName("Dividir por valor negativo")
    void testDividirNegativo() throws Exception {
        calc.dividir(-3);
        assertEquals(-1, calc.getMemoria());
    }

    // exponenciação
    @Test
    @DisplayName("Exponenciar por 1")
    void testExponenciarUm() throws Exception {
        calc.exponenciar(1);
        assertEquals(3, calc.getMemoria(),
                "3^1 deve ser 3");
    }

    @Test
    @DisplayName("Exponenciar por 10")
    void testExponenciarDez() throws Exception {
        calc.exponenciar(10);
        assertEquals((int)Math.pow(3, 10), calc.getMemoria(),
                "3^10 deve ser 59049");
    }

    @Test
    @DisplayName("Exponenciar por valor > 10 deve lançar Exception")
    void testExponenciarMaiorQueDez() {
        assertThrows(Exception.class,
                () -> calc.exponenciar(20),
                "Expoente maior que 10 deve lançar Exception");
    }

    // zerar memória
    @Test
    @DisplayName("Zerar memória deve setar 0")
    void testZerarMemoria() {
        calc.zerarMemoria();
        assertEquals(0, calc.getMemoria());
    }
}
