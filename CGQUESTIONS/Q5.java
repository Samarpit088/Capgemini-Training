package CGQUESTIONS;

public class Q5 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,8,7};
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i:a){
            if(i>firstLargest){
                secondLargest = firstLargest;
                firstLargest = i;
            }else if(i>secondLargest && i!=firstLargest) secondLargest = i;
        }
        System.out.println("SecondLargest number:- " + secondLargest);
    }
}
