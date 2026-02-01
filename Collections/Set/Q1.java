package Collections.Set;
import java.util.*;
// Check if Two Sets Are Equal
public class Q1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        System.out.println(set1.equals(set2));
    }
}
