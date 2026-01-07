package Methods.Level1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // Write a program SpringSeason that takes two int values month and day from the command line and prints “It's a Spring Season” otherwise prints “Not a Spring Season”.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter Day: ");
        int day = sc.nextInt();

        if (isSpring(month, day))
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
    static boolean isSpring(int month, int day) {
        if (month == 3 && day >= 20) return true;
        if (month == 4 || month == 5) return true;
        if (month == 6 && day <= 20) return true;
        return false;
    }
}
