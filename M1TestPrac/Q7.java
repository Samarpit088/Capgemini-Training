package M1TestPrac;

import java.util.HashSet;
import java.util.LinkedHashSet;

// Remove duplicates
public class Q7 {
    public static void main(String[] args) {
        String s = "CsharpstarZ";
        HashSet<Character> set = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(Character ch:set){
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
