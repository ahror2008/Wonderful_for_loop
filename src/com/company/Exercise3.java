package com.company;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
//2 ta int tpidagi o'zgaruvchilar berilgan. A va B  ularning qiymatlari teng bo'lmasa , har bir o'zgaruvchiga ushbu qiymatlar
// yig'indisi, agar ular teng bo'lsa , o'zgaruvchiga nol qiymatni belgilang
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a != b) {
            System.out.println(a + b);
        } else if (a == b) {
            System.out.println(0);
        }
    }
}
