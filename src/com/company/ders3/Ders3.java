package com.company.ders3;

public class Ders3 {
    public static void main(String[] args) {

        /**
         * Aritmetik Operatorler
         * + - * / %
         */

        //int s1 = 4;
        //int s2 = 10;

        //System.out.println(s1 * s2);
        //System.out.println(s1 + s2);

        System.out.println(4 + 3);
        System.out.println(4 - 3);
        System.out.println(10 * 5);
        System.out.println(10 / 5);
        System.out.println(10 % 3);


        // Arttırma Azaltma Operatorleri

        int sayi1 = 10;
        sayi1++;
        System.out.println(sayi1);

        int sayi2 = 10;
        ++sayi2;
        System.out.println(sayi2);

        int sayi3 = 10;
        System.out.println("sayi3: " + sayi3++);
        System.out.println(sayi3);

        int sayi4 = 10;
        System.out.println("sayi4: " + ++sayi4);

        int sayi5 = 10;
        sayi5++; // sayi5 = sayi5 + 1;
        sayi5--;
        --sayi5;
        //sayi5**;
        //sayi5//;
        //sayi5%%;

        int sayi6 = 10;

        System.out.println(sayi6++ > ++sayi6);
        System.out.println(sayi6);


        int s1 = 15;
        int s2 = 16;
        int sonuc1 = 0;
        int sonuc2 = 0;

        sonuc1 = (s1 + s2 * 2 - s2) + s1++ + s2 - s1 * 4;
        System.out.println(sonuc1);



        //sonuc2 = (s1++ + ++s2 + 4 / 2) + s1++ * s2 + s1;



        // Karşılaştırma Operatorleri
        // (||, ==, >=, <=, >, <, !=, &&, |, &)

        boolean k1 = true;
        boolean k2 = false;
        System.out.println(k1 || k2);
        System.out.println(k1 && k2);
        System.out.println("**********");
        System.out.println(4 == 6);
        System.out.println(4 != 6);
        System.out.println(4 < 6);
        System.out.println(4 > 6);


    }
}
