package Strings.Level2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // Write a program to split the text into words and find the shortest and longest strings in a given text
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text=sc.nextLine();

        String[] words=splitWords(text);
        String[][] data=wordsWithLength(words);
        int[] res=shortestLongest(data);

        System.out.println("Shortest Word: " + data[res[0]][0]);
        System.out.println("Longest Word : " + data[res[1]][0]);
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

        int[] pos = new int[words+1];
        pos[0] = -1;
        int k=1;
        for(int i=0;i<findLength(text);i++)
            if(text.charAt(i)==' ') pos[k++] = i;
        pos[k] = findLength(text);

        String[] arr = new String[words];
        for(int i=0;i<words;i++){
            String w="";
            for(int j=pos[i]+1;j<pos[i+1];j++)
                w += text.charAt(j);
            arr[i]=w;
        }
        return arr;
    }
    public static String[][] wordsWithLength(String[] words){
        String[][] arr=new String[words.length][2];
        for(int i=0;i<words.length;i++){
            arr[i][0]=words[i];
            arr[i][1]=String.valueOf(findLength(words[i]));
        }
        return arr;
    }
    public static int[] shortestLongest(String[][] data){
        int min=0,max=0;
        for(int i=1;i<data.length;i++){
            if(Integer.parseInt(data[i][1]) < Integer.parseInt(data[min][1])) min=i;
            if(Integer.parseInt(data[i][1]) > Integer.parseInt(data[max][1])) max=i;
        }
        return new int[]{min,max};
    }
}
