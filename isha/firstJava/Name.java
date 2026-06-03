package com.isha.firstJava;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name please: ");

        String name = input.nextLine();

        System.out.println("Hi there! "+ name + ". Welcome to coding with Isha! ");
    }
}
