package Collections.Maps;
import java.util.*;
// Word Frequency Counter
public class Q1 {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        text = text.toLowerCase();
        text = text.replaceAll("[^a-z0-9 ]", "");
        String[] words = text.split("\\s+");
        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }
        System.out.println(freqMap);
    }
}
