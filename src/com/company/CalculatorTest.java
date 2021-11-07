package com.company;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void sum() {
        double first = 10;
        double second = 20;
        Calculator calculator = new Calculator();

        double result = calculator.Sum(first,second);

        assertEquals(30,result);
    }
}