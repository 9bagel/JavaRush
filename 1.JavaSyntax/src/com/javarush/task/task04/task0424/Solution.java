package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());

        if (x != y && y == z)
            System.out.println(1);
        else if (y != z && x == z)
            System.out.println(2);
        else if (z != x && y == x)
            System.out.println(3);
    }
}
