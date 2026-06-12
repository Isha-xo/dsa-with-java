package com.isha.conditionalsandloops;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter value of n: ");
        int n = in.nextInt();
        int sum = 0;
        System.out.println("enter the "+n+" numbers: ");
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            sum = sum + num;
        }

        int avg = sum/n;

        System.out.println("average of "+n+" numbers: "+avg);
    }
}
