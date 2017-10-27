package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        int worldCount = 0;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            while (fileReader.ready()) {
                String[] tmp = fileReader.readLine().split("[\\p{Punct}\\s]+");
                for (String s : tmp) {
                    if ("world".equals(s))
                        worldCount++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(worldCount);
    }
}
