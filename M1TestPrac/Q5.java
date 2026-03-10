package M1TestPrac;
// Anagram
public class Q5 {
    public static void main(String[] args) {
        String s1 = "build";
        String s2 = "dubol";
        if(isAnagram(s1,s2)) System.out.println("Yes");
        else System.out.println("No");
    }
    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        int[] arr = new int[256];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)]++;
            arr[s2.charAt(i)]--;
        }
        for(int i=0;i<s1.length();i++){
            if(arr[s1.charAt(i)]!=0) return false;
        }
        return true;
    }
}
