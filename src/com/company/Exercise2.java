package com.company;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //Uchta raqam berilgan. Ulardan o'xshash raqamlarni aniqlash.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b) {
            System.out.println("1- va 2- bir xil");
        } else if (a == c) {
            System.out.println("1- va 2- bir xil");
        } else if (b == c) {
            System.out.println("2- va 3-  bir xil");
        } else {
            System.out.println("Biz xillar yõq");
        }

    }
}
