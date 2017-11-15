package com.javarush.task.task22.task2209;

import java.io.*;

/*
Составить цепочку слов
*/
public class Solution {
    static String fileName;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //...
        StringBuilder result = getLine();
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
