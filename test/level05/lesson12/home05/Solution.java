package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма».
Вывести на экран полученную сумму.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int x = 0;
        String txt;
        while (true){
        txt = reader.readLine();
        if (txt.equals("сумма")) break;
        else {
            x = Integer.parseInt(txt);
            sum = sum + x;
            }
        }
        System.out.print(sum);
    }
}
