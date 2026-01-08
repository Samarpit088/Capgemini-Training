package Strings.Level2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Write a program to split the text into words, compare the result with the split() method and display the result
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();

        String[] user=splitWords(text);
        String[] built=text.split(" ");

        System.out.println("Match: "+compareArrays(user,built));
    }
    public static int findLength(String s) {
        int c = 0;
        try { while (true) { s.charAt(c); c++; } }
        catch(Exception e){ return c; }
    }
    public static String[] splitWords(String text) {

        int words = 1;
        for(int i=0;i<findLength(text);i++)
            if(text.charAt(i)==' ') words++;

        int[] spaceIndex = new int[words+1];
        spaceIndex[0] = -1;

        int k=1;
        for(int i=0;i<findLength(text);i++)
            if(text.charAt(i)==' ') spaceIndex[k++] = i;
        spaceIndex[k] = findLength(text);

        String[] result = new String[words];
        for(int i=0;i<words;i++){
            String w="";
            for(int j=spaceIndex[i]+1;j<spaceIndex[i+1];j++)
                w+=text.charAt(j);
            result[i]=w;
        }
        return result;
    }
    public static boolean compareArrays(String[] a, String[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++) if(!a[i].equals(b[i])) return false;
        return true;
    }
}
