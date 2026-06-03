package com.isha.firstJava;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--Enter the values--");
        System.out.print("Principal amount:");
        float P = input.nextFloat();
        System.out.print("Rate:");
        float I = input.nextFloat();
        System.out.print("Time: ");
        int T = input.nextInt();

        float SI = (P*I*T)/100;

        System.out.println("Simple Interest: " + SI);
    }
}
