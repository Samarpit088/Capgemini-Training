package OOPS_20_01_2026;

import java.util.*;

// Vehicle Rental System
public class Q3 {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR101", 2000, "CAR-INS-123"));
        vehicles.add(new Bike("BIKE202", 800));
        vehicles.add(new Truck("TRUCK303", 4000, "TRUCK-INS-789"));
        int days = 3;
        for (Vehicle vehicle : vehicles) {

            double rentalCost = vehicle.calculateRentalCost(days);
            double insurance = 0;

            if (vehicle instanceof Insurable) {
                insurance = ((Insurable) vehicle).calculateInsurance();
            }

            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost: " + rentalCost);
            System.out.println("Insurance Cost: " + insurance);
            System.out.println();
        }
    }
}
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}
class Bike extends Vehicle {

    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 200;
    }

    public double calculateInsurance() {
        return 1000;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}
