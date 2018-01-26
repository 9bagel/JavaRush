package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream(args[1]);
             FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {
            switch (args[0]) {
                case "-e":
                    encodeFile(fileInputStream, fileOutputStream);
                    break;
                case "-d":
                    decodeFile(fileInputStream, fileOutputStream);
                    break;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void encodeFile(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws IOException {
        while (fileInputStream.available() > 0) {
            fileOutputStream.write(fileInputStream.read() + 1);
        }
    }

    private static void decodeFile(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws IOException {
        while (fileInputStream.available() > 0) {
            fileOutputStream.write(fileInputStream.read() - 1);
        }
    }

}
