package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Two float numbers
        System.out.println(" Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.println(" Enter the Second number ");
        float num2 = scanner.nextFloat();

        // Possible outcomes
        System.out.println(" Enter one of the 4 operations: 1.Add, 2.Subtract, 3.Mulitply, 4.Divide ");
        float choice = scanner.nextFloat();

        if (choice == 1) {
            doAdd(num1, num2);
        }
        if (choice == 2) {
           doSubtract(num1, num2);
        }
        if (choice == 3) {
            doMultiply(num1,num2);
        }
        if (choice == 4) {
            doDivide(num1, num2);
        }


    }


    public static void doDivide(float num1, float num2) {
    System.out.println(" Result: " + (num1 / num2));
    }

    public static void doMultiply(float num1, float num2) {
     System.out.println(" Result: " + (num1 * num2));
    }

    public static void doSubtract(float num1, float num2) {
     System.out.println (" Result " + (num1 + num2));
    }

    public static void doAdd(float num1, float num2){
    System.out.println ( " Result " + (num1 - num2));
}


}