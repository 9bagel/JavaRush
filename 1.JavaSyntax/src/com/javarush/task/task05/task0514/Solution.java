package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person person = new Person();
        person.initialize("JavaRush", 20);
    }

    static class Person {
        //напишите тут ваш код
        int age;
        String name;

        public void initialize(String name, int age) {
            this.age = age;
            this.name = name;
        }
    }


}
