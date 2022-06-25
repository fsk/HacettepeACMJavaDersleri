package com.company.ders9;

public class Doktor extends Person {
    // is a relation

    public Doktor(String ad, Integer yas, Integer kilo, String unvan) {
        super(ad, yas, kilo, unvan);
    }

    @Override
    public void work() {
        System.out.println(super.getAd());
        System.out.println(this.getUnvan() + " " + this.getAd() + " hasta muayene ediyor.");
    }

    public void doktorMethodu() {
        System.out.println("doktormethodu calisti..");
    }

    public static void doktorStaticMethod() {
        System.out.println("static method calisti.");
    };
}
