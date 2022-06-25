package com.company.ders9;

public class Muhendis extends Person {

    public Muhendis(String ad, Integer yas, Integer kilo, String unvan) {
        super(ad, yas, kilo, unvan);
    }

    @Override
    public void work() {
        System.out.println("kod yaziyor.");
    }
}
