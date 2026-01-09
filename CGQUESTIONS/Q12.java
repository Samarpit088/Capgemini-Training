package CGQUESTIONS;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            boolean p=i>1;
            for(int j=2;j*j<=i;j++) {
                if(i%j==0) {
                    p=false;
                }
            }
            if(p) System.out.print(i+" ");
        }

    }
}
