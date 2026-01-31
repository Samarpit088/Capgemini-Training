package Sorting_Algorithms;

import java.util.*;

// Sort an Array of Book Prices
public class Q3 {
    public static void main(String[] args) {
        int[] bookPrices = {499, 299, 899, 199, 649};
        mergeSort(bookPrices);
        System.out.println(Arrays.toString(bookPrices));
    }
    public static void mergeSort(int[] prices) {
        int n = prices.length;
        if(n<2) return;
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        for(int i=0;i<mid;i++){
            left[i] = prices[i];
        }
        for(int i=mid;i<n;i++){
            right[i-mid] = prices[i];
        }
        mergeSort(left);
        mergeSort(right);
        combine(left,right,prices);
    }
    public static void combine(int[] left,int[] right,int[] prices){
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                prices[k] = left[i];
                i++;
                k++;
            }
            else{
                prices[k] = right[j];
                j++;
                k++;
            }
        }
        while(i<left.length){
            prices[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            prices[k] = right[j];
            j++;
            k++;
        }
    }
}


