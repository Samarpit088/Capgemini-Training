package Strings.Level2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text=sc.nextLine();

        String[][] data=classifyChars(text);

        System.out.println("\nChar\tType");
        for(int i=0;i<data.length;i++){
            System.out.println(data[i][0]+"\t"+data[i][1]);
        }
    }
    public static String checkChar(char ch){
        if(ch>='A'&&ch<='Z') ch=(char)(ch+32);
        if(ch>='a'&&ch<='z'){
            if("aeiou".indexOf(ch)!=-1) return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] classifyChars(String text){
        String[][] arr=new String[text.length()][2];
        for(int i=0;i<text.length();i++){
            arr[i][0]=String.valueOf(text.charAt(i));
            arr[i][1]=checkChar(text.charAt(i));
        }
        return arr;
    }
}
