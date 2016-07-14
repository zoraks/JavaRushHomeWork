package com.javarush.test.level13.lesson11.bonus01;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*Задача:
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:
5
8
11
3
2
10

Пример вывода:
2
8
10

 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader1 = new BufferedReader(new FileReader(fileName));
        while (reader1.ready()){
            int number = Integer.parseInt(reader1.readLine());
            if (number % 2 == 0)list.add(Integer.parseInt(String.valueOf(number)));
        }
        reader1.close();
        Collections.sort(list);
        for (int i : list) {
            System.out.println(i);
        }
    }

}
