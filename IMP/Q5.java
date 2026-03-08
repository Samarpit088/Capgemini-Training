package IMP;
// Substring Search
public class Q5 {
    public static void main(String[] args) {
        String s1 = "Hello, World!";
        String s2 = "World";
        System.out.println(firstIndex(s1,s2));
    }
    public static int firstIndex(String s1,String s2){
        if(s1==null || s2==null || s1.isEmpty() || s2.isEmpty()) return -1;
        int n = s1.length();
        int m = s2.length();
        int i=0,j=0;
        while(i<n){
            if(s2.charAt(j)==s1.charAt(i)){
                int index = i;
                while(j<m && i<n && s2.charAt(j) == s1.charAt(i)){
                    j++;
                    i++;
                }
                if(j==m){
                    return index;
                }
                j=0;
                continue;
            }
            i++;
        }
        return -1;
    }
}
