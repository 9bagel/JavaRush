package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleOutput = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream printStream = new PrintStream(outputStream);

        System.setOut(printStream);

        testString.printSomething();

        System.setOut(consoleOutput);

        String[] arguments = outputStream.toString().split(" ");
        int a = Integer.parseInt(arguments[0]);
        int b = Integer.parseInt(arguments[2]);

        if (arguments[1].equals("+"))
            System.out.println(String.valueOf(a) + " + " + String.valueOf(b) + " = " + (a + b));
        else if (arguments[1].equals("*"))
            System.out.println(String.valueOf(a) + " * " + String.valueOf(b) + " = " + (a * b));
        else if (arguments[1].equals("-"))
            System.out.println(String.valueOf(a) + " - " + String.valueOf(b) + " = " + (a - b));
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

