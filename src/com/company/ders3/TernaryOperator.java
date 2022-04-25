package com.company.ders3;

public class TernaryOperator {

    public static void main(String[] args) {

        //ODEV SORUSU
        /**
         * Ekranda herhangi bir şekilde noktalı virgül (;) olmadan isminizi ekrana bastıran
         * program
         */

        //TERNARY OPERATOR
        int a = 5, b = 8, c = 0;

        /*if(a > b) {
            c = a - b;
        }else if (a < b) {
            c = a + b;
        }*/


        c = (a > b) ? (a - b) : (((a + b) > (a - b)) ? (a * b) : (a / b));

        System.out.println(c);






    }
}
