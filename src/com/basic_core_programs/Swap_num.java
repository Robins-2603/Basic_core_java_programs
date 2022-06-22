package com.basic_core_programs;

public class Swap_num {
    public static void  main(String[] args){
        // variables
        int a = 11;
        int b = 55;
        int swap;
        System.out.println("Current values of a and b: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        //Swapping
        swap = a;
        a = b;
        b = swap;
        System.out.println("After swapping the two numbers: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
