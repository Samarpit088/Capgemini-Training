package Constructors.Level1;
// Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details and calculate total cost.
public class Q6 {
    public static void main(String[] args) {
        CarRental cr = new CarRental("Sam","Swift",20);
        cr.displayRental();
    }
}
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1000; // Example daily rate
    double totalCost;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Generic";
        this.rentalDays = 1;
        calculateTotalCost();
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateTotalCost();
    }

    public void calculateTotalCost() {
        totalCost = rentalDays * dailyRate;
    }

    public void displayRental() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + totalCost);
    }
}

