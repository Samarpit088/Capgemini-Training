package Mock1.ArraySection;
// Balanced Split Check
public class Q3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10};
        int n = arr.length;
        int sum1 = 0;
        boolean flag = false;
        for(int i=0;i<n-1;i++){
            sum1+=arr[i];
            int sum2 = 0;
            for(int j=i+1;j<n;j++){
                sum2+=arr[j];
            }
            if(sum1==sum2){
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
