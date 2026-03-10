package M1TestPrac;

import java.util.HashMap;

// Max Occurring Character
public class Q4 {
    public static void main(String[] args) {
        String s = "abccdd";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int max = Integer.MIN_VALUE;
        char ans = ' ';
        for(Character key:map.keySet()){
            if(map.get(key)>max){
                max = map.get(key);
                ans = key;
            }
        }
        int c =0;
        for(Character key:map.keySet()){
            if(map.get(key)==max){
                c++;
            }
        }
        if(c>1) System.out.println(0);
        else System.out.println(ans);
    }
}
