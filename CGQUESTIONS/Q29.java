package CGQUESTIONS;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(sc.nextLine().replaceAll("[^a-zA-Z0-9 ]",""));
    }
}
