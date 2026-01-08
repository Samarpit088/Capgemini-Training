package Strings.Level3;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //Write a program to find the frequency of characters in a string using nested loops and display the result
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();

        String[] arr=frequency(text);
        for(String s:arr) System.out.println(s);
    }
    public static String[] frequency(String text){
        char[] ch=text.toCharArray();
        int[] freq=new int[ch.length];

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0') continue;
            freq[i]=1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    freq[i]++;
                    ch[j]='0';
                }
            }
        }

        int count=0;
        for(int i=0;i<ch.length;i++) if(ch[i]!='0') count++;

        String[] res=new String[count];
        int k=0;
        for(int i=0;i<ch.length;i++)
            if(ch[i]!='0')
                res[k++]=ch[i]+" = "+freq[i];
        return res;
    }

}
