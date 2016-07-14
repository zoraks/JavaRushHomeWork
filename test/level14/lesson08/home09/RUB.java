package com.javarush.test.level14.lesson08.home09;

/**
 *
 */
public class RUB extends Money{
    public RUB(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName(){
        return "RUB";
    }
}
