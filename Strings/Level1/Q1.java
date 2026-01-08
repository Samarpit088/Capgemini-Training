package Strings.Level1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String str1 = sc.next();
        System.out.print("Enter second string : ");
        String str2 = sc.next();
        boolean res1 = usingCharAt(str1,str2);
        System.out.println("Using charAt(): "  + res1);
        boolean res2 = str1.equals(str2);
        System.out.println("Using equals(): " + res2);
        if(res1==res2){
            System.out.println("Results are same");
        }
        else{
            System.out.println("Results are not same");
        }
    }
    public static boolean usingCharAt(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)) return false;
        }
        return true;
    }
}
