package com.company;

import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        while (true) {
            Random random = new Random();

            int a = sk.nextInt();
            int b = sk.nextInt();
            int s = sk.nextInt();
            if ((a < b) && (b < s)) {
                System.out.println("Usuvchi--");
                System.out.println(a * 2);
                System.out.println(b * 2);
                System.out.println(s * 2);

            } else if ((a > b) && b > s) {
                System.out.println("kamayuvchi__");
                System.out.println(a * 2);
                System.out.println(b * 2);
                System.out.println(s * 2);
            } else if ((a == b) && b == s) {
                System.out.println("uzgarmas==");
                int r = random.nextInt(100);
                int d = random.nextInt(100);
                int q = random.nextInt(100);
                System.out.println(r);
                System.out.println(d);
                System.out.println(q);

            }
        }
    }
    }

