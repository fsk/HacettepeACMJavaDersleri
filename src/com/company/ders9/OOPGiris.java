package com.company.ders9;

public class OOPGiris {

    public static void main(String[] args) {
        /** OOP prensiplerinde 4 temel madde
         * 1. Abstraction (soyutlama) // interface ve abstract classlar
         * 2. Polymorphism (çok biçimlilik)
         * 3. Inheritance (Kalıtım)
         * 4. Encapsulation (kapsülleme)
         */

        /** Object nedir?
         * 1. durum (field, properties, degiskenler)
         * 2. davranış (behaivor, methodlar)
         */

        /** Class nedir?
         * Nesnelerin oluşturulduğu kalıplardır (fabrika)
         */

        /** Inheritance nedir?
         * Bazı durum ve davranışları üst class dan devralmak için kullanıyoruz. geliştirme, yeniden kullanılabilirlik gibi güçlü ve doğal bir mekanizma sağlar.
         */

        /** Abstraction (Abstract classlar & Interfaceler)
         * Nasıl olduğu ile ilgilenmeden sadece işlemi yapacak komutu çalıştırmak diyebiliriz.
         */

        /** Package nedir?
         * classları ve interfaceleri mantıksal bir şekilde düzenlemek/bölmek için kullanılır.
         * projenin yönetimini kolaylaştırır.
         */

        // coupling(tight, loose), cohesion, association, aggregation, composition. (is-a, has-a)


        Person kisi = new Person("oguzhan", 26, 70, "person");
/*      kisi.ad = "Oguzhan";
        kisi.yas = -5;
        kisi.kilo = 70;
        kisi.meslek = "Bilgisayar Muhendisi";*/


        kisi.setAd("Oguzhan");
        kisi.setYas(-5);
        kisi.setKilo(70);

        System.out.println("Ad: " + kisi.getAd());
        System.out.println("Yas: " + kisi.getYas());
        System.out.println("Kilo:  " + kisi.getKilo());


        // upcasting
        Person doktor = new Doktor("ahmet", 30, 80, "prof.dr");
        Person muhendis = new Muhendis("veysel", 20, 80, "junior");
        Person person = new Person("person", 25, 50, "kisi");

        Doktor yeniDoktor = (Doktor) doktor; // downcasting
        yeniDoktor.doktorMethodu();
        // polymorphism // cok bicimlilik

        Doktor.doktorStaticMethod(); // class members
        calismaMethodu(doktor);
        calismaMethodu(muhendis);
        calismaMethodu(person);

        // types of inheritance: single, multilevel and hierarchical

        // multiple inheritance with abstract class & interface
        CustomerImpl customer = new CustomerImpl();
        customer.deleteCustomer(123L);
    }

    public static void calismaMethodu(Person person) {
        person.work();
    }
}
