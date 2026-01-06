package Arrays.Level1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // Create a program to find the mean height of players present in a football team.
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;

        for(int i = 0; i < 11; i++){
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        System.out.println("Mean Height = " + (sum / 11));
    }
}
