package Sorting_Algorithms;

import java.util.*;
// Sort Student Marks
public class Q1 {
    public static void main(String[] args) {
        int[] studentMarks = {78, 45, 89, 62, 55, 91};
        bubbleSort(studentMarks);
        System.out.println(Arrays.toString(studentMarks));
    }
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}

