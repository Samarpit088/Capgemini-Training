package Sorting_Algorithms;

import java.util.*;

// Sort Exam Scores
public class Q5 {
    public static void main(String[] args) {
        int[] examScores = {72, 88, 64, 91, 79};
        selectionSort(examScores);
        System.out.println(Arrays.toString(examScores));
    }
    public static void selectionSort(int[] scores) {
        int n = scores.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }
}
