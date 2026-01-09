package CGQUESTIONS;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits = String.valueOf(n).length();
        int sum = 0;
        int temp = n;
        while(temp>0){
            sum+=(int)Math.pow(temp%10,digits);
            temp/=10;
        }
        System.out.println((sum==n)?"Armstrong":"not armstrong");
    }
}
