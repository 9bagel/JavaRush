package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {

    }

    public static Integer[] sort(Integer[] array) {
        //implement logic here
        int median;

        // Sorting array
        Arrays.sort(array);

        //Finding median
        if (array.length % 2 == 0)
            median = (array[array.length / 2] + array[array.length / 2 - 1]) / 2;
        else
            median = array[array.length / 2];

        //Sorting array by the task
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(Math.abs(median - o1), Math.abs(median - o2));
            }
        };

        Arrays.sort(array, comparator);
        return array;
    }
}
