package CGQUESTIONS;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = String.valueOf(n);

        int sum = 0;
        for(int i = 0; i < num.length(); i++){
            if((i+1) % 2 == 0){
                sum += num.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
