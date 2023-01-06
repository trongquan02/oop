package homework3;

public class DateUtil {
    public static String[] strMonths
            = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static int[] daysInMonths
            = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int[] nonLeapYear = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    public static int[] leapYear = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    public static String[] strDays = {"Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"};

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 0) {
            return false;
        }
        if (month < 0 || month > 12) {
            return false;
        }
        if (isLeapYear(year)) {
            if (month == 2 && day <= 29) {
                return true;
            }
        }
        if (day < 0 || day > daysInMonths[month - 1]) {
            return false;
        }
        return true;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int magicCenturyNumber = 6 - 2 * ((year / 100) % 4);
        int lastTwoDigitsOfYear = year % 100;
        int magicYearNumber = lastTwoDigitsOfYear / 4;
        int magicMonthNumber;
        if (isLeapYear(year)) {
            magicMonthNumber = leapYear[month - 1];
        } else {
            magicMonthNumber = nonLeapYear[month - 1];
        }
        return (day + magicMonthNumber + magicCenturyNumber
                + lastTwoDigitsOfYear + magicYearNumber) % 7;
    }

    public static String toString(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return "Not a valid date!";
        }
        int d = getDayOfWeek(year, month, day);
        return strDays[d] + " " + day + " " + strMonths[month - 1] + " " + year;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1990));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));
        System.out.println();

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));
        System.out.println();

        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2012, 2, 17));
        System.out.println();

        System.out.println(toString(2012, 2, 14));
    }
}
