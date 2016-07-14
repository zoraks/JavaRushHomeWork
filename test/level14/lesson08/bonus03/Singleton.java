package com.javarush.test.level14.lesson08.bonus03;

/**
 *
 */
public class Singleton {
    private static Singleton Instance;

    public static Singleton getInstance() {
        if (Instance == null) Instance = new Singleton();
        return Instance;
    }

    private Singleton() {
    }
}
