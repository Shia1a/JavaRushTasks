package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int a=scanner.nextInt();
       double s = 3.14*a*a;
int result = (int) s;
System.out.println(result);
    }
}