package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Петров", "Иван");
        map.put("Иванов", "Сергей");
        map.put("Сидоров", "Николай");
        map.put("Николаев", "Сидор");
        map.put("Сергеев", "Василий");
        map.put("Васечкин", "Сергей");
        map.put("Титов", "Алексей");
        map.put("Алексеев", "Тимофей");
        map.put("Андреев", "Семен");
        map.put("Семенов", "Андрей");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int countName = 0;
        for (String tmp : map.values())
            if (name.equals(tmp)) countName++;
        return countName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int countLastName = 0;
        for (String tmp : map.keySet())
            if (lastName.equals(tmp)) countLastName++;
        return countLastName;
    }
}
