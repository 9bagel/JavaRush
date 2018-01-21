package com.javarush.task.task25.task2506;

/* 
Мониторинг состояния нити
*/
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread target = new Thread();
        LoggingStateThread loggingStateThread = new LoggingStateThread(target);

        loggingStateThread.start();
        target.start();  //NEW
        Thread.sleep(100); //RUNNABLE
        target.join(100);
        Thread.sleep(400);
        target.interrupt(); //TERMINATED
        Thread.sleep(500);
    }
}

class LoggingStateThread extends Thread {
    private Thread thread;
    private Thread.State newState;
    private State currentState;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
        newState = thread.getState();
        System.out.println(newState);
    }

    @Override
    public void run() {
        do {
            currentState = thread.getState();
            if (newState != currentState) {
                newState = currentState;
                System.out.println(newState);
            }
        }
        while (State.TERMINATED != currentState);

    }
}
