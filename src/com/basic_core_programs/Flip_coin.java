package com.basic_core_programs;

import java.util.Random;
import java.util.Scanner;

public class Flip_coin {
    public static void main(String[] args) {
        System.out.println("welcome to flip coin");
        int number_of_flip;
        double head = 0;
        double tails = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of flip you want");
        number_of_flip = scan.nextInt();
        for ( int i = 1; i <= number_of_flip; i++){
            double flip = Math.random();
            if (flip < 0.5) {
                System.out.println("Head");
                head++;
            }
            else {
                System.out.println("Tails");
                tails++;
            }
        }
        System.out.println("Total Heads = "+ head);
        System.out.println("Total tails = "+ tails);
        //Percentage
        double per = (head/number_of_flip)*100;
        double per2 = (tails/number_of_flip)*100;
        System.out.println("Percentage of Heads "+ per);
        System.out.println("Percentage of Tails "+ per2);

    }
}