package Mock1.StringSection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Q4 {
    public static void main(String[] args) {
        String s = "aaabbcddd";
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),0);
            }
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        for(Map.Entry<Character,Integer> m: map.entrySet()){
            System.out.print(m.getKey());
            System.out.print(m.getValue());
        }
    }
}
