package Searching.StringBuilder_StringBuffer;

import java.util.*;

// Remove Duplicates from a String Using StringBuilder
public class Q2 {
    public static void main(String[] args) {
        String input = "Samarpit";

        String result = removeDuplicates(input);
        System.out.println(result);
    }
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!seen.contains(ch)) {
                sb.append(ch);
                seen.add(ch);
            }
        }

        return sb.toString();
    }

}
