package M1TestPrac;
// Palindrome count
public class Q6 {
    public static void main(String[] args) {
        String s = "this is level 71";
        String[] words = s.split(" ");
        int c = 0;
        for(String word:words){
            if(word.contentEquals(new StringBuilder(word).reverse())) c++;
        }
        System.out.println(c);
    }
}
