package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));   //напишите тут ваш код
        String name=reader.readLine();
        String a=reader.readLine();
        String b=reader.readLine();
        System.out.println(name+" получает "+a+" через "+b+" лет.");    //напишите тут ваш код

    }
}