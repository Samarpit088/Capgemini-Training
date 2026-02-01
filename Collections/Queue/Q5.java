package Collections.Queue;
import java.util.*;
// Circular Buffer Simulation
public class Q5 {
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);
        cb.display();
    }
}
class CircularBuffer {
    private int[] buffer;
    private int size;
    private int front;
    private int rear;
    private int count;
    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
        front = 0;
        rear = 0;
        count = 0;
    }
    void insert(int value) {
        buffer[rear] = value;
        rear = (rear + 1) % size;
        if (count == size) {
            front = (front + 1) % size;
        } else {
            count++;
        }
    }
    void display() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(buffer[(front + i) % size]);
        }
        System.out.println(result);
    }
}

