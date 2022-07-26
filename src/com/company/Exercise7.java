package com.company;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number:");
        int num3 = sc.nextInt();
        //checking for the second largest number
        if (num1 > num2 && num1 < num3)
            System.out.println(num1 + " is the secondlargest number.");

        else if (num2 > num1 && num2 < num3)
            System.out.println(num2 + " is the secondlargest number.");

        else
            System.out.println(num3 + " is the secondlargest number.");

    }}
