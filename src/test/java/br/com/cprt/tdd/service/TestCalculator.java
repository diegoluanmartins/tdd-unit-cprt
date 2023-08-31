package br.com.cprt.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalculator {

    @Test
    void sumTwoPositiveNumber(){
        Calculator calculator = new Calculator();
        int sum = calculator.sum(6, 6);
        assertEquals(12, sum, "sum correct");
    }

    @Test
    void sumWithONeNegativeNumber(){
        Calculator calculator = new Calculator();
        int sum = calculator.sum(6, -3);
        assertEquals(3, sum, "sum correct");
    }

}
