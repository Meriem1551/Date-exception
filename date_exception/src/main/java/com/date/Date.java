package com.date;

public class Date {
    int day, month, year;

    public Date(int d, int m, int y) throws DException {
        if (d < 1 || d > 30 || m < 1 || m > 12) {
            throw new DException("\nInvalid date");
        }
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public void printDate() {
        System.out.println("\n" + this.day + "/" + this.month + "/" + this.year);
    }
}
