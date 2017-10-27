package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tmp = 0;
        for (int i = 0; i < 3; i++) {
            if (Integer.parseInt(reader.readLine()) > 0)
                tmp++;
        }
        System.out.println(tmp);


    }
}
