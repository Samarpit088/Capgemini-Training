package M1TestPrac;

import java.util.ArrayList;

//
public class Q16 {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,-4,5,6};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:arr){
            if(i>0)list.add(i);
        }
        if(list.size()%2==0) System.out.println(list.get((list.size()/2)-1));
        else System.out.println(list.get(list.size()/2));
    }
}
