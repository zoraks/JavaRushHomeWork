package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    String name;
    int hi;
    String col;

    public Dog(String name){
        this.name = name;
    }

    public  Dog(String name, int hi){
        this.name = name;
        this.hi = hi;
    }
    public  Dog(String name, int hi, String col) {
        this.name = name;
        this.hi = hi;
        this.col = col;
    }

}
