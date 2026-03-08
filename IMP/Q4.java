package IMP;

import java.util.Arrays;

// Array Rotation
public class Q4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
