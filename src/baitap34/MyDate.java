package baitap34;

public class MyDate {
    // Instance variables
    private int year;
    private int month;
    private int day;

    // Constants
    public static final String[] MONTHS =
            {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                    "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static final String[] DAYS =
            {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static final int[] DAYS_IN_MONTHS =
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Constructor
    public MyDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid date!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Static utility methods
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || month < 1 || month > 12) return false;
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) maxDay = 29;
        return day >= 1 && day <= maxDay;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        // Zeller’s Congruence algorithm
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int h = (day + (13 * (month + 1)) / 5 + k + k/4 + j/4 + 5*j) % 7;
        return (h + 6) % 7;  // Convert to 0=Sunday
    }

    // Getters
    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }

    // Setters
    public void setYear(int year) {
        if (isValidDate(year, this.month, this.day)) this.year = year;
        else throw new IllegalArgumentException("Invalid year for current date");
    }

    public void setMonth(int month) {
        if (isValidDate(this.year, month, this.day)) this.month = month;
        else throw new IllegalArgumentException("Invalid month for current date");
    }

    public void setDay(int day) {
        if (isValidDate(this.year, this.month, day)) this.day = day;
        else throw new IllegalArgumentException("Invalid day for current date");
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) throw new IllegalArgumentException("Invalid date!");
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // toString: "Tuesday 14 Feb 2012"
    @Override
    public String toString() {
        int dayOfWeek = getDayOfWeek(year, month, day);
        return String.format("%s %d %s %d", DAYS[dayOfWeek], day, MONTHS[month - 1], year);
    }

    // Next / Previous Day
    public MyDate nextDay() {
        day++;
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) maxDay = 29;

        if (day > maxDay) {
            day = 1;
            nextMonth();
        }
        return this;
    }

    public MyDate previousDay() {
        day--;
        if (day < 1) {
            previousMonth();
            int maxDay = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) maxDay = 29;
            day = maxDay;
        }
        return this;
    }

    public MyDate nextMonth() {
        month++;
        if (month > 12) {
            month = 1;
            year++;
        }
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) maxDay = 29;
        if (day > maxDay) day = maxDay;
        return this;
    }

    public MyDate previousMonth() {
        month--;
        if (month < 1) {
            month = 12;
            year--;
        }
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) maxDay = 29;
        if (day > maxDay) day = maxDay;
        return this;
    }

    public MyDate nextYear() {
        if (isValidDate(year + 1, month, day)) year++;
        else { year++; day = 28; } // adjust for Feb 29
        return this;
    }

    public MyDate previousYear() {
        if (isValidDate(year - 1, month, day)) year--;
        else { year--; day = 28; } // adjust for Feb 29
        return this;
    }
}
