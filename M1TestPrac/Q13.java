package M1TestPrac;
// to upper or to lower
public class Q13 {
    public static void main(String[] args) {
        String s = "abcdABCDe";
        int upper = 0;
        int lower = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))) upper++;
            else lower++;
        }
        if(upper>lower) System.out.println(s.toLowerCase());
        else System.out.println(s.toLowerCase());
    }
}
