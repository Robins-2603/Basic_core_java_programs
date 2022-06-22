package com.basic_core_programs;

import java.util.Scanner;

public class Power_of_2 {
    //public static final int i = 30;
    public static void main(String[] args){
        //Variable declaration
        int num = 2;
        //The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power: ");
        N = sc.nextInt();
        for(int i=1; i<=N; i++){
            //printing the table of power of 2.
            System.out.println("2^" + i + ": " + (int)Math.pow(num , i)); //typecasting
        }
        double powerValue = (double)Math.pow(num , N);
        System.out.println(num + " to the power of " + N + " is " + powerValue);
    }
}
