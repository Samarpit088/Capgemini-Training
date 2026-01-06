package Arrays.Level2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for(int i=0;i<10;i++){
            System.out.println("Employee " + (i+1));
            System.out.print("Salary: ");
            salary[i] = sc.nextDouble();
            System.out.print("Years of Service: ");
            service[i] = sc.nextDouble();

            if(salary[i]<=0 || service[i]<0){
                System.out.println("Invalid input, enter again!");
                i--;
            }
        }

        for(int i=0;i<10;i++){
            if(service[i]>5)
                bonus[i] = salary[i]*0.05;
            else
                bonus[i] = salary[i]*0.02;

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus: "+totalBonus);
        System.out.println("Total Old Salary: "+totalOldSalary);
        System.out.println("Total New Salary: "+totalNewSalary);
    }
}
