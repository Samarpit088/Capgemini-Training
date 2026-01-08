package Strings.Level3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Write a program to find the frequency of characters in a string using unique characters and display the result
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();

        String[][] arr=frequency(text);
        System.out.println("Char\tFreq");
        for(String[] r:arr)
            System.out.println(r[0]+"\t"+r[1]);
    }
    public static char[] uniqueChars(String text){
        char[] temp=new char[text.length()];
        int k=0;
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            boolean u=true;
            for(int j=0;j<i;j++) if(text.charAt(j)==ch) u=false;
            if(u) temp[k++]=ch;
        }
        char[] res=new char[k];
        for(int i=0;i<k;i++) res[i]=temp[i];
        return res;
    }

    public static String[][] frequency(String text){
        int[] freq=new int[256];
        for(int i=0;i<text.length();i++) freq[text.charAt(i)]++;

        char[] uniq=uniqueChars(text);
        String[][] arr=new String[uniq.length][2];

        for(int i=0;i<uniq.length;i++){
            arr[i][0]=String.valueOf(uniq[i]);
            arr[i][1]=String.valueOf(freq[uniq[i]]);
        }
        return arr;
    }
}
