package CGQUESTIONS;

import java.util.HashSet;

public class Q15 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,5,5};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for(int i:arr){
            if(set.contains(i)){
                res.add(i);
                continue;
            }
            set.add(i);
        }
        System.out.println(res);
    }
}
