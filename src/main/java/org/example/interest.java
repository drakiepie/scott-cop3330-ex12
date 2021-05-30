package org.example;
import java.util.Scanner;

public class interest {
    public static double interestCalc(double Principle, double rate, int years){
        double finalAmt = Principle * (1 + (rate * years) );
        return finalAmt;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double P = input.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();
        double r = rate / 100;

        System.out.print("Enter the number of years: ");
        int t = input.nextInt();

        double finalAmt = interestCalc(P, r, t);

        System.out.print("After " + t + " years at " + rate + "%, the investment will be worth ");
        System.out.printf("$%,.2f.", finalAmt);

    }
}
