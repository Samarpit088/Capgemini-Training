package CGQUESTIONS;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(temp>0){
            rev = rev*10 + temp%10;
            temp/=10;
        }
        System.out.println((rev==n)?"true":"false");
    }
}

