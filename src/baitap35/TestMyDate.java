package baitap35;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(2012, 2, 14);
        System.out.println(d1); // Tuesday 14 Feb 2012

        d1.nextDay();
        System.out.println("Next Day: " + d1);

        d1.previousMonth();
        System.out.println("Previous Month: " + d1);

        d1.nextYear();
        System.out.println("Next Year: " + d1);

        System.out.println("Is leap year? " + MyDate.isLeapYear(2024));
    }
}