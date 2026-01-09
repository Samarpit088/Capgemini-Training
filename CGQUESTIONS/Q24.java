package CGQUESTIONS;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next(),b=sc.next();
        int[] f=new int[26];
        for(char c:a.toCharArray()) f[c-'a']++;
        for(char c:b.toCharArray()) f[c-'a']--;
        boolean ok=true;
        for(int x:f) {
            if(x!=0) {
                ok=false;
                break;
            }
        }
        System.out.println(ok);
    }
}
