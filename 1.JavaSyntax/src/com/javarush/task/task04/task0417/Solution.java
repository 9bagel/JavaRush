package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] ints = new int[3];

        for (int i = 0; i < 3; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }

        if (ints[1] == ints[2] && ints[0] == ints[1])
            System.out.println(ints[0] + " " + ints[1] + " " + ints[2]);
        else if (ints[0] == ints[1])
            System.out.println(ints[0] + " " + ints[1]);
        else if (ints[0] == ints[2])
            System.out.println(ints[0] + " " + ints[2]);
        else if (ints[1] == ints[2])
            System.out.println(ints[1] + " " + ints[2]);
    }
}