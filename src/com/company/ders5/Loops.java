package com.company.ders5;

import java.util.*;

public class Loops {

    public static void main(String[] args) {
        // while, do-while, for (foreach).
        // while loop:
        boolean expression = false;
        while (expression) {

        }

        int count = 1;
        while (count < 11) {
            //System.out.println("Count is: " + count);
            count++;
        }

        // infinite loop:
        while (true) {
            // bu kod blogu her zaman calisacak..
            break;
        }

        // do-while loop type:
        do {


        } while (expression);


        count = 1;
        do {
            //System.out.println("Count is: " + count);
            count++;
        } while (count < 11);



        // for loops
        for (int i = 1; i < 11 ; i = i + 2) {
            // System.out.println("Count is: " + i);
        }

        // infinite loop with for
/*        for ( ; ; ) {

        }*/

        // foreach loop
        int[] numbers = {3, 5, 7, 9, 2, 4, 6, 8, 10}; // collection ve arrayler konusu daha sonra detayli anlatilacak.
        List<Integer> numberList = Arrays.asList(1, 3, 5, 7, 8, 6, 4, 2, 0);
        for (Integer number : numberList) {
            // System.out.println("Count is: " + number);
        }

        /* dallanma ifadeleri */
        // continue;
        // break;
        // return;
    }
}
