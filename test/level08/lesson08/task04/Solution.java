package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Petrone", new Date("MAY 15 1979"));
        map.put("Berluskone", new Date("JULY 15 1979"));
        map.put("Obama", new Date("AUGUST 15 1979"));
        map.put("Merkel", new Date("DECEMBER 15 1979"));
        map.put("Olland", new Date("NOVEMBER 15 1979"));
        map.put("Putin", new Date("OCTOBER 15 1979"));
        map.put("Nudin", new Date("APRIL 15 1979"));
        map.put("Bond", new Date("JUNE 15 1977"));
        map.put("Rurk", new Date("JUNE 15 1976"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            int month = pair.getValue().getMonth();
            if(month > 4 && month < 8)
                iterator.remove();
        }
    }
}
