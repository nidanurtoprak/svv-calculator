/**
 * B211202057
 * Nidanur Toprak
 * Software Verification and Validation 1. Homework
 * https://github.com/nidanurtoprak/svv-calculator
 */

package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"10,2,5", "10,4,2.5", "12.5,2.5,5", "10,2.5,4", "12.5,5,2.5"})
    void testDivision(String data) {
        String[] parts = data.split(",");
        float dividend = Float.parseFloat(parts[0]);
        float divisor = Float.parseFloat(parts[1]);
        float expected = Float.parseFloat(parts[2]);
        assertEquals(expected, Calculator.divide(dividend, divisor));
    }
}
