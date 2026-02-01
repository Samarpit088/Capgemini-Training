package Collections.List;
// Remove Duplicates While Preserving Order
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        Set<Integer> set = new LinkedHashSet<>(list);
        List<Integer> result = new ArrayList<>(set);
        System.out.println(result);
    }
}
