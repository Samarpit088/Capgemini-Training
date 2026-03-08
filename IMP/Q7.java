package IMP;
// Digit Sum Difference
public class Q7 {
    public static void main(String[] args) {
        int m = 50,n = 120;
        int sum4 = 0;
        int sum7 = 0;
        for(int i=m;i<=n;i++){
            if(i%4==0) sum4+=digitSum(i);
            if(i%7==0) sum7+=digitSum(i);
        }
        System.out.println(Math.abs(sum7-sum4));
    }
    public static int digitSum(int n){
        int temp =0;
        while(n>0){
            temp +=n%10;
            n=n/10;
        }
        return temp;
    }
}
