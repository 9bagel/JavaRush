package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(reader.readLine());

        if (i < 1 || i > 999)
            return;
        if (i % 2 == 0)
            System.out.print("четное ");
        else System.out.print("нечетное ");
        if (i < 10)
            System.out.print("однозначное ");
        else if (i < 100)
            System.out.print("двузначное ");
        else
            System.out.print("трехзначное ");
        System.out.print("число");

    }
}
