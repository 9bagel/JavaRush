package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());

        String s;

        if (i > 0) {
            System.out.print("положительное ");
        } else if (i < 0) {
            System.out.print("отрицательное ");
        } else {
            System.out.println("ноль");
        }

        if (i % 2 == 0 && i != 0) {
            System.out.print("четное число");
        } else if (i % 2 != 0 && i != 0) {
            System.out.println("нечетное число");
        }
    }
}
