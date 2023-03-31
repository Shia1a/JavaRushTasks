package com.javarush.task.pro.task04.task0425;

/* 
Диггер (1)
*/

public class Solution {
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {
        int width = 0;
        while (width < 10) {
            int height = 0;
            while (height < 10) {
                if (width == 0 && height == 3) {
                    System.out.print(robot);
                } else if (width == 9) {
                    System.out.print(bug);
                } else {
                    System.out.print(land);
                }
                height++;
            }
            System.out.println();
            width++;
        }
    }
}