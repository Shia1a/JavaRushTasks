package com.javarush.task.pro.task04.task0419;

import java.util.Scanner;

/* 
Защита от землетрясения
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int a = 0;

        while (a <= number) {
            sum += a;
            a++;
        }
        {System.out.println(sum);
            }
        }
    }
