package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным.
 Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
 Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null).
 То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    private String name;
    private int weight;
    private int age;
    private String color;
    private String adres;
    //Имя
    public void initialize(String name)    {
        this.name = name;
    }
    //Имя, вес, возраст
        public void initialize(String name, int weight, int age)    {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    // Имя, возраст (вес стандартный)
    public void initialize(String name, int age)    {
        this.name = name;
        this.weight = 3;
        this.age = age;
    }
    //вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
    public void initialize(int weight, String color)    {
        this.name = null;
        this.weight = weight;
        this.age = 8;
        this.color = color;
        this.adres = null;
    }
    //вес, цвет, адрес ( чужой домашний кот)
    public void initialize(int weight, String color, String adres) {
        this.weight = weight;
        this.color = color;
        this.adres = adres;
    }

}
