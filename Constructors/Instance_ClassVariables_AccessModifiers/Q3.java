package Constructors.Instance_ClassVariables_AccessModifiers;
// Vehicle Registration
public class Q3 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Sam","RWD");
        v.displayVehicleDetails();
        Vehicle.updateRegistrationFee(4000);
        v.displayVehicleDetails();
    }
}
class Vehicle {
    String ownerName;
    String vehicleType;

    static double registrationFee = 5000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName +
                ", Vehicle: " + vehicleType +
                ", Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}

