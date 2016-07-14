package com.javarush.test.level14.lesson06.home01;

/**
 *
 */
public class ItalianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 15;
    }
    @Override
    String getDescription(){
        return "Моя страна - Италия. Я несу 15 яиц в месяц, мне лениво";
    }
}
