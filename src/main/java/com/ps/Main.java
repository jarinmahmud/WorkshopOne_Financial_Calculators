package com.ps;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Financial Calculator App!");
        System.out.println("Select which calculator you would like to use:");
        System.out.println("1. Mortgage Calculator");
        System.out.println("2. Matured Deposit Calculator");
        System.out.println("3. Present Annuity Calculator");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                mortgageCalculator(scanner);
                break;
            case 2:
                futureValueCalculator(scanner);
                break;
            case 3:
                presentValueAnnuityCalculator(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }

    public static void mortgageCalculator(Scanner scanner) {
        System.out.println("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Enter loan term (in years): ");
        int years = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int months = years * 12;

        double monthlyPayment = principal * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -months));
        double totalInterest = monthlyPayment * months - principal;

        System.out.printf("Your monthly payment will be: $%.2f%n", monthlyPayment);
        System.out.printf("Total interest paid over the life of the loan: $%.2f%n", totalInterest);
    }

    public static void futureValueCalculator(Scanner scanner) {
        System.out.println("Enter initial deposit amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Enter number of years: ");
        int years = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int months = years * 12;

        double futureValue = principal * Math.pow(1 + monthlyInterestRate, months);
        double totalInterest = futureValue - principal;

        System.out.printf("The future value of your deposit will be: $%.2f%n", futureValue);
        System.out.printf("Total interest earned: $%.2f%n", totalInterest);
    }

    public static void presentValueAnnuityCalculator(Scanner scanner) {
        System.out.println("Enter monthly payout amount: ");
        double monthlyPayout = scanner.nextDouble();

        System.out.println("Enter annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Enter number of years: ");
        int years = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int months = years * 12;

        double presentValue = monthlyPayout * (1 - Math.pow(1 + monthlyInterestRate, -months)) / monthlyInterestRate;

        System.out.printf("The present value of the annuity is: $%.2f%n", presentValue);
    }
}
