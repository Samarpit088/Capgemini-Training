package Mock1.StringSection;
// Remove Mirror Characters
public class Q2 {
    public static void main(String[] args) {
        String s = "xyyx";
        if(isMirror(s)){
            s = s.substring(0,s.length()/2);
        }
        System.out.println(s);
    }
    public static boolean isMirror(String s){
        if(s.length()%2!=0) return false;
        if(s.equals(new StringBuilder(s).reverse().toString())) return true;
        return false;
    }
}
