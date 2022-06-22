package com.basic_core_programs;

import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args) {
        System.out.println("Compute Quotient and Remainder");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend");
        int dividend = sc.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Dividend");
        int divisor = scan.nextInt();
        int remainder = dividend%divisor;
        int quotient = dividend/divisor;
        System.out.println("Quotient= " + quotient);
        System.out.println("Remainder= " + remainder);


    }
}
