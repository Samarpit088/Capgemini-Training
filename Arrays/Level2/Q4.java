package Arrays.Level2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();

        int maxDigit=10;
        int[] digits=new int[maxDigit];
        int index=0;

        while(num!=0){
            if(index==maxDigit){
                maxDigit+=10;
                int[] temp=new int[maxDigit];
                for(int i=0;i<digits.length;i++)
                    temp[i]=digits[i];
                digits=temp;
            }
            digits[index++]=(int)num%10;
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
