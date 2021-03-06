package com.company.ders5;

public class StringSwitchDemo {

    public static void main(String[] args) {

        String month = "SEPTEMBER";

        int returnedMonthNumber = StringSwitchDemo.getMonthNumber(month);

        if (returnedMonthNumber == 0) {
            System.out.println("Invalid month");
        } else {
            System.out.println(returnedMonthNumber);
        }
    }

    public static int getMonthNumber(String month) {

        int monthNumber = 0;

        if (month == null) {
            return monthNumber;
        }

        // month.equalsIgnoreCase("a", "A");

        switch (month.toLowerCase()) {
            case "january": monthNumber = 1;
                break;
            case "february": monthNumber = 2;
                break;
            case "march": monthNumber = 3;
                break;
            case "april": monthNumber = 4;
                break;
            case "may": monthNumber = 5;
                break;
            case "june": monthNumber = 6;
                break;
            case "july": monthNumber = 7;
                break;
            case "august": monthNumber = 8;
                break;
            case "september": monthNumber = 9;
                break;
            case "october": monthNumber = 10;
                break;
            case "november": monthNumber = 11;
                break;
            case "december": monthNumber = 12;
                break;
            default: monthNumber = 0;
                break;
        }
        return monthNumber;
    }

    // java 17 ile beraber gelen ozellikler sayesinde lambda ile switch-case kullanabiliyoruz.
/*    switch (day) {
        case "Monday"-> "Week day";
        case "Tuesday"-> "Week day";
        case "Wednesday"->"Week day";
        case "Thursday"->"Week day";
        case "Friday"->"Week day";
        case "Saturday"-> "Weekend";
        case "Sunday"-> "Weekend";
        default->"Unknown";
    };*/
}