package com.mortageCalculatorPackage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //principal value
        System.out.print("Principal: ");
        float principal = scan.nextFloat();

        // divide by 100 to get a percentage then divide by 12 to get monthly interest rate
        System.out.print("Annual Interest Rate: ");
        float rate = (scan.nextFloat() / 100) / 12;

        // multiply by 12 to find number of months in the years entered
        System.out.print("Period(years): ");
        float period = scan.nextFloat() * 12;

        // portion of the equation to calculate mortgage
        float equation = (float) (Math.pow(rate + 1, period));
        // calculates the mortgage
        float mortgageCalc = principal * ((rate * equation) / (equation - 1));

        // converts mortgage into string and formats it
        String mortgage = NumberFormat.getCurrencyInstance().format(mortgageCalc);

        //prints mortgage
        System.out.println("\nMortgage: " + mortgage);

    }
}
