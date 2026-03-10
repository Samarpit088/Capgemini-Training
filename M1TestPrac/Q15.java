package M1TestPrac;
//
public class Q15 {
    public static void main(String[] args) {
        String s = "localization";
        System.out.println(newString(s));
    }
    public static String newString(String s){
        if(s.length()>10){
            return " " + s.charAt(0) + s.substring(1,s.length()-1).length() + s.charAt(s.length()-1);
        }
        return s;
    }
}
