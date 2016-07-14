package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int max;
        int mid;
        int low;
        if (a > b && a > c) max = a;
        else if (b > a && b > c) max = b;
        else max = c;
        if (a < b && a < c) low = a;
        else if (b < a && b < c) low = b;
        else low = c;
        if (a != max && a != low) mid = a;
        else if (b != max && b != low) mid = b;
        else mid = c;
        System.out.print(max + " " + mid + " " + low);

    }
}
