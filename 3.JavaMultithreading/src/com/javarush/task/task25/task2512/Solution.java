package com.javarush.task.task25.task2512;

/*
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        if (null != t)
            t.interrupt();

        if (null != e.getCause())
            uncaughtException(t, e.getCause());

        System.out.printf("%s: %s%n", e.getClass().getName(), e.getMessage());

    }

    public static void main(String[] args) {
    }
}
