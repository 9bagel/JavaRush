package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int pos = 0;
        int neg = 0;

        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(reader.readLine());
            if (num > 0) {
                pos++;
            } else if (num != 0) {
                neg++;
            }
        }
        System.out.println("количество отрицательных чисел: " + neg);
        System.out.println("количество положительных чисел: " + pos);

    }
}
