package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {
            while (fileReader.ready()) {
                String[] tmp = fileReader.readLine().split("[\\p{Punct}\\s]+");
                for (String s : tmp) {
                    fileWriter.write(s);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
