package com.isha.conditionalsandloops;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter shape: ");
        String shape = in.next();

        switch (shape){
            case "circle" -> {
                System.out.print("enter radius of cirle: ");
                float radius = in.nextFloat();
                float area = (float)(Math.PI * radius * radius);
                System.out.println(area);
            }
            case "triangle" -> {
                System.out.print("enter h and b: ");
                float h = in.nextFloat();
                float b = in.nextFloat();
                float area = (float)(0.5 * h * b);
                System.out.println(area);
            }
            case "rectangle" -> {
                System.out.print("enter l and b of rectangle: ");
                float l = in.nextFloat();
                float b = in.nextFloat();
                float area = l * b;
                System.out.println(area);
            }
            case "isosceles" -> {
                System.out.print("enter h and b of isosceles: ");
                float h = in.nextFloat();
                float b = in.nextFloat();
                float area = (float)(0.5 * h * b);
                System.out.println(area);
            }
            case "rhombus" -> {
                System.out.print("enter p and q of rhombus: ");
                float p = in.nextFloat();
                float q = in.nextFloat();
                float area = (float)(0.5 * p * q);
                System.out.println(area);
            }
            case "parallelogram" -> {
                System.out.print("enter h and b of parallelogram: ");
                float h = in.nextFloat();
                float b = in.nextFloat();
                float area = h * b;
                System.out.println(area);
            }
            case "equilateral" -> {
                System.out.print("enter side of triangle: ");
                float a = in.nextFloat();
                float area = (float)((Math.sqrt(3)/4) * a * a);
                System.out.println(area);
            }
            default -> System.out.println("enter correct shape!!");
        }
    }
}
