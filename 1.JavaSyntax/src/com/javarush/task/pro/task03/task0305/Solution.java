package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean ab = (a == b);
        boolean ac = (a == c);
        boolean bc = (b == c);

        if (ab && bc)
            System.out.println(a + " " + b + " " + c);
        else {
            if (ab)
                System.out.println(a + " " + b);
            if (ac)
                System.out.println(a + " " + c);
            if (bc)
                System.out.println(b + " " + c);
        }
    }}