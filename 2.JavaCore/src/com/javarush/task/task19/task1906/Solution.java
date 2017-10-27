package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {


    public static void main(String[] args) {
        String fileName1 = null;
        String fileName2 = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileReader fileReader = new FileReader(fileName1);
            FileWriter fileWriter = new FileWriter(fileName2)) {
            while (fileReader.ready()) {
                fileReader.skip(1);
                if (fileReader.ready())
                    fileWriter.write(fileReader.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
