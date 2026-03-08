package IMP;
// Parking Lot
public class Q1 {
    public static void main(String[] args) {
        char[] arr = {'x','x','x','s','x','x','s','x','x','s','s','s','x','x','s','x','x'};
        int i=0;
        int max =Integer.MIN_VALUE;
        while(i<arr.length){
            if(arr[i]=='s'){
                int count = 0;
                while(arr[i]=='s'&&i<arr.length){
                    i++;
                    count++;
                }
                max = Math.max(max,count);
            }
            i++;
        }
        if(max%2!=0) max--;
        System.out.println(max/2);
    }
}
