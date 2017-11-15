package com.javarush.task.task22.task2208;

import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        /*Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);
        System.out.println(getQuery(map));*/
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (null != entry.getValue()) {
                if (stringBuilder.length() == 0)
                    stringBuilder.append(entry.getKey()).append(" = '").append(entry.getValue()).append("'");
                else
                    stringBuilder.append(" and ").append(entry.getKey()).append(" = '").append(entry.getValue()).append("'");
            }
        }
        return stringBuilder.toString();
    }
}
