package Collections.Queue;
import java.util.*;
// Generate Binary Numbers Using a Queue
public class Q2 {
    public static void main(String[] args) {
        int N = 5;
        List<String> result = generateBinary(N);
        System.out.println(result);
    }
    static List<String> generateBinary(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        for (int i = 0; i < N; i++) {
            String current = queue.remove();
            result.add(current);

            queue.add(current + "0");
            queue.add(current + "1");
        }
        return result;
    }
}
