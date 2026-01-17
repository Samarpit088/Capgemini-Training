package this_static_final_instanceofOperator;
// Vehicle Registration System
public class Q6 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Sam", "Car", "HP35A5100");
        v.display(v);
    }
}
class Vehicle {
    static double registrationFee = 2000;
    String ownerName;
    String vehicleType;
    final String registrationNumber;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void display(Object obj) {
        if (obj instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Type: " + vehicleType);
            System.out.println("Reg No: " + registrationNumber);
            System.out.println("Fee: " + registrationFee);
        }
    }
}