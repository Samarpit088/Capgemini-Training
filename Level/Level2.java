package Level;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        // 1. Write a program to take 2 numbers and print their quotient and reminder
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two number " + number1 + " and " + number2);

        // 2. Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int r1 = a + b * c;
        int r2 = a * b + c;
        int r3 = c + a / b;
        int r4 = a % b + c;
        System.out.println("The results of Int Operations are " + r1 + ", " + r2 + ", " + r3 + " and " + r4);

        // 3. Similarly, write the DoubleOpt program by taking double values and doing the same operations.
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();

        double res1 = a1 + b1 * c1;
        double res2 = a1 * b1 + c1;
        double res3 = c1 + a1 / b1;
        double res4 = a1 % b1 + c1;
        System.out.println("The results of Double Operations are " + res1 + ", " + res2 + ", " + res3 + " and " + res4);

        // 4.Write a TemperaturConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("The " + celsius + " celsius is " + fahrenheit + " fahrenheit");

        // 5. Write a TemperaturConversion program, given the temperature in Fahrenheit as input outputs the temperature in Celsius
        double fahren = sc.nextDouble();
        double cels = (fahren - 32) * 5/9;
        System.out.println("The " + fahren + " fahrenheit is " + cels + " celsius");

        // 6. Create a program to find the total income of a person by taking salary and bonus from user
        double salary = sc.nextDouble();
        double bonus = sc.nextDouble();

        double income = salary + bonus;
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + income);

        // 7. Create a program to swap two numbers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("The swapped numbers are " + num1 + " and " + num2);

        sc.nextLine();
        // 8. Rewrite the Sample Program 2 with user inputs
        String name = sc.nextLine();
        String fromCity = sc.nextLine();
        String viaCity = sc.nextLine();
        String toCity = sc.nextLine();

        double fromToVia = sc.nextDouble();
        double viaToFinal = sc.nextDouble();
        double timeTaken = sc.nextDouble();
        double totalDistance = fromToVia + viaToFinal;
        double speed = totalDistance / timeTaken;
        System.out.println(name + " travelled from " + fromCity + " to " + toCity + " via " + viaCity + ". Total distance = " + totalDistance + " miles in " + timeTaken + " hours. Average speed = " + speed + " miles/hr");

        // 9. An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");


        // 10. Create a program to divide N number of chocolates among M children.
        int numberOfChocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();

        int each = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;
        System.out.println("The number of chocolates each child gets is " + each + " and the number of remaining chocolates are " + remaining);

        // 11. Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double si = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is " + si + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);

        // 12. Create a program to convert weight in pounds to kilograms.
        double pound = sc.nextDouble();
        double kg = pound / 2.2;

        System.out.println("The weight of the person in pound is " + pound + " and in kg is " + kg);
    }
}
