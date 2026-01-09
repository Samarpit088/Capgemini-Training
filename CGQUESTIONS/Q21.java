package CGQUESTIONS;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),e=0,o=0;
        while(n>0){
            int d=n%10;
            if(d%2==0) e++; else o++;
            n/=10;
        }
        System.out.println("Even="+e+" Odd="+o);
    }
}
