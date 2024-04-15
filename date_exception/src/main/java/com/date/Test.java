package com.date;

public class Test {
    public static void main(String[] args) {
        try {
            Date d1 = new Date(12, 3, 2024);
            d1.printDate();
            Date d2 = new Date(31, 3, 2024);
            d2.printDate();
        } catch (DException e) {
            System.out.println(e.getMessage());
        }
    }

}
