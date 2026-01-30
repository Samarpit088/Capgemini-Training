package Searching.LinearSearch;
// Search for a Specific Word in a List of Sentences
public class Q2 {
    public static void main(String[] args) {
        String[] sentences = {"Java is a language", "data structures", "Linear search", "Data Structure and algorithms"};
        String word = "search";
        String result = findSentenceContainingWord(sentences, word);
        System.out.println(result);
    }
    public static String findSentenceContainingWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }
}
