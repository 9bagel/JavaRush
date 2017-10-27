package com.javarush.task.task03.task0305;

/* 
Я так давно родился
*/

import java.util.Date;

class a{}
interface b{}
public class Solution extends a implements b {

    static void test(a a1){
        System.out.println("A");
    }
    static void test(b b1){
        System.out.println("I1");
    }

    public static void main(String[] args) {
        a a1 = new Solution();
        test((b)a1);
    }
}
