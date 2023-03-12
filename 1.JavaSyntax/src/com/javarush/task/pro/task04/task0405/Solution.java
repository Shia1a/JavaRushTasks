package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        int b = 0;
        while (i < 10)  {

            while (i == 0 || i == 9) {
                b = 0;
                while (b < 20) {
                    System.out.print('Б');
                    b++;
                }
                System.out.println();
                i++;
            }
            while (i > 0 && i < 9) {
                System.out.print("Б");
                b = 0;
                while (b < 18) {
                    System.out.print(' ');
                   b++;
                }
                System.out.print("Б");
                System.out.println();
                i++;
            }
                    }
    }
}