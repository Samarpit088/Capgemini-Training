package IMP;
// absolute difference of less than o r equal to 'diff' with 'num'
public class Q9 {
    public static void main(String[] args) {
        int[] arr = {12,3,14,56,77,13};
        int num = 13;
        int diff = 2;
        System.out.println(findCount(arr,arr.length,num,diff));
    }
    public static int findCount(int[] arr,int n,int num,int diff){
        if(arr==null|| n==0) return -1;
        int count = 0;
        for(int i=0;i<n;i++){
            if(Math.abs(arr[i] - num)<=diff) count++;
        }
        return (count==0?-1:count);
    }
}
