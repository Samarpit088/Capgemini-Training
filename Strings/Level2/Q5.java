package Strings.Level2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text=sc.nextLine();

        int[] res=countVC(text);

        System.out.println("Vowels: "+res[0]);
        System.out.println("Consonants: "+res[1]);
    }
    public static String checkChar(char ch){
        if(ch>='A'&&ch<='Z') ch=(char)(ch+32);
        if(ch>='a'&&ch<='z'){
            if("aeiou".indexOf(ch)!=-1) return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }
    public static int[] countVC(String text){
        int v=0,c=0;
        for(int i=0;i<text.length();i++){
            String r=checkChar(text.charAt(i));
            if(r.equals("Vowel")) v++;
            else if(r.equals("Consonant")) c++;
        }
        return new int[]{v,c};
    }
}
