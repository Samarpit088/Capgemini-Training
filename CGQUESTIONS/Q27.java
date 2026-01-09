package CGQUESTIONS;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(char c:s.toCharArray()) {
            System.out.println(c + " = " + (int) c);
        }
    }
}
