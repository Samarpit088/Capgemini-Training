package Strings.Level3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // Find unique characters in a string using the charAt() method and display the result
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();

        char[] res=uniqueCharacters(text);
        System.out.println("Unique Characters:");
        for(char c:res) System.out.print(c+" ");
    }
    public static int length(String s){
        int c=0; try{ while(true){ s.charAt(c); c++; } }
        catch(Exception e){ return c; }
    }

    public static char[] uniqueCharacters(String text){
        char[] temp = new char[length(text)];
        int k=0;

        for(int i=0;i<length(text);i++){
            char ch = text.charAt(i);
            boolean unique = true;
            for(int j=0;j<i;j++)
                if(text.charAt(j)==ch) unique=false;
            if(unique) temp[k++] = ch;
        }

        char[] res = new char[k];
        for(int i=0;i<k;i++) res[i]=temp[i];
        return res;
    }
}
