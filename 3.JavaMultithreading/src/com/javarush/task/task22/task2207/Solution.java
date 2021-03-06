package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            while (fileReader.ready()) {
                String[] tmp = fileReader.readLine().split(" ");
                words.addAll(Arrays.asList(tmp));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < words.size(); i++) {
            String s = words.get(i);
            StringBuilder stringBuilder = new StringBuilder(s).reverse();
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(j).equals(stringBuilder.toString())) {
                    Pair pair = new Pair();
                    pair.first = s;
                    pair.second = stringBuilder.toString();
                    result.add(pair);
                    words.remove(j);
                    words.remove(i);
                    i--;
                    break;
                }
            }
        }

        for (Pair pair : result) {
            System.out.println(pair);
        }

    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
