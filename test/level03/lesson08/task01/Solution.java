package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
     BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));   //напишите тут ваш код
     String a=reader.readLine();
        String name=reader.readLine();
        System.out.println(name+" захватит мир через "+a+" лет. Му-ха-ха!");
    }
}