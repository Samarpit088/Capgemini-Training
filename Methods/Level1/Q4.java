package Methods.Level1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side A: ");
        double a = sc.nextDouble();

        System.out.print("Enter side B: ");
        double b = sc.nextDouble();

        System.out.print("Enter side C: ");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);
        System.out.println("Number of rounds to complete 5km = " + rounds);
    }
    static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

}
