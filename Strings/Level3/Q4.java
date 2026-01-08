package Strings.Level3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // Write a program to find the frequency of characters in a string using the charAt() method and display the result
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();

        String[][] arr=frequency(text);
        System.out.println("Char\tFreq");
        for(String[] r:arr)
            System.out.println(r[0]+"\t"+r[1]);
    }
    public static String[][] frequency(String text){
        int[] freq=new int[256];

        for(int i=0;i<text.length();i++)
            freq[text.charAt(i)]++;

        int count=0;
        for(int i=0;i<256;i++) if(freq[i]>0) count++;

        String[][] res=new String[count][2];
        int k=0;
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                res[k][0]=String.valueOf((char)i);
                res[k][1]=String.valueOf(freq[i]);
                k++;
            }
        }
        return res;
    }
}
