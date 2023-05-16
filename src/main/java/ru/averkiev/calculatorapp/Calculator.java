package ru.averkiev.calculatorapp;

import java.util.Arrays;

public class Calculator {

    public double addition(double... numbers) {

        if (numbers.length < 2) {
            throw new ArithmeticException("There must be more than two numbers!");
        }
        return Arrays.stream(numbers).sum();
    }

    public double multiplication(double... numbers) {

        if (numbers.length < 2) {
            throw new ArithmeticException("There must be more than two numbers!");
        }

        double res = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] == 0) {
                throw new ArithmeticException("Division by zero is prohibited!");
            }
            res = res * numbers[i];
        }
        return res;
    }

    public double division(double... numbers) {

        if (numbers.length < 2) {
            throw new ArithmeticException("There must be more than two numbers!");
        }

        double res = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                throw new ArithmeticException("Division by zero is prohibited!");
            }
            res = res / numbers[i];
        }
        return res;
    }

    public double subtraction(double... numbers) {

        if (numbers.length < 2) {
            throw new ArithmeticException("There must be more than two numbers!");
        }

        double res = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] == 0) {
                throw new ArithmeticException("Division by zero is prohibited!");
            }
            res = res - numbers[i];
        }
        return res;
    }
}