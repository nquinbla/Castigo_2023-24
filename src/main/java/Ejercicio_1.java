public class Ejercicio_1 {
    public static void main(String[] args) {
        short daysInYear = 365;
        short hoursInDay = 24;
        short minutesInHour = 60;
        short secondsInMinute = 60;

        int years = 1;
        int months = 1;
        int days = 1;

        long totalSeconds = years * daysInYear * hoursInDay * minutesInHour * secondsInMinute;
        System.out.println("Total seconds in " + years + " year: " + totalSeconds);

    }

    public static long calculateSeconds(int years, int months, int days, int hours, int minutes, int daysInYear, short hoursInDay, short minutesInHour, short secondsInMinute) {
        long totalDays = years * daysInYear + months * (daysInYear / 12) + days;
        long totalHours = totalDays * hoursInDay;
        long totalMinutes = totalHours * minutesInHour;
        long totalSeconds = totalMinutes * secondsInMinute;
        return totalMinutes * secondsInMinute;
    }
}

