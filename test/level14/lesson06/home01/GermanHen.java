package com.javarush.test.level14.lesson06.home01;

/**
 *
 */
public class GermanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 31;
    }
    @Override
    String getDescription(){
        return "Моя страна - Германия. Я несу 31 яйцо в месяц";
    }
}
