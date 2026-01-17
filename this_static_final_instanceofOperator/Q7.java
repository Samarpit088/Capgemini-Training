package this_static_final_instanceofOperator;
// Hospital Management System
public class Q7 {
    public static void main(String[] args) {
        Patient p = new Patient("Sam", 21, "Fever", 501);
        p.display(p);
        Patient.getTotalPatients();
    }
}
class Patient {
    static String hospitalName = "AIIMS";
    static int totalPatients = 0;
    String name;
    int age;
    String ailment;
    final int patientID;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void display(Object obj) {
        if (obj instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        }
    }
}