package ua.butsai.homework7;

/**
 * Преобразователь скорости
 * Пример в файле res//homework7.pdf
 */
public class KilometersToMiles {
    public static void main(String[] args) {

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);

    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            final double MILE = 0.6215040397762586;
            double miles = kilometersPerHour * MILE;
            return Math.round(miles);
        }
    }

    public static void printConversion(double kilometersPerHour) {

        long miles = toMilesPerHour(kilometersPerHour);
        if (miles < 0) {
            System.out.println("Неверное значение");
        } else {
            System.out.println(kilometersPerHour + " km/h" + " = " + miles + " mi/h");
        }
    }
}