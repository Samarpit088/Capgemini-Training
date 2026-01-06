package Arrays.Level2;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        // Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[][] marks = new double[n][3];

        double[] per = new double[n];
        String[] grade = new String[n];
        String[] remarks = new String[n];

        for(int i = 0; i < n; i++){
            marks[i][0] = sc.nextDouble();
            marks[i][1] = sc.nextDouble();
            marks[i][2] = sc.nextDouble();

            if(marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0){
                i--;
                continue;
            }

            per[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if(per[i] >= 80){
                grade[i] = "A";
                remarks[i] = "Level 4, above agency-normalized standards";
            }
            else if(per[i] >= 70){
                grade[i] = "B";
                remarks[i] = "Level 3, at agency-normalized standards";
            }
            else if(per[i] >= 60){
                grade[i] = "C";
                remarks[i] = "Level 2, below, but approaching agency-normalized standards";
            }
            else if(per[i] >= 50){
                grade[i] = "D";
                remarks[i] = "Level 1, well below agency-normalized standards";
            }
            else if(per[i] >= 40){
                grade[i] = "E";
                remarks[i] = "Level 1-, too below agency-normalized standards";
            }
            else{
                grade[i] = "R";
                remarks[i] = "Remedial standards";
            }
        }

        System.out.println("\nPhysics\tChemistry\tMaths\tPercentage\tGrade\tRemarks");
        for(int i = 0; i < n; i++){
            System.out.println(marks[i][0] + "\t" + marks[i][1] + "\t\t" + marks[i][2] + "\t" + per[i] + "\t\t" + grade[i] + "\t" + remarks[i]);
        }
    }
}
