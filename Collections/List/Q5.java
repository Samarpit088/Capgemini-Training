package Collections.List;
import java.util.*;
// Find the Nth Element from the End
public class Q5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int N = 2;
        int first = 0;
        int second = 0;
        for (int i = 0; i < N; i++) {
            first++;
        }
        while (first < list.size()) {
            first++;
            second++;
        }
        System.out.println(list.get(second));
    }
}
