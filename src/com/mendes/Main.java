package com.mendes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char operator;
        double number1;
        double number2;
        double result;

        System.out.println("enter first number: ");
        number1 = scanner.nextDouble();
        System.out.println("enter second number: ");
        number2 = scanner.nextDouble();
        System.out.println("choose an operator: +, -, *, /");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("first number: " + number1 + " second number: " + number2 + " operator: " + operator);
                System.out.println(number1 + "+" + number2 + "=" + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("first number: " + number1 + " second number: " + number2 + " operator: " + operator);
                System.out.println(number1 + "-" + number2 + "=" + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("first number: " + number1 + " second number: " + number2 + " operator: " + operator);
                System.out.println(number1 + "*" + number2 + "=" + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println("first number: " + number1 + " second number: " + number2 + " operator: " + operator);
                System.out.println(number1 + "/" + number2 + "=" + result);
                break;
            default:
                System.out.println("invalid operator...");
                break;
        }
        scanner.close();
    }
}
