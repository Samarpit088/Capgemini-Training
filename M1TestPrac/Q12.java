package M1TestPrac;
// Find missing number
public class Q12 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,3,7,8};
        int totalSum = 0;
        for(int i=1;i<=arr.length+1;i++){
            totalSum+=i;
        }
        int currentSum = 0;
        for(int i:arr){
            currentSum+=i;
        }
        System.out.println(totalSum-currentSum);

    }
}
