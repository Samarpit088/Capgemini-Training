package Mock1.ArraySection;
// Rotation Palindrome
public class Q6 {
    public static void main(String[] args) {
        String s1 = "aacbc";
        String s = s1+s1;
        int n = s1.length()+1;
        int n1 = s.length();
        int i=1;
        boolean flag = false;
        while(n<n1){
            if(s.substring(i,n).equals(new StringBuilder(s.substring(i++,n++)).reverse().toString())){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
