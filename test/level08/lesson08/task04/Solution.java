package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;




/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JUNE 1 1948"));
        map.put("Stallone3", new Date("APRIL 1 1948"));
        map.put("Stallone4", new Date("JUNE 1 1948"));
        map.put("Stallone5", new Date("MAY 1 1948"));
        map.put("Stallone6", new Date("JUNE 1 1948"));
        map.put("Stalljne7", new Date("JUNE 1 1948"));
        map.put("Stallone8", new Date("JUNE 1 1948"));
        map.put("Stallone9", new Date("MAY 1 1948"));
        map.put("Stallone10", new Date("JUNE 1 1948"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> pair = map.entrySet().iterator();
        while (pair.hasNext()){
            int temp = pair.next().getValue().getMonth();
            if(temp > 4 && temp < 8) pair.remove();
        }
    }

    public static void main(String[] args) {
        System.out.println(createMap());
        removeAllSummerPeople(createMap());
    }
}
