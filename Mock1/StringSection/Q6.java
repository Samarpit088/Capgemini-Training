package Mock1.StringSection;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

// Longest Unique Substring(String)
public class Q6 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int max = Integer.MIN_VALUE;
        Queue<Character> q = new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(q.contains(s.charAt(i))){
                max = Math.max(max,q.size());
                while(!q.isEmpty()&&q.contains(s.charAt(i))){
                    q.poll();
                }
            }
            q.offer(s.charAt(i));
        }
        System.out.println(max);
    }

}
