package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        int[] num = new int[5];
        for (int i = 0; i < 5; i++)
            num[i] = Integer.parseInt(reader.readLine());

        int[] list = new int[5];
        list[0] = num[0];
        for (int i = 1; i < 5; i++) {
            if (num[i] < list[0]) {
                list[0] = num[i];
                num[i] = num[0];
                num[0] = list[0];
            }
        }
        list[1] = num[1];
        for (int i = 2; i < 5; i++) {
            if (num[i] < list[1]) {
                list[1] = num[i];
                num[i] = num[1];
                num[1] = list[1];
            }
        }
        list[2] = num[2];
        for (int i = 3; i < 5; i++) {
            if (num[i] < list[2]) {
                list[2] = num[i];
                num[i] = num[2];
                num[2] = list[2];
            }
        }
        if (num[4] < num[3]) {
            list[3] = num[4];
            list[4] = num[3];
        } else {
            list[3] = num[3];
            list[4] = num[4];
        }

        for (int i = 0; i < 5; i++)
            System.out.println(list[i]);
    }
}

