public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes >= 0) {
            long days = minutes / 1440;
            long years = days / 365;
            days = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");

        } else {
            System.out.println("Invalid Value");
        }
    }
}

