package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main (String[] args ){
       Scanner scanner = new Scanner(System.in);
       // Two float numbers
        System.out.println(" Enter the first number: ");
        Float num1 = scanner.nextFloat();

        System.out.println(" Enter the Second number ");
        Float num2 = scanner.nextFloat();

        // Possible outcomes
        System.out.println(" Enter one of the 4 operations: 1.Add, 2.Subtract, 3.Mulitply, 4.Divide ");
        int choice = scanner.nextInt();

        if (choice== 1) {
            System.out.println("Result: " + (num1 + num2));
        }
        if (choice== 2) {
            System.out.println("Result: " + (num1 - num2));
        }
        if (choice== 3) {
            System.out.println("Result: " + (num1 * num2));
        }
        if (choice== 4) {
            System.out.println("Result: " + (num1 / num2));
        }
        scanner.close();


        }




}



