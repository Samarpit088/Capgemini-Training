package Level;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        // 1 . Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024.
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is " + age);

        // 2. Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM.
        int marksInMaths = 94;
        int marksInPhysics = 95;
        int marksInChemistry = 96;
        double averageMarks = (marksInMaths + marksInPhysics + marksInChemistry) / 3.0;
        System.out.println("Sam’s average mark in PCM is"  + averageMarks);

        // 3. Create a program to convert the distance of 10.8 kilometers to miles.
        double distanceInKilometer = 10.8;
        double distanceInMiles = distanceInKilometer/1.6;
        System.out.println("The distance " + distanceInKilometer + " in miles is " + distanceInMiles);

        // 4. Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191.
        int costPrice = 129;
        int sellingPrice = 191;
        double profit =  sellingPrice - costPrice;
        double profitPercentage = (profit/costPrice) * 100;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);

        // 5. Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
        int totalNumberOfPens = 14;
        int totalNumberOfStudents = 3;
        int pensReceived = totalNumberOfPens/totalNumberOfStudents;
        int pensRemaining = totalNumberOfPens%totalNumberOfStudents;
        System.out.println( "The Pen Per Student is " + pensReceived + " and the remaining pen not distributed is " + pensRemaining);

        // 6. The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.
        int fee = 125000;
        int discountPercent = 10;
        double discount = fee * discountPercent/100.0;
        double finalDiscountedFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalDiscountedFee);

        // 7. Write a Program to compute the volume of Earth in km^3 and miles^3
        double PI = Math.PI;
        int radiusOfEarthInKilometers = 6378;
        double radiusOfEarthInMiles = radiusOfEarthInKilometers/1.6;
        double volumeOfEarthInKilometers = (4.0/3.0) * PI * Math.pow(radiusOfEarthInKilometers,3);
        double volumeOfEarthInMiles = (4.0/3.0) * PI * Math.pow(radiusOfEarthInMiles,3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeOfEarthInKilometers + " and cubic miles is " + volumeOfEarthInMiles);

        // 8. Create a program to convert distance in kilometers to miles.
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = km/1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + "km");

        // 9. Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
        int studentFee = sc.nextInt(); // using studentFee as fee is already used
        int discountPercentage = sc.nextInt();
        double universityDiscount = studentFee * discountPercentage/100.0; // using universityDiscount as discount is already used;
        double finalFeeAfterDiscount = studentFee - universityDiscount;
        System.out.println("The discount amount is INR " + universityDiscount + " and final discounted fee is INR " + finalFeeAfterDiscount);

        // 10. Write a program that takes your height in centimeters and converts it into feet and inches
        double heightInCentimeters = sc.nextDouble();
        double heightInInches = heightInCentimeters / 2.54;
        double heightInFeet = heightInInches / 12;
        System.out.println("Your Height in cm is " + heightInCentimeters + " while in feet is "  + heightInFeet + " and inches is " +heightInInches);

        // 11. Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number1 / number2;
        System.out.println("The addition, subtraction, multiplication and division value of " + number1 + " and " + number2 + " is " + add + ", " + sub + ", " + mul + " and " + div);

        // 12. Write a program that takes the base and height to find area of a triangle in square inches and square centimeters
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;
        System.out.println("Area of triangle in square inches is " + areaInInches + " and in square centimeters is " + areaInCm);

        // 13. Write a program to find the side of the square whose parameter you read from user
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        // 14. Write a program the find the distance in yards and miles for the distance provided by user in feet
        double feet = sc.nextDouble();
        double yards = feet / 3;
        double mile = yards / 1760;
        System.out.println("Distance in yards is " + yards + " and in miles is " + mile);

        // 15. Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        // 16. Create a program to find the maximum number of handshakes among N number of students.
        int numberOfStudents = sc.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("Maximum number of handshakes is " + handshakes);
    }
}

