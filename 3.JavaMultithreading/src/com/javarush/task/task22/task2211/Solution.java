package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        try (InputStream fileReader = new FileInputStream(args[0]);
             OutputStream fileWriter = new FileOutputStream((args[1]))) {

            Charset win1251 = Charset.forName("windows-1251");
            Charset utf8 = Charset.forName("utf-8");

            int bufferSize = 1000;
            while (fileReader.available() > 0) {
                byte[] buffer = new byte[bufferSize];

                bufferSize = fileReader.read(buffer);

                String tmp = new String(buffer, win1251);
                buffer = tmp.getBytes(utf8);

                fileWriter.write(buffer);
            }
        }
    }
}
