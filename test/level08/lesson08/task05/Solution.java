package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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
        map.put("Николаев", "Иван");
        map.put("Сергеев", "Андрей");
        map.put("Васечкин", "Сергей");
        map.put("Титов", "Алексей");
        map.put("Алексеев", "Тимофей");
        map.put("Андреев", "Семен");
        map.put("Семенов", "Андрей");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String,String> element :copy.entrySet()) {
            int count = 0;
            for (Map.Entry<String, String> copyElement : copy.entrySet()) {
                if (element.getValue().equals(copyElement.getValue())) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, element.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
