/**
 * The Calculator_using_AbstractClass class provides a calculator functionality using abstract classes.
 * It allows the user to perform addition, subtraction, multiplication, and division operations.
 * The user can enter the desired operation and input numbers to perform the calculation.
 * The result is displayed to the console.
 * The user can exit the calculator by choosing the exit option.
 *
 * @author Yaswanth Gadansetti
 */
package com.amrita.jpl.cys21089.ex;

import java.util.Scanner;

abstract class Calculator_abstractClass {
    abstract double calculate(double num1, double num2);
}

class Addition extends Calculator_abstractClass {
    double calculate(double num1, double num2) {
        return num1 + num2;
    }
}

class Subtraction extends Calculator_abstractClass {
    double calculate(double num1, double num2) {
        return num1 - num2;
    }
}

class Multiplication extends Calculator_abstractClass {
    double calculate(double num1, double num2) {
        return num1 * num2;
    }
}

class Division extends Calculator_abstractClass {
    double calculate(double num1, double num2) {
        return num1 / num2;
    }
}

public class Calculator_using_AbstractClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=--- Options ---=");
            System.out.println("1 =-=-> Add");
            System.out.println("2 =-=-> Subtract");
            System.out.println("3 =-=-> Multiply");
            System.out.println("4 =-=-> Divide");
            System.out.println("5 =-=-> Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 5) {
                break;
            }

            System.out.print("Enter 1st number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter 2nd number: ");
            double num2 = scanner.nextDouble();

            Calculator_abstractClass calculator;
            double result;
            switch (choice) {
                case 1 -> {
                    calculator = new Addition();
                    result = calculator.calculate(num1, num2);
                    System.out.println("Addition of the given two numbers: " + result);
                }
                case 2 -> {
                    calculator = new Subtraction();
                    result = calculator.calculate(num1, num2);
                    System.out.println("Subtraction of the given two numbers: " + result);
                }
                case 3 -> {
                    calculator = new Multiplication();
                    result = calculator.calculate(num1, num2);
                    System.out.println("Multiplication of the given two numbers: " + result);
                }
                case 4 -> {
                    calculator = new Division();
                    result = calculator.calculate(num1, num2);
                    System.out.println("Division of the given two numbers: " + result);
                }
                default -> System.out.println("Invalid choice!");
            }
            System.out.println();
        } while (choice != 5);
    }
}
