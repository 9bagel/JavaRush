package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;

public class Producer implements Runnable {

    private ConcurrentHashMap<String, String> map;

    public Producer(ConcurrentHashMap<String, String> concurrentHashMap) {
        this.map = concurrentHashMap;
    }

    @Override
    public void run() {
        int i = 1;
        while (true) {
            try {
                map.put(String.valueOf(i), "Some text for " + i++);
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.printf("%s thread was terminated", Thread.currentThread().getName());
            }
        }
    }
}
