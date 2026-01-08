package Strings.Level3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual
        Scanner sc=new Scanner(System.in);
        double[][] data = new double[10][2];

        for(int i=0;i<10;i++){
            System.out.print("Enter Weight of person "+(i+1)+": ");
            data[i][0]=sc.nextDouble();
            System.out.print("Enter Height(cm) of person "+(i+1)+": ");
            data[i][1]=sc.nextDouble();
        }

        display(generateReport(data));
    }
    public static String[] bmiStatus(double bmi){
        if(bmi < 18.5) return new String[]{String.valueOf(bmi),"Underweight"};
        else if(bmi < 25) return new String[]{String.valueOf(bmi),"Normal"};
        else if(bmi < 40) return new String[]{String.valueOf(bmi),"Overweight"};
        else return new String[]{String.valueOf(bmi),"Obese"};
    }

    public static String[][] generateReport(double[][] data){
        String[][] report = new String[10][4];
        for(int i=0;i<10;i++){
            double weight = data[i][0];
            double height = data[i][1] / 100;  // cm → meter
            double bmi = weight / (height * height);

            String[] res = bmiStatus(bmi);
            report[i][0] = String.valueOf(height*100);
            report[i][1] = String.valueOf(weight);
            report[i][2] = res[0];
            report[i][3] = res[1];
        }
        return report;
    }

    public static void display(String[][] arr){
        System.out.println("Height(cm)\tWeight\tBMI\t\tStatus");
        for(int i=0;i<10;i++){
            System.out.println(arr[i][0]+"\t\t"+arr[i][1]+"\t"+arr[i][2]+"\t"+arr[i][3]);
        }
    }

}
