package Levels.Level3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Create a program to check if a number is armstrong or not. Use the hints to show the steps clearly in the code
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int sum = 0;
        int digits = String.valueOf(number).length();
        int temp= number;
        while(temp>0){
            int rem = temp%10;
            sum+=(int)Math.pow(rem,digits);
            temp/=10;
        }

        if (sum == number)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
