package CGQUESTIONS;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        int[] f=new int[26];
        for(char c:s.toCharArray()) if(c>='a') f[c-'a']++;
        for(int i=0;i<26;i++)
            if(f[i]>0) System.out.println((char)(i+'a')+" = "+f[i]);
    }
}
