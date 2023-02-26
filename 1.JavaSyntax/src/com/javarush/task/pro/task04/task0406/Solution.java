package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   while (true) {
       String console = s.nextLine();
       if (console.equals("enough")) break;
       else System.out.println(console);
   }

    }
}