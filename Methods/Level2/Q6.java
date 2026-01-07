package Methods.Level2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Celsius = " + convertFarhenheitToCelsius(f));

        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit = " + convertCelsiusToFarhenheit(c));

        System.out.print("Enter Pounds: ");
        double p = sc.nextDouble();
        System.out.println("Kilograms = " + convertPoundsToKilograms(p));

        System.out.print("Enter Kilograms: ");
        double k = sc.nextDouble();
        System.out.println("Pounds = " + convertKilogramsToPounds(k));

        System.out.print("Enter Gallons: ");
        double g = sc.nextDouble();
        System.out.println("Liters = " + convertGallonsToLiters(g));

        System.out.print("Enter Liters: ");
        double l = sc.nextDouble();
        System.out.println("Gallons = " + convertLitersToGallons(l));
    }
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
}
