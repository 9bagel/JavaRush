package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        String fileName = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            fileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintStream systemConsole = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        System.setOut(printStream);

        testString.printSomething();

        System.setOut(systemConsole);

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            fileOutputStream.write(outputStream.toByteArray());
            System.out.println(outputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

