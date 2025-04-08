package org.example.aula_0704;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Aula0704ApplicationTests {

    @Test
    void contextLoads() {
        (new CalculadoraTest()).somarDoisInteirosPositivos();
    }

}
