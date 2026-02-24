package Mock1.StringSection;
// Interleaved Merge
public class Q3 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "XYZ";
        int n = (Math.min(s1.length(), s2.length()));
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(s1.charAt(i)).append(s2.charAt(i));
        }
        for(int i=n;i<s1.length();i++){
            sb.append(s1.charAt(i));
        }
        for(int i=n;i<s2.length();i++){
            sb.append(s2.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
