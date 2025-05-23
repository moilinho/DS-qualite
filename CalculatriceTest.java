package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatriceTest {

    Calculatrice calc = new Calculatrice();

    @Test
    void testAdd() {
        assertEquals(5.0f, calc.add(2.0f, 3.0f), 0.001);
    }

    @Test
    void testMult() {
        assertEquals(6.0f, calc.mult(2.0f, 3.0f), 0.001);
    }

    @Test
    void testDiv() {
        assertEquals(2.0f, calc.div(6.0f, 3.0f), 0.001);
    }

    @Test
    void testDivByZero() {
        assertThrows(ArithmeticException.class, () -> calc.div(5.0f, 0.0f));
    }

    @Test
    void testMinus() {
        assertEquals(1.0f, calc.minus(4.0f, 3.0f), 0.001);
    }

    @Test
    void testMinusNegativeResult() {
        assertEquals(-2.0f, calc.minus(1.0f, 3.0f), 0.001);
    }
}
