package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {

            TreeMap<String, Double> map = new TreeMap<>();

            while (fileReader.ready()) {
                String[] tmp = fileReader.readLine().split(" ");
                String key = tmp[0];
                double value = Double.parseDouble(tmp[1]);
                map.merge(key, value, Double::sum);
            }
            map.forEach((key, value) -> System.out.println(key + " " + value));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
