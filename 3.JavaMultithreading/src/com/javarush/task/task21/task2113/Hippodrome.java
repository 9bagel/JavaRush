package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public static void main(String[] args) throws InterruptedException {
        Horse horse1 = new Horse("Horse1", 3, 0);
        Horse horse2 = new Horse("Horse2", 3, 0);
        Horse horse3 = new Horse("Horse3", 3, 0);

        List<Horse> horses = new ArrayList<>();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        game = new Hippodrome(horses);

        game.run();
        game.printWinner();
    }

    public Hippodrome(List horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }


    public Horse getWinner(){
        double tmpDistance = 0;
        int tmpIndex = 0;
        for (int i = 0; i < horses.size(); i++) {
            if (horses.get(i).getDistance() > tmpDistance) {
                tmpDistance = horses.get(i).getDistance();
                tmpIndex = i;
            }
        }
        return horses.get(tmpIndex);
    }

    public void printWinner(){
        System.out.printf("Winner is %s!", getWinner().getName());
    }
}
