package com.javarush.test.level03.lesson04.task04;

/* Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
Подсказка: будет три миллиона с хвостиком.
*/

public class Solution
{
    public static void main(String[] args)     {
        //напишите тут ваш код
        int res = 1;
        for (int i = 2; i <= 10; i++){
            res = i * res;
        }
        System.out.println(res);
    }
}