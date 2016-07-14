package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Алексей");
        map.put("Петров", "Алексей");
        map.put("Сидорова", "Мария");
        map.put("Бонд", "Мария");
        map.put("Джонс", "Александр");
        map.put("Буре", "Александр");
        map.put("Пюре", "Екатерина");
        map.put("Лукин", "Игорь");
        map.put("Фролова", "Яна");
        map.put("Семенов", "Павел");
        return (HashMap<String, String>) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (name.equals(iterator.next().getValue()))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (lastName.equals(iterator.next().getKey()))
                count++;
        }
        return count;
    }
}
