package com.jm;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Which Calculator would you like to use? (b)asic or (s)cientific?");

        String command = scanner.nextLine();
        // nextLine is asking the user for a command

        switch (command.toLowerCase()) {

            case "b":
                runBasicCalculator();
                break;
            case "s":
                runScientificCalculator();
                break;
            default:
                System.out.println("Command not found");

        }


    }

    public static void runBasicCalculator() {
        System.out.println("Run basic calculator");
        //Operation
        //num1
        //num2
        System.out.println("What operation would you like to perform?");
        System.out.println("1: add \n 2: subtract \n 3: multiply \n 4: divide \n 5: modulo ");

        int operation = scanner.nextInt();

        System.out.println("Whats the first number?");
        int numberOne = scanner.nextInt();
        System.out.println("Whats the second number?");
        int numberTwo = scanner.nextInt();

        System.out.println("Op: " + operation + ", num1:  " + numberOne + ", num2:  " + numberTwo);

        switch (operation) {
            case 1:
                System.out.println("Your result is " + (numberOne + numberTwo));
                break;
            case 2:
                System.out.println("Your result is " + (numberOne - numberTwo));
                break;

            case 3:
                System.out.println("Your result is " + (numberOne * numberTwo));
                break;
            case 4:
                System.out.println("Your result is " + (numberOne / numberTwo));
                break;
            case 5:
                System.out.println("Your result is " + (numberOne % numberTwo));
                break;
            default:
                System.out.println("Operation not found");
        }


    }

    public static void runScientificCalculator() {
        System.out.println("Run scientific calculator");

    }

}