package M1TestPrac;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

// Duplicates
public class Q8 {
    public static void main(String[] args) {
        int[] arr = {11,11,11,13,13,20};
        Set<Integer> set = new LinkedHashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int[] res = new int[set.size()];
        int k=0;
        for(int i:set){
            res[k++] = i;
        }
        System.out.println(Arrays.toString(res));
    }
}
