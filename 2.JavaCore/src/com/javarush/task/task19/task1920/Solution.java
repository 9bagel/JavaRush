package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            TreeMap<String, Double> map = new TreeMap<>();

            while (fileReader.ready()) {
                String[] tmp = fileReader.readLine().split(" ");
                map.merge(tmp[0], Double.parseDouble(tmp[1]), Double::sum);
            }

            double max = 0;
            for (Map.Entry<String, Double> entry : map.entrySet())
                if (max < entry.getValue())
                    max = entry.getValue();

            for (Map.Entry<String, Double> entry : map.entrySet()) {
                if (max == entry.getValue())
                    System.out.println(entry.getKey());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
