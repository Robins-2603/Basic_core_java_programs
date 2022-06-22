package com.basic_core_programs;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        System.out.println("welcome to Leap year program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the (4 digit)Year you want to check");
        int year = sc.nextInt();
        if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
            System.out.println(year + " Is a leap year");
        }
        else {
            System.out.println(year + " Is not a leap year");
        }

    }
}
