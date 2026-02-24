package Mock1.ArraySection;

import java.util.Arrays;

// Odd Index Stability
public class Q2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int n = arr.length-1;
        if(n%2!=0) n = n-1;
        for(int i=n;i>=2;i-=2){
            int temp = arr[i];
            arr[i] = arr[i-2];
            arr[i-2] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
