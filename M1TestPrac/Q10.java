package M1TestPrac;

import java.util.Arrays;

// Push zeroes to end
public class Q10 {
    public static void main(String[] args) {
        int[] arr = {5,0,7,6};
        int[] ar = new int[arr.length];
        int k = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) ar[k++] = arr[i];
        }
        System.out.println(Arrays.toString(ar));
    }
}
