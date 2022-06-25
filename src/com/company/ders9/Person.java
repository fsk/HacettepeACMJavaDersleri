package com.company.ders9;

public class Person {

    // default, public, protected, private
    private String ad; //degisken
    private Integer yas; // degisken ...
    private Integer kilo;
    private String unvan;

    public Person(String ad, Integer yas, Integer kilo, String unvan) {
        this.ad = ad;
        this.yas = yas;
        this.kilo = kilo;
        this.unvan = unvan;
    }

    // methodlar --> davranislari, degiskenler --> durumlari ifade eder.
/*    public void yemekYe(int kilo) {
        if (kilo < 0) {
            System.out.println("Yediginiz yemek agirligi negatif olamaz.");
            return;
        }
        System.out.println(kilo + " kilo yemek yendi.");
        this.kilo += kilo;
    }*/

    // encapsulation (getter & setter methods)

    public String getAd() {
        return this.ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        if (yas <= 0) {
            System.out.println("Yas degeri pozitif olmali..!!");
            return;
        }
        this.yas = yas;
    }

    public Integer getKilo() {
        return kilo;
    }

    public void setKilo(Integer kilo) {
        this.kilo = kilo;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void work() {
        System.out.println("person calisiyor.");
    };
}
