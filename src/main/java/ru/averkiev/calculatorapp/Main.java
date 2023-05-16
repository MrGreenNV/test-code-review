package ru.averkiev.calculatorapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Enter the numbers separated by a space: ");
            String[] numbersString = reader.readLine().split(" ");
            double[] numbers = new double[numbersString.length];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Double.parseDouble(numbersString[i]);
            }

            System.out.print("Enter the operation sign: ");
            char operation = (char) System.in.read();

            double res;

            switch (operation) {
                case '+': {
                    res = calculator.addition(numbers);
                    break;
                }
                case '-': {
                    res = calculator.subtraction(numbers);
                    break;
                }
                case '*': {
                    res = calculator.multiplication(numbers);
                    break;
                }
                case '/': {
                    res = calculator.division(numbers);
                    break;
                }
                default: {
                    System.out.println("There is no such operation!");
                    return;
                }
            }

            System.out.printf("Result: %.2f", res);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}