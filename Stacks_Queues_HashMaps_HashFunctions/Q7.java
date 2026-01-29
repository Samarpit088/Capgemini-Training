package Stacks_Queues_HashMaps_HashFunctions;

import java.util.*;

// Check for a Pair with Given Sum in an Array
public class Q7 {
    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 6};
        int target = 10;
        System.out.println(hasPair(arr, target));
    }
    public static boolean hasPair(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }
}
