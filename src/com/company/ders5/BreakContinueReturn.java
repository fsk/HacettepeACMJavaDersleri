package com.company.ders5;

public class BreakContinueReturn {

    public static void main(String[] args) {
        // ilk break ornegi:
/*        int[] arrayOfInts = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            System.out.println(arrayOfInts[i]);
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }*/

        // ikinci break ornegi: (label ile beraber)
/*        int[][] arrayOfInts = {
                {32, 87, 3, 589},
                {12, 1076, 2000, 8},
                {622, 127, 77, 955}
        };
        int searchfor = 955;

        int i;
        int j = 0;
        boolean foundIt = false;

        // 0-0, 0-1, 0-2, 0-3, 1-0, 1-1, 1-2, 1-3, 2-0, 2-1, 2-2, 2-3
        search:
        // label kullanimi, iki donguyu tamamen sonlandirmak icin distaki donguye isim veriyoruz.
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at " + i + ", " + j);
        } else {
            System.out.println(searchfor + " not in the array");
        }*/

        // continue keyword
/*        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");*/

        // continue ornegi label ile
/*        String searchMe = "Look for a substring in me";
        String substring = "abc";
        boolean foundIt = false;

        int max = searchMe.length() - substring.length();

        test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            foundIt = true;
            break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it"); // ternary
        */


    }

    public static int hesapla(int a, int b) {
        for (int i = 0; i < 10; i++) {

            return a + b + i;
        }

        return 0;
    }


}
