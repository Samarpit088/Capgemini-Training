package Arrays.Level2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(), temp=num, count=0;

        while(temp!=0){ count++; temp/=10; }

        int[] arr=new int[count];
        for(int i=0;i<count;i++){
            arr[i]=num%10;
            num/=10;
        }

        for(int i=0;i<count;i++)
            System.out.print(arr[i]);
    }
}
