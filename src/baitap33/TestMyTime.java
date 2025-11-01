package baitap33;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime t1 = new MyTime(23, 59, 58);
        System.out.println("Current Time: " + t1);

        t1.nextSecond();
        System.out.println("After nextSecond(): " + t1);

        t1.nextSecond();
        System.out.println("After nextSecond(): " + t1);

        t1.previousMinute();
        System.out.println("After previousMinute(): " + t1);

        t1.previousHour();
        System.out.println("After previousHour(): " + t1);
    }
}