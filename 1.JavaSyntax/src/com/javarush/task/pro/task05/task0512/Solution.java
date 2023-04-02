package com.javarush.task.pro.task05.task0512;

/* 
Создаем мультимассив
*/

public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
       for (int i=0; i< multiArray.length; i++){
           for (int x=0; x< multiArray[i].length; x++) {
               for (int b=0; b< multiArray[i][x].length;b++) {
                   System.out.print(multiArray[i][x][b]);
               }
           }

       }
    }
}
