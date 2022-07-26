package com.company;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        // Uchta raqam berilgan. Ularning eng kichigini toping.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = in.nextInt();
        System.out.print("Enter Second Number: ");
        int b = in.nextInt();
        System.out.print("Enter Third Number: ");
        int c = in.nextInt();
        if (a <= b && a <= c)
            System.out.println(a + " is the smallest number.");

        else if (b <= a && b <= c)
            System.out.println(b + " is the smallest number.");

        else
            System.out.println(c + " is the smallest number.");
    }
}
