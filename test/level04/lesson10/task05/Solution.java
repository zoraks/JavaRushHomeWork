package com.javarush.test.level04.lesson10.task05;

import java.io.*;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i = 1, j = 1;
        int equal;
        while (i < 11){
            while (j < 11){
                equal = i * j;
                System.out.print(equal + " ");
                j++;
            }
            System.out.println("");
            j = 1;
            i++;
        }
    }

}
