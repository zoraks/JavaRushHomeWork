package com.javarush.test.level14.lesson06.home01;

/**
 *
 */
public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }
    @Override
    String getDescription(){
        return "Моя страна - Россия. Я несу 30 яиц в месяц";
    }
}
