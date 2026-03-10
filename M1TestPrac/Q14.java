package M1TestPrac;
// reverse number
public class Q14 {
    public static void main(String[] args) {
        int n = 230;
        System.out.println(reverse(n));
    }
    public static int reverse(int n){
        int rev = 0;
        while(n>0){
            rev = rev*10 + n%10;
            n=n/10;
        }
        return rev;
    }
}
