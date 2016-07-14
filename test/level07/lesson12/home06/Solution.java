package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grFatherFather = new Human("Bob", true, 68, null, null);
        Human grMotherFather = new Human("Elen", false, 68, null, null);
        Human grFatherMother = new Human("Serg", true, 58, null, null);
        Human grMotherMother = new Human("Nata", false, 58, null, null);
        Human father = new Human("Kos", true, 36, grFatherFather, grMotherFather);
        Human mother = new Human("Kate", false, 30, grFatherMother, grMotherMother);
        Human  son1 = new Human("Max", true, 3, father, mother);
        Human  son2 = new Human("Alex", true, 3, father, mother);
        Human  doter = new Human("Arina", false, 3, father, mother);

        System.out.println(grFatherFather);
        System.out.println(grMotherFather);
        System.out.println(grFatherMother);
        System.out.println(grMotherMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(doter);
    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
