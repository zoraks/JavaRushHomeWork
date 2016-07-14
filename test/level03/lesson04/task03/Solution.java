package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "Zer1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Zer2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Zerg3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Zerg4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "javarush";
        Zerg zerg6 = new Zerg();
        zerg6.name = "javarus";
        Zerg zerg7 = new Zerg();
        zerg7.name = "javaru";
        Zerg zerg8 = new Zerg();
        zerg8.name = "javar";
        Zerg zerg9 = new Zerg();
        zerg9.name = "java";
        Zerg zerg10 = new Zerg();
        zerg10.name = "jah";

        Protos protos1 = new Protos();
        protos1.name = "kmnkjh;jjbijk";
        Protos protos2 = new Protos();
        protos2.name = "kmnjh;jjbijk";
        Protos p = new Protos();
        p.name = "kmnkjh;jjbij";
        Protos proto = new Protos();
        proto.name = "kmnkjh;jjbi";
        Protos pe = new Protos();
        pe.name = "kmnkjh;jj";

        Terran ter1 = new Terran();
        ter1.name = "cgvbnm,mnbv";
        Terran ter2 = new Terran();
        ter2.name = "cgvbnm,mnv";
        Terran ter3 = new Terran();
        ter3.name = "cgvbnm,nbv";
        Terran ter4 = new Terran();
        ter4.name = "cgvbnmnbv";
        Terran ter5 = new Terran();
        ter5.name = "cgvbn,mnbv";
        Terran ter6 = new Terran();
        ter6.name = "cgvb,mnbv";
        Terran ter7 = new Terran();
        ter7.name = "cgvbnbv";
        Terran ter8 = new Terran();
        ter8.name = "cgbnm,mnbv";
        Terran ter9 = new Terran();
        ter9.name = "cgbm,mnbv";
        Terran ter10 = new Terran();
        ter10.name = "cgbnm,nbv";
        Terran ter11 = new Terran();
        ter11.name = "vnm,mnbv";
        Terran ter12 = new Terran();
        ter12.name = "gvbn";



    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}