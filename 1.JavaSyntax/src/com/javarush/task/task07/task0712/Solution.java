package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        List<String> strings = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 10; i++) {
                strings.add(reader.readLine());
            }
        }

        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < strings.size(); i++) {

            if (strings.get(i).length() > strings.get(maxIndex).length()) {
                maxIndex = i;
            }

            if (strings.get(i).length() < strings.get(minIndex).length()) {
                minIndex = i;
            }

        }
        System.out.printf("%s", strings.get(minIndex < maxIndex ? minIndex : maxIndex));
    }
}
