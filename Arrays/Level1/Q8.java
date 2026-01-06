package Arrays.Level1;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        // Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = 10;
        int[] factors = new int[max];
        int index = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                if(index == max){
                    max *= 2;
                    int[] temp = new int[max];
                    for(int j = 0; j < index; j++)
                        temp[j] = factors[j];
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        for(int i = 0; i < index; i++)
            System.out.print(factors[i] + " ");
    }
}
