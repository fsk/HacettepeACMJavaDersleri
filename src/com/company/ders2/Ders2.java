package com.company.ders2;

public class Ders2 {

    public static void main(String[] args) {

        /**
         * // -- PRIMITIVE TYPELAR --
         * ----------------------------
         * -> byte 8 bit -128 +127
         * -> short 16 bit
         * -> int 32 bit
         * -> long 64 bit
         * -> float 32 bit
         * -> double 64 bit
         * -> char 16 bit
         * -> boolean 1 bit
         *
         * Ram'de ne kadar yer tutacağı bellidir.
         * Başlangıç ve bitiş değerleri bellidir.
         * Stack Size'da tutulurlar. !!!!
         */

        //Tam Sayilar
        byte byteNumberMin = -128;
        byte byteNumberMax = 127;
        short shortNumber = 125;
        int intNumber = 213123;
        long longNumber = 21312L;

        //Virgullu Sayilar
        float floatNumber = 17;
        double doubleNumber = 123123.435345D;

        //Char
        char charDataType = 'a';
        char charDataType2 = 5;

        //boolean
        boolean boolType = true;
        boolean boolType2 = false;


        //byte
        System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE + " " + Byte.BYTES + " " + Byte.SIZE);

        //short
        System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE + " " + Short.BYTES + " " + Short.SIZE);

        //int
        //System.out.println(Integer);

        //long
        //System.out.println(Long);

        //double
        //System.out.println(Double);

        //float
        //System.out.println(Float);

        //boolean
        //System.out.println(Boolean);

        //char
        //System.out.println(Character);



        int hastanedekiDoktorSayisi = 50;

        /**
         * 200 satır kod yazdiniz.
         */

        System.out.println(hastanedekiDoktorSayisi);


        /*
        Atama
         */

        byteNumberMin = byteNumberMax;
        System.out.println("Byte Number Min Yeni Deger: "+byteNumberMin);

        /**
         * SORU
         */

        int sayi1 = 5;
        int sayi2 = 7;

        sayi1 = sayi2;

        sayi2 = 9;

        System.out.println(sayi1);  //7
        System.out.println(sayi2); //9


        /**
         * // -- TYPE CASTING --
         * ----------------------------
         * -> byte 8 bit -128 +127
         * -> short 16 bit
         * -> int 32 bit
         * -> long 64 bit
         * -> float 32 bit
         * -> double 64 bit
         * -> char 16 bit
         * -> boolean 1 bit
         */


        int sayi3 = 50;
        long sayi4 = 100;

        System.out.println("Eski sayi 4: " + sayi4);

        //sayi4 = sayi3;

        //System.out.println("Yeni sayi 4: " + sayi4);

        sayi3 = (int) sayi4;

        System.out.println("Sayi3 degeri: " + sayi3);


        int sayi5 = 120;
        float sayi6 = 150;

        //sayi6 = sayi5;

        //System.out.println(sayi6);

        sayi5 = (int) sayi6;

        System.out.println(sayi5);


        /**
         * Araştırma Sorusu
         */

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        int sayi = Integer.MAX_VALUE + 1;
        System.out.println("Sayi: " + sayi);

        byte byteSayiSoru = (byte) (Byte.MAX_VALUE + 1);
        //System.out.println(B);

























    }
}
