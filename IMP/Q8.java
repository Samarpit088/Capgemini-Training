package IMP;
// Rats and food
public class Q8 {
    public static void main(String[] args) {
        int r = 7;
        int unit = 2;
        int[] arr = {2,8,3,5,7,4,1,2};
        System.out.println(solve(r, unit, arr, arr.length));
    }
    public static int solve(int r,int unit,int[] arr,int n){
        if(arr==null || n==0) return -1;
        int totalFoodRequired = r*unit;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>=totalFoodRequired){
                return i+1;
            }
        }
        return 0;
    }
}
