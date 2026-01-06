package Arrays.Level2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        // Rewrite the above program using multidimensional array to store height, weight, and BMI in 2D array for all the persons
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for(int i = 0; i < number; i++){
            System.out.println("\nPerson " + (i+1));

            System.out.print("Enter Weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter Height (meters): ");
            personData[i][1] = sc.nextDouble();

            if(personData[i][0] <= 0 || personData[i][1] <= 0){
                System.out.println("Invalid input! Enter positive values.");
                i--;
            }
        }

        for(int i = 0; i < number; i++){
            double weight = personData[i][0];
            double height = personData[i][1];

            personData[i][2] = weight / (height * height);

            if(personData[i][2] < 18.5)
                weightStatus[i] = "Underweight";
            else if(personData[i][2] < 25)
                weightStatus[i] = "Normal";
            else if(personData[i][2] < 40)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for(int i = 0; i < number; i++){
            System.out.println(
                    personData[i][1] + "\t" +
                            personData[i][0] + "\t" +
                            personData[i][2] + "\t" +
                            weightStatus[i]
            );
        }
    }
}
