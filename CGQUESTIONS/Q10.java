package CGQUESTIONS;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = hcf(a,b);
        int lcm = a*b/hcf;
        System.out.println("HCF: " + hcf + "\nLCM: " + lcm);
    }
    public static int hcf(int a,int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
