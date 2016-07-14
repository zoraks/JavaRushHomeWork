package com.javarush.test.level14.lesson08.home07;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new Apt1Room());
        apartments.add(new Apt2Room());
        apartments.add(new Apt3Room());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        for (Apartment apartment : apartments) {
            apartment.cleanRoom();
        }
    }

    interface Apartment {
        void cleanRoom();
    }

    static class Apt1Room implements Apartment {
        @Override
        public void cleanRoom() {
            System.out.println("1 room is cleaned");
        }
    }

    static class Apt2Room implements Apartment {
        @Override
        public void cleanRoom() {
            System.out.println("2 room is cleaned");
        }
    }

    static class Apt3Room implements Apartment {
        @Override
        public void cleanRoom() {
            System.out.println("3 room is cleaned");
        }
    }
}
