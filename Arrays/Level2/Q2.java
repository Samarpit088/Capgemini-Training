package Arrays.Level2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
        Scanner sc = new Scanner(System.in);
        String[] names={"Amar","Akbar","Anthony"};
        int[] age=new int[3];
        double[] height=new double[3];

        for(int i=0;i<3;i++){
            System.out.print("Age of "+names[i]+": ");
            age[i]=sc.nextInt();
            System.out.print("Height of "+names[i]+": ");
            height[i]=sc.nextDouble();
        }

        int youngestI=0, tallestI=0;

        for(int i=1;i<3;i++){
            if(age[i]<age[youngestI]) youngestI=i;
            if(height[i]>height[tallestI]) tallestI=i;
        }

        System.out.println("Youngest: "+names[youngestI]);
        System.out.println("Tallest: "+names[tallestI]);
    }
}
