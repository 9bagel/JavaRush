package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {

            while (fileReader.ready()) {
                int tmp = fileReader.read();
                if (46 != tmp)
                    fileWriter.write(tmp);
                else fileWriter.write(33);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
