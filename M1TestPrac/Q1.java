package M1TestPrac;
// Repeat String
public class Q1 {
    public static void main(String[] args) {
        int n = 3;
        String s = "abc";
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=3;i++){
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
}
