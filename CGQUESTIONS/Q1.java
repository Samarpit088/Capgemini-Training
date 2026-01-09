package CGQUESTIONS;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int v = 0;
        for(int i=0;i<str.length();i++){
            if("aeiouAEIOU".indexOf(str.charAt(i))!=-1) v++;
        }
        System.out.println(v);
    }
}
