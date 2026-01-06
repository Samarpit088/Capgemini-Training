package Arrays.Level2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] w=new double[n], h=new double[n], bmi=new double[n];
        String[] status=new String[n];

        for(int i=0;i<n;i++){
            w[i]=sc.nextDouble();
            h[i]=sc.nextDouble();
            bmi[i]=w[i]/(h[i]*h[i]);

            if(bmi[i]<18.5) status[i]="Underweight";
            else if(bmi[i]<25) status[i]="Normal";
            else if(bmi[i]<40) status[i]="Overweight";
            else status[i]="Obese";
        }

        for(int i=0;i<n;i++)
            System.out.println(h[i]+" "+w[i]+" "+bmi[i]+" "+status[i]);
    }
}
