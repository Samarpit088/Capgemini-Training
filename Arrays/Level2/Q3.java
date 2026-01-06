package Arrays.Level2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int maxDigit=10;
        int[] digits=new int[maxDigit];
        int index=0;

        while(num!=0){
            if(index==maxDigit) break;
            digits[index++]=num%10;
            num/=10;
        }

        int largest=0, second=0;
        for(int i=0;i<index;i++){
            if(digits[i]>largest){
                second=largest;
                largest=digits[i];
            }
            else if(digits[i]>second && digits[i]!=largest){
                second=digits[i];
            }
        }
        System.out.println("Largest: "+largest);
        System.out.println("Second Largest: "+second);
    }
}
