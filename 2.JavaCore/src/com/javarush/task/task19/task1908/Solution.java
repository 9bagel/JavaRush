package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {

            Pattern pattern = Pattern.compile("\\b\\d+\\b");
            Matcher matcher;
            while (fileReader.ready()) {
                matcher = pattern.matcher(fileReader.readLine());
                while (matcher.find()) {
                    fileWriter.write(matcher.group() + " ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
