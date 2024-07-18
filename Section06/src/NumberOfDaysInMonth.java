public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600)); // false
        System.out.println(isLeapYear(1600)); // true
        System.out.println(isLeapYear(2017)); // false
        System.out.println(isLeapYear(2000)); // true

        System.out.println(getDaysInMonth(1, 2020)); // 31
        System.out.println(getDaysInMonth(2, 2020)); // 29
        System.out.println(getDaysInMonth(2, 2018)); // 28
        System.out.println(getDaysInMonth(-1, 2020)); // -1
        System.out.println(getDaysInMonth(1, -2020)); // -1
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 0 || year > 9999) {
            return -1;
        }

        boolean leapYear = isLeapYear(year);

        // need return switch when need to return the value or assign a value ex. int days = switch()
        // when using block within switch statement, each block need to use yield
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> {
                if (leapYear) {
                    yield 29;
                }
                yield 28;
            }
            case 4, 6, 9, 11 -> 30;
            default -> -1;
        };
    }
}
