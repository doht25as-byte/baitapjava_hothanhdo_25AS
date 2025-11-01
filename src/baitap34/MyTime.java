package baitap34;

public class MyTime {
    // Private instance variables
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    // Constructors
    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // Setters
    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid time values!");
        }
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24)
            this.hour = hour;
        else
            throw new IllegalArgumentException("Hour must be between 0 and 23");
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60)
            this.minute = minute;
        else
            throw new IllegalArgumentException("Minute must be between 0 and 59");
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60)
            this.second = second;
        else
            throw new IllegalArgumentException("Second must be between 0 and 59");
    }

    // Getters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // toString() with leading zeros
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Increment and decrement methods
    public MyTime nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            nextMinute();
        }
        return this;
    }

    public MyTime nextMinute() {
        minute++;
        if (minute >= 60) {
            minute = 0;
            nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        hour++;
        if (hour >= 24) {
            hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            previousMinute();
        }
        return this;
    }

    public MyTime previousMinute() {
        minute--;
        if (minute < 0) {
            minute = 59;
            previousHour();
        }
        return this;
    }

    public MyTime previousHour() {
        hour--;
        if (hour < 0) {
            hour = 23;
        }
        return this;
    }
}