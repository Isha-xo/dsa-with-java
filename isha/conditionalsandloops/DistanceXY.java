package com.isha.conditionalsandloops;

import java.util.Scanner;

public class DistanceXY {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter coordinates for 1st point: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        System.out.println("Enter the coordinates for 2nd point: ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        double distance = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));

        System.out.println("distancce : "+distance);
    }
}
