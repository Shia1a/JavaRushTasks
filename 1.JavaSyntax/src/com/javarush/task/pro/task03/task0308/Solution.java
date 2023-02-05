package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int  y = scanner.nextInt();
        boolean first = x > 0 && y > 0;
        boolean second = x < 0 && y >0;
        boolean third = x < 0 && y < 0;
        boolean four = x > 0 && y <0;
        if (first)
            System.out.println("1");
        if (second)
            System.out.println("2");
        if (third)
            System.out.println("3");
        else if (four)
            System.out.println("4");
//напишите тут ваш код
    }
}
