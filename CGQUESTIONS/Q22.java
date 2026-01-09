package CGQUESTIONS;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n-1];
        for(int i=0;i<n-1;i++)
            a[i]=sc.nextInt();
        int sum=n*(n+1)/2,arrSum=0;
        for(int x:a)
            arrSum+=x;
        System.out.println(sum-arrSum);
    }
}
