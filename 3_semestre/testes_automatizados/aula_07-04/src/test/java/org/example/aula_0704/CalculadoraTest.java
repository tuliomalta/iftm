package org.example.aula_0704;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculadoraTest {

    /**
     * Teste para verificar se a soma de dois números inteiros positivos está correta.
     * <p><b>Cenário: </b>Somar dois números positivos</p>
     * <p><b>Entrada: </b></p>
     * <p>- numero1 = 2</p>
     * <p>- numero2 = 3</p>
     * <p><b>Saída: </b>5</p>
     */

    @Test
    void somarDoisInteirosPositivos() {

        //arrange
        Calculadora calculadora = new Calculadora();

        int primeiroNumero = 2;
        int segundoNumero = 3;
        int resultadoEsperado = 5;

        //act
        int resultadoObtido = calculadora.somar(primeiroNumero, segundoNumero);

        //assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    /**
     * Teste para verificar se a soma de dois números inteiros um positivo e um negativo.
     * <p><b>Cenário: </b>Somar dois números, um positivo e um negativo</p>
     * <p><b>Entrada: </b></p>
     * <p>- numero1 = 5</p>
     * <p>- numero2 = -3</p>
     * <p><b>Saída: </b>2</p>
     */

    @Test
    void somarInteirosPositivoENegativo() {

        //arrange
        Calculadora calculadora = new Calculadora();

        int primeiroNumero = 5;
        int segundoNumero = -3;
        int resultadoEsperado = 2;

        //act
        int resultadoObtido = calculadora.somar(primeiroNumero, segundoNumero);

        //assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    /**
     * Teste para verificar se a subtração de dois números inteiros positivos está correta.
     * <p><b>Cenário: </b>Subtrair dois números positivos</p>
     * <p><b>Entrada: </b></p>
     * <p>- numero1 = 5</p>
     * <p>- numero2 = 3</p>
     * <p><b>Saída: </b>2</p>
     */

    @Test
    void subtrairDoisInteirosPositivos() {

        //arrange
        Calculadora calculadora = new Calculadora();

        int primeiroNumero = 5;
        int segundoNumero = 3;
        int resultadoEsperado = 2;

        //act
        int resultadoObtido = calculadora.subtrair(primeiroNumero, segundoNumero);

        //assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    /**
     * Teste para verificar se a subtração de dois números inteiros um positivo e um negativo.
     * <p><b>Cenário: </b>Subtrair dois números, um positivo e um negativo</p>
     * <p><b>Entrada: </b></p>
     * <p>- numero1 = 3</p>
     * <p>- numero2 = -2</p>
     * <p><b>Saída: </b>5</p>
     */

    @Test
    void subtrairInteirosPositivoENegativo() {

        //arrange
        Calculadora calculadora = new Calculadora();

        int primeiroNumero = 3;
        int segundoNumero = -2;
        int resultadoEsperado = 5;

        //act
        int resultadoObtido = calculadora.subtrair(primeiroNumero, segundoNumero);

        //assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    /**
     * Teste para verificar se a multiplicação de dois números inteiros positivos está correta.
     * <p><b>Cenário: </b>Multiplicar dois números positivos</p>
     * <p><b>Entrada: </b></p>
     * <p>- numero1 = 2</p>
     * <p>- numero2 = 3</p>
     * <p><b>Saída: </b>6</p>
     */

    @Test
    void multiplicarDoisInteirosPositivos() {

        //arrange
        Calculadora calculadora = new Calculadora();

        int primeiroNumero = 2;
        int segundoNumero = 3;
        int resultadoEsperado = 6;

        //act
        int resultadoObtido = calculadora.multiplicar(primeiroNumero, segundoNumero);

        //assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    /**
     * Teste para verificar se a multiplicação de um número inteiro positivo por zero.
     * <p><b>Cenário: </b>Multiplicar um número inteiro positivo por zero</p>
     * <p><b>Entrada: </b></p>
     * <p>- numero1 = 5</p>
     * <p>- numero2 = 0</p>
     * <p><b>Saída: </b>0</p>
     */

    @Test
    void multiplicarInteiroPositivoEZero() {

        //arrange
        Calculadora calculadora = new Calculadora();

        int primeiroNumero = 5;
        int segundoNumero = 0;
        int resultadoEsperado = 0;

        //act
        int resultadoObtido = calculadora.multiplicar(primeiroNumero, segundoNumero);

        //assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    /**
     * Teste para verificar se a divisão de dois números inteiros positivos está correta.
     * <p><b>Cenário: </b>Dividir dois números positivos</p>
     * <p><b>Entrada: </b></p>
     * <p>- numero1 = 6</p>
     * <p>- numero2 = 3</p>
     * <p><b>Saída: </b>2</p>
     */

    @Test
    void dividirDoisInteirosPositivos() {

        //arrange
        Calculadora calculadora = new Calculadora();

        int primeiroNumero = 2;
        int segundoNumero = 3;
        int resultadoEsperado = 6;

        //act
        int resultadoObtido = calculadora.dividir(primeiroNumero, segundoNumero);

        //assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }

    /**
     * Teste para verificar se a divisão de dois números inteiros positivos com resto.
     * <p><b>Cenário: </b>Dividir dois números positivos com resto</p>
     * <p><b>Entrada: </b></p>
     * <p>- numero1 = 5</p>
     * <p>- numero2 = 2</p>
     * <p><b>Saída: </b>2</p>
     */

    @Test
    void dividirDoisInteirosPositivosComResto() {

        //arrange
        Calculadora calculadora = new Calculadora();

        int primeiroNumero = 5;
        int segundoNumero = 2;
        int resultadoEsperado = 2;

        //act
        int resultadoObtido = calculadora.dividir(primeiroNumero, segundoNumero);

        //assert
        Assertions.assertEquals(resultadoEsperado, resultadoObtido);
    }
}