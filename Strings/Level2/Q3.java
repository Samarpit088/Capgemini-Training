package Strings.Level2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] data = wordsWithLength(words);

        for(int i=0;i<data.length;i++){
            System.out.println("Word: " + data[i][0] + "\t" + "Length: " + Integer.parseInt(data[i][1]));
        }
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
        String[][] arr = new String[words.length][2];
        for(int i=0;i<words.length;i++){
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(findLength(words[i]));
        }
        return arr;
    }
}
