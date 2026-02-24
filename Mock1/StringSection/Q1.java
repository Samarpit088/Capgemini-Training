package Mock1.StringSection;
// Selective Reverse
public class Q1 {
    public static void main(String[] args) {
        String s = "I love Java programming very much";
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=words.length;i++){
            if(i%2==0){
                sb.append(new StringBuilder(words[i-1]).reverse().toString()).append(" ");
                continue;
            }
            sb.append(words[i-1]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
