package com.isha.conditionalsandloops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fact = 1;
        System.out.println("enter a number: ");
        int n = in.nextInt();

        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }

        System.out.println("factorial of "+n+" is: "+fact);
    }
}
