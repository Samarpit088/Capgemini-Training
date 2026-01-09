package CGQUESTIONS;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkPrime(n);
    }
    public static void checkPrime(int n){
        boolean prime = true;
        if(n < 2){
            System.out.println("Non-prime");
            return;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                prime = false;
                break;
            }
        }
        System.out.println(prime?"Prime":"Non-prime");
    }
}
