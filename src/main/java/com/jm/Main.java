package com.jm;


import java.sql.SQLOutput;
import java.util.*;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        //takes principal, interest rate and loan length as input
        //output would be monthly payment and total interest paid

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        double principal = scanner.nextDouble();

        System.out.println("Interest Rate: ");
        double interest_rate = scanner.nextDouble();

        System.out.println("Loan Length");
        double loan_length = scanner.nextDouble();

        System.out.println("Number of times interest compounded: ");
        double n = scanner.nextDouble();

        double total_compound_interest = principal *(pow ((1 + (interest_rate/n)), (loan_length * n)));
        double monthly_compound_interest =  total_compound_interest - principal;

        System.out.println("Total Compound Interest is " + total_compound_interest + ".");
        System.out.println("Monthly Compound Interest is " + monthly_compound_interest + ".");


    }


}