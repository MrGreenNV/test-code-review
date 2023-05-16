package ru.averkiev.calculatorapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void outExceptionWithoutParamOrOneParam() {
        Throwable thrown = assertThrows(ArithmeticException.class, () -> {
            calculator.addition();
            calculator.addition(1);

            calculator.multiplication();
            calculator.multiplication(2);

            calculator.division();
            calculator.division(3);

            calculator.subtraction();
            calculator.subtraction(4);
        });
        assertEquals(thrown.getMessage(), "There must be more than two numbers!");
    }

    @Test
    void additional() {
        assertEquals(5, calculator.addition(2, 3));
        assertEquals(10, calculator.addition(1, 2, 3, 4));
    }

    @Test
    void subtraction() {
        assertEquals(7, calculator.subtraction(10, 3));
        assertEquals(10, calculator.subtraction(20, 2, 3, 5));
    }

    @Test
    void outExceptionDivisionByZero() {
        Throwable thrown1 = assertThrows(ArithmeticException.class, () -> calculator.division(2, 2, 0));
        assertEquals(thrown1.getMessage(), "Division by zero is prohibited!");

        Throwable thrown2 = assertThrows(ArithmeticException.class, () ->calculator.division(2, 0, 4));
        assertEquals(thrown2.getMessage(), "Division by zero is prohibited!");

        Throwable thrown3 = assertThrows(ArithmeticException.class, () ->calculator.division(15, 0));
        assertEquals(thrown3.getMessage(), "Division by zero is prohibited!");
    }

    @Test
    void divisional() {
        assertEquals(3.0, calculator.division(15, 5));
        assertEquals(1.0, calculator.division(20, 4, 5));
    }

    @Test
    void multiplication() {
        assertEquals(6, calculator.multiplication(2, 3));
        assertEquals(24, calculator.multiplication(1, 2, 3, 4));
    }
}
