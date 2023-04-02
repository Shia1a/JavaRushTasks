package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int a = 0; a < 10; a++) {
            for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE[a][j] = ((a + 1) * (j + 1));
                System.out.print(MULTIPLICATION_TABLE[a][j]);
                System.out.print(" ");
            }
System.out.println();
        }
    }
}
