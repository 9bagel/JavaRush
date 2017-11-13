package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        List<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 10; i++) {
                list.add(reader.readLine());
            }
        }
        Map<Integer, String > shortest = new HashMap<>();
        shortest.put(0, list.get(0));
        int tmpShort = 0;

        Map<Integer, String > longest = new HashMap<>();
        longest.put(0, list.get(0));
        int tmpLong = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > longest.get(tmpLong).length()) {
                longest.put(i, list.get(i));
                tmpLong = i;
            }
            if (list.get(i).length() < shortest.get(tmpShort).length()) {
                shortest.put(i, list.get(i));
                tmpShort = i;
            }
        }
        if (tmpLong <= tmpShort)
            System.out.println(longest.get(tmpLong));
        else System.out.println(shortest.get(tmpShort));
    }
}
