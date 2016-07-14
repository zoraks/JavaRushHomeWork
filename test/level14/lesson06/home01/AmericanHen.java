package com.javarush.test.level14.lesson06.home01;

/**
 *
 */
public class AmericanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 100;
    }
    @Override
    String getDescription(){
        return "Моя страна - США. Я несу 100 яиц в месяц на анаболиках и антибиотиках";
    }
}
