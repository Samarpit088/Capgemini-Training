package Mock1.ArraySection;
// Max Difference with Constraints
public class Q4 {
    public static void main(String[] args) {
        int[] arr = {2,7,3,1,9};
        int n = arr.length;
        int maxDiff = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int diff = arr[j]-arr[i];
                if(diff>maxDiff){
                    maxDiff = diff;
                }
            }
        }
        System.out.println(maxDiff);
    }
}
