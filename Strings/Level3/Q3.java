package Strings.Level3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Write a program to find the first non-repeating character in a string and show the result
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();

        char res = firstUnique(text);
        if(res!='\0') System.out.println("First Non-Repeating Character: "+res);
        else System.out.println("No unique character found.");
    }
    public static char firstUnique(String text){
        int[] freq = new int[256];

        for(int i=0;i<text.length();i++)
            freq[text.charAt(i)]++;

        for(int i=0;i<text.length();i++)
            if(freq[text.charAt(i)]==1) return text.charAt(i);

        return '\0';
    }
}
