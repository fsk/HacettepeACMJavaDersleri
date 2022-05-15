package com.company.ders3;

public class IfElseCondition {

    public static void main(String[] args) {

        //IF - ELSE IF - ELSE

        int yas = 25;

        if (yas < 18) {
            System.out.println("Ehliyet alamazsiniz.");
        }else {
            System.out.println("Ehliyet alabilirsiniz.");
        }

        //******************************************************//

        boolean k1 = true;
        boolean k2 = false;
        boolean k3 = false;
        boolean k4 = true;
        boolean k5 = false;


        if (k1 && k2 || (k4 && k5 || (k3 || k4))) {
            System.out.println("if icine girdi.");
        }else {
            System.out.println("if icine girmedi");
        }


        //******************************************************//

        int notDegeri = 80;

        int a = 50;

        if (notDegeri >= 90 && notDegeri <= 100) {
            System.out.println("Notunuz AA");
           int b = 50;


        }else if (notDegeri >= 80 && notDegeri <= 89) {



            System.out.println("Notunuz BA");
        }else if (notDegeri <= 70 && notDegeri >= 79) {


            System.out.println("Notunuz BB");
        }else {

        }

        //System.out.println(b);


        System.out.println("*****");

        // & |
        boolean bir = false;


        if (bir | ekranaYaz(5)) {
            System.out.println("if blogu calisti.");
        }


    }

    public static boolean ekranaYaz(int a) {
        System.out.println("girilen sayi: " + a);
        return false;
    }


}
