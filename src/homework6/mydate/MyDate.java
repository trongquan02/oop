package homework6.mydate;

public class MyDate {
    private int year;
    private int month;
    private int day;
    private String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        if ((year % 4 == 0 & year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || day < 1 || month < 1 || month > 12) {
            return false;
        }
        if (isLeapYear(year)) {
            if (month == 2 && day <= 29) {
                return true;
            }
        }
        if (day < 0 || day > DAYS_IN_MONTHS[month - 1]) {
            return false;
        }
        return true;
    }

    public int getDayOfWeek(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return -1;
        }
        int numOfCentury = 6 - 2 * ((year / 100) % 4);
        int last2DigitYear = year % 100;
        int[] numOfYear;
        if (!isLeapYear(year)) {
            numOfYear = new int[]{0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        } else {
            numOfYear = new int[]{6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        }
        int sum = numOfCentury + last2DigitYear
                + last2DigitYear / 4 + numOfYear[month - 1] + day;
        return sum % 7;
    }

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month or day!");
        }
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (year < 1) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public int getDayOfMonth(int year, int month) {
        return DAYS_IN_MONTHS[month - 1] + (isLeapYear(year) & month == 2 ? 1 : 0);
    }

    public void setDay(int day) {
        if (day < 1 || day > getDayOfMonth(year, month)) {
            throw new IllegalArgumentException("Invalid day!");
        }
        this.day = day;
    }

    @Override
    public String toString() {
        String weekday = DAYS[getDayOfWeek(year, month, day)];
        return weekday + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        try {
            setDate(year, month, ++day);
            return this;
        } catch (IllegalArgumentException e) {

        }
        day = 1;
        return nextMonth();
    }

    public MyDate nextMonth() {
        try {
            setDate(year, ++month, day);
            if (day > getDayOfMonth(year, month)) {
                day = getDayOfMonth(year, month);
            }
            return this;
        } catch (IllegalArgumentException e) {

        }
        month = 1;
        return nextYear();
    }

    public MyDate nextYear() {
        setDate(++year, month, day);
        if (day > getDayOfMonth(year, month)) {
            day = getDayOfMonth(year, month);
        }
        return this;
    }

    public MyDate previousDay() {
        try {
            setDate(year, month, --day);
            return this;
        } catch (IllegalArgumentException e) {

        }
        return previousMonth();
    }

    public MyDate previousMonth() {
        try {
            if (month == 1) {
                day = getDayOfMonth(year, 12);
            } else {
                day = getDayOfMonth(year, month - 1);
            }
            setDate(year, --month, day);
            return this;
        } catch (IllegalArgumentException e) {

        }
        month = 12;
        return previousYear();
    }

    public MyDate previousYear() {
        day = getDayOfMonth(year - 1, month);
        setDate(--year, month, day);
        return this;
    }


}
