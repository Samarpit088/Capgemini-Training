package IMP;
// Array Equilibrium
public class Q3{
    public static void main(String[] args) {
        int[] arr = {1,7,2,7,2,1};
        int totalSum = 0;
        for(int i:arr){
            totalSum+=i;
        }
        boolean flag = false;
        int indx=-1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum==totalSum-sum-arr[i]){
                indx = i;
                flag = true;
            }
            sum+=arr[i];
        }
        if(flag) System.out.println(indx);
        else System.out.println(indx);
    }
}
