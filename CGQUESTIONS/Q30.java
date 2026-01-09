package CGQUESTIONS;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] arr=sc.nextLine().split(" ");
        for(int i=0;i<arr.length;i++)
            arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
        System.out.println(String.join(" ",arr));
    }
}
