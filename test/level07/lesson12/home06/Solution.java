package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на
экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)    {
        //напишите тут ваш код
        Human grfather1 = new Human("Боря", true, 68, null, null);
        Human grfather2 = new Human("Сергей", true, 58, null, null);
        Human grmather1 = new Human("Лена", false, 68, null, null);
        Human grmather2 = new Human("Таня", false, 58, null, null);
        Human father = new Human("Костя", true, 36, grfather1, grmather1);
        Human mather = new Human("Катя", false, 30, grfather2, grmather2);
        Human sun1 = new Human("Алексей", true, 2, father, mather);
        Human sun2 = new Human("Максим", true, 2, father, mather);
        Human daughter = new Human("Таня", false, 1, father, mather);

        System.out.println(grfather1);
        System.out.println(grfather2);
        System.out.println(grmather1);
        System.out.println(grmather2);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(sun1);
        System.out.println(sun2);
        System.out.println(daughter);
    }

    public static class Human    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString()        {
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
