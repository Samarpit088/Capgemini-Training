package Methods.Level3;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        // Create a program to find the shortest, tallest, and mean height of players present in a football team.
        Random r = new Random();
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++)
            heights[i] = 150 + r.nextInt(101); // 150–250

        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Mean Height = " + mean(heights));
        System.out.println("Shortest = " + shortest(heights));
        System.out.println("Tallest = " + tallest(heights));
    }
    static int sum(int[] h) {
        int s = 0;
        for (int x : h) s += x;
        return s;
    }

    static double mean(int[] h) {
        return sum(h) / (double) h.length;
    }

    static int shortest(int[] h) {
        int min = Integer.MAX_VALUE;
        for (int x : h) if (x < min) min = x;
        return min;
    }

    static int tallest(int[] h) {
        int max = Integer.MIN_VALUE;
        for (int x : h) if (x > max) max = x;
        return max;
    }
}
