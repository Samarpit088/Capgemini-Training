package CGQUESTIONS;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary string: ");
        String bin = sc.next();
        int dec = binaryToDecimal(bin);
        System.out.println("Decimal: " + dec);

        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();
        String binStr = decimalToBinary(n);
        System.out.println("Binary: " + binStr);
    }

    public static int binaryToDecimal(String bin){
        int dec = 0;
        for(int i = 0; i < bin.length(); i++){
            char ch = bin.charAt(i);
            if(ch == '1'){
                dec = dec * 2 + 1;
            } else{
                dec = dec * 2;
            }
        }
        return dec;
    }

    public static String decimalToBinary(int n){
        if(n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            sb.insert(0, n % 2);
            n /= 2;
        }
        return sb.toString();
    }
}
