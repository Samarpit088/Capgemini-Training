package Stacks_Queues_HashMaps_HashFunctions;

import java.util.*;

// Longest Consecutive Sequence
public class Q8 {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, true);
        }
        int maxLen = 0;
        for (int num : nums) {
            if (!map.containsKey(num - 1)) {
                int currNum = num;
                int currLen = 1;
                while (map.containsKey(currNum + 1)) {
                    currNum++;
                    currLen++;
                }
                maxLen = Math.max(maxLen, currLen);
            }
        }
        return maxLen;
    }
}

