public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        // Test cases
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    // This method only looks at the years and days
    public static void printYearsAndDays(long minutes) {
        // in negative number, the parameter is an invalid value
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        int days = (int) minutes / (24 * 60); // this will convert the minutes into total days
        int years = days / 365; // it will give a whole number of years
        int daysLeft = days % 365; // remainder of days
        System.out.println(minutes + " min = " + years + " y and " + daysLeft + " d");
    }
}
