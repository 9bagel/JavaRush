package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] ints = new int[15];
        int even = 0;
        int odd = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < ints.length; i++) {
                ints[i] = Integer.parseInt(reader.readLine());
                if (i % 2 == 0)
                    even += ints[i];
                else odd += ints[i];
            }
        }
        System.out.printf("В домах с %s номерами проживает больше жителей.", odd > even ? "нечетными" : "четными");


    }
}
