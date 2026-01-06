package Arrays.Level2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] per = new double[n];
        String[] grade = new String[n];
        String[] remarks = new String[n];

        double[] p = new double[n], c = new double[n], m = new double[n];

        // Input + Calculation
        for(int i = 0; i < n; i++){
            p[i] = sc.nextDouble();
            c[i] = sc.nextDouble();
            m[i] = sc.nextDouble();

            if(p[i] < 0 || c[i] < 0 || m[i] < 0){
                i--;
                continue;
            }

            per[i] = (p[i] + c[i] + m[i]) / 3;

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

        // Display Result
        System.out.println("\nPhysics\tChemistry\tMaths\tPercentage\tGrade\tRemarks");
        for(int i = 0; i < n; i++){
            System.out.println(p[i] + "\t" + c[i] + "\t\t" + m[i] + "\t" + per[i] + "\t\t" + grade[i] + "\t" + remarks[i]);
        }
    }
}
