package com.company.ders5;

import java.util.Scanner;

public class QuestionsForPractice {

    public static void main(String[] args) {
        // Soru 1: 1'den 10'a kadar sayilari ekrana yazdiran program.
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        // Soru 2: Ilk 10 dogal sayinin toplamini bulan program.
        int toplam = 0;
        for (int i = 0; i < 10; i++) {
            // toplam = toplam + i;
            toplam += i;
        }
        System.out.println("Toplam: " + toplam);

        // Soru 3: Kullanicidan pozitif bir tamsayi girmesini isteyen ve bu sayinin carpim tablosunu olusturan program.
        Scanner console = new Scanner(System.in);
        System.out.println("Pozitif bir sayi giriniz: ");
        int sayi = console.nextInt();
        int i = 0;

        for (i = 1; i <= 10; i++) {
            System.out.println(sayi + " x " + i + " = " + sayi * i);
        }
        // butun carpim tablosunu yazdiran program yazilabilir.. ODEV

        // Soru 4: Klavyeden girilen herhangi bir sayinin faktoriyel degerini bulan program.
        Scanner console2 = new Scanner(System.in);
        int sayi1 = console2.nextInt();
        int fact = 1;
        for (i = 1; i <= sayi1; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

        // Soru 5: Klavyeden iki sayı girilir. Sirasiyla biri diğerinin üssü olacak sekilde degerini hesaplayan program. (hazir java libraryler kullanilmayacak)

        // Soru 6: Kullanicidan bir tam sayi girmesini isteyen ve ardindan sayilari ters cevrilmis sayiyi veren program. Ornegin: Giris -> 12345 ise Cikti -> 54321 olacak.

        // Soru 7: Bir tamsayi setini okuyan ve ardindan cift ve tek tam sayilarin toplamini yazdıran program.

        // Soru 8: Kullanicidan pozitif bir tamsayi girmesini isteyen program, ardından sayinin asal sayi olup olmadigini kullaniciya geri donen program.

        // Soru 9: Kullanicinin girdigi iki sayinin en buyuk ortak bolenini hesaplayan program.

        // Soru 10: Kullanicidan iki sayi alinacak ve bu sayilarin toplami ekrana yazdirilacak, do while ile kullaniciya devam etmek isteyip istemedigi sorularak islem devam edecek program.

        // Soru 11: Kullanici istedigi kadar sayi girecek ve sonunda girilen sayilarin kac tanesinin negatif kac tanesinin pozitif oldugunu sayacak program.

        // Soru 12: Kullanici istedigi kadar sayilar girecek, en sonunda girilen en buyuk ve en kucuk sayiyi ekrana yazdiracak program.

        // Soru 13: 1-500 arasındaki Armstrong Sayilari ekrana yazdiran program.

        // Soru 14: Kullanicinin girdigi sayiya kadar Fibonacci serisini yazdiran program.

        // Soru 15: Kullanicinin girdigi n sayisina kadar 1 + 1/2 + 1/3 + ... + 1/n serisinin toplamini hesaplayan program.

        // Soru 16: 15. sorudaki seriyi 1 - 1/2 + 1/3 - 1/4 + 1/5 - ... 1/n şeklinde olacak şekilde yeniden hesaplayan program.

        // Soru 17: Program tarafından rastgele secilen bir sayiyi kullaniciya bulduran (tahmin oyunu) program. Sicak, soguk yazabiliriz :)

        // Sekil cizme ile ilgili calisma sorulari..
    }
}
