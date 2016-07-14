package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> child = new ArrayList<Human>();
        child.add(new Human("sun 1", true, 2, new ArrayList<Human>()));
        child.add(new Human("sun 2", true, 2, new ArrayList<Human>()));
        child.add(new Human("sun 3", true, 2, new ArrayList<Human>()));

        ArrayList<Human> papa = new ArrayList<Human>();
        papa.add(new Human("papa", true, 36, child));

        ArrayList<Human> mama = new ArrayList<Human>();
        mama.add(new Human("mama", false, 30, child));

        ArrayList<Human> grParents = new ArrayList<Human>();
        grParents.add(new Human("ded1", true, 68, papa));
        grParents.add (new Human("baba1", false, 68, papa));
        grParents.add (new Human("ded2", true, 58, mama));
        grParents.add (new Human("baba2", false, 58, mama));

        for (Human x : grParents) System.out.println(x);
        for (Human x : papa) System.out.println(x);
        for (Human x : mama) System.out.println(x);
        for (Human x : child)System.out.println(x);
    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
