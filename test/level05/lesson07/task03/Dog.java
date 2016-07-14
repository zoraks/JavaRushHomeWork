package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
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

    public void initialize (String name){
        this.name = name;
    }

    public  void initialize (String name, int hi){
        this.name = name;
        this.hi = hi;
    }
    public  void initialize (String name, int hi, String col) {
        this.name = name;
        this.hi = hi;
        this.col = col;
    }

}
