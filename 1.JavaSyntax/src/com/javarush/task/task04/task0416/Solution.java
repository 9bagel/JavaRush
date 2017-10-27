package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(reader.readLine());

        while (d > 5) {
            d -= 5;
        }
        if (d <= 3) {
            System.out.println("зелёный");
        } else if (d > 3 && d <= 4) {
            System.out.println("жёлтый");
        } else if (d > 4 && d <= 5) {
            System.out.println("красный");
        }
    }
}