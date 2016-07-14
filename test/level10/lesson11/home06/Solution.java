package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        //напишите тут ваши переменные и конструкторы
        String name;
        String surname;
        String address;
        int age;
        int weight;
        int height;

        public Human() {
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, String address) {
            this.name = name;
            this.surname = surname;
            this.address = address;
        }

        public Human(String name, String surname, String address, int age, int weight, int height) {
            this.name = name;
            this.surname = surname;
            this.address = address;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, String surname, int age, int weight, int height) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, String surname, String address, int age) {
            this.name = name;
            this.surname = surname;
            this.address = address;
            this.age = age;
        }

        public Human(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public Human(int age, String name, String surname) {
            this.age = age;
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, int age, int height) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.height = height;
        }
    }
}
