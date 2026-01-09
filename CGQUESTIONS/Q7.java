package CGQUESTIONS;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z')
                freq[s.charAt(i)-'a']++;
        }
        boolean flag = false;
        for(int i=0;i<26;i++){
            if(freq[i]==0) {
                flag = true;
                break;
            }
        }
        System.out.println((flag?"Not a pangram":"pangram"));

    }
}
