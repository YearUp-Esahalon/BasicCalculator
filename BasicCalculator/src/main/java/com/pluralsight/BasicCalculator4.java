package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator4 {

    public static void main(String[] args ){
       Scanner Scanner =  new Scanner(System.in);

        // Two floating point numbers
        System.out.println(" What is the first number ?");
        int firstNumber = Scanner.nextInt();

        System.out.println(" What is your second number ?");
        int secondNumber = Scanner.nextInt();

        System.out.println(" Enter one of the 4 operations " + "1:" + "(A)dd, " + "2:(S)ubtract, " + "3:(M)ulitply, " + "4:(D)ivide");
        int optionSelected = Scanner.nextInt();

        if (optionSelected == 1) {
            System.out.println("Result: " + (firstNumber + secondNumber));
        } else if (optionSelected ==2) {
            System.out.println(" Result: " + (firstNumber - secondNumber));
        } else if (optionSelected == 3) {
            System.out.println("Result: " + (firstNumber * secondNumber));
        } else if (optionSelected == 4) {
            System.out.println( "Result: " + (firstNumber / secondNumber));
         }
        }




    }




