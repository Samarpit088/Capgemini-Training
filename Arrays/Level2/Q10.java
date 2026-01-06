package Arrays.Level2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        // Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(), temp=num, count=0;

        while(temp!=0){ count++; temp/=10; }

        int[] digits=new int[count];
        for(int i=0;i<count;i++){
            digits[i]=num%10;
            num/=10;
        }

        int[] freq=new int[10];
        for(int i=0;i<count;i++)
            freq[digits[i]]++;

        for(int i=0;i<10;i++)
            System.out.println(i+" -> "+freq[i]);
    }
}
