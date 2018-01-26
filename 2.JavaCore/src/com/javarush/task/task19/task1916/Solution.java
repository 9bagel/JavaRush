package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader1 = new BufferedReader(new FileReader(reader.readLine()));
             BufferedReader fileReader2 = new BufferedReader(new FileReader(reader.readLine()))) {

            while (fileReader1.ready() && fileReader2.ready()) {
                String tmp1 = fileReader1.readLine();
                String tmp2 = fileReader2.readLine();

                if (tmp1.trim().equals(tmp2.trim()))
                    lines.add(new LineItem(Type.SAME, tmp1));

                else if (tmp1.trim().isEmpty() && !tmp2.trim().isEmpty())
                    lines.add(new LineItem(Type.ADDED, tmp2));

                else if (tmp2.trim().isEmpty())
                    lines.add(new LineItem(Type.REMOVED, tmp1));
            }

            while (fileReader1.ready()) {
                String tmp1 = fileReader1.readLine();
                lines.add(new LineItem(Type.REMOVED, tmp1));
            }

            while (fileReader2.ready()) {
                String tmp1 = fileReader2.readLine();
                lines.add(new LineItem(Type.ADDED, tmp1));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        /*for (LineItem ll : lines)
            System.out.println(ll.type + " " + ll.line);*/
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
