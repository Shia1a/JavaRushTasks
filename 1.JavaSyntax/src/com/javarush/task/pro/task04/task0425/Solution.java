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
        for(int i = 0; i < 10; i++){
            if (i == 8)
                for(int n = 0; n < 10; n++)
                    if (n == 3)
                        System.out.print(robot);
                    else
                        System.out.print(land);
            for(int j = 0; j < 10; j++){
                if (i >= 9)
                    System.out.print(bug);
                else if (i >= 0 && i != 8)
                    if (j != 3)
                        System.out.print(land);
                    else
                        System.out.print(hole);
            }
            System.out.println("");
        }

    }
}
