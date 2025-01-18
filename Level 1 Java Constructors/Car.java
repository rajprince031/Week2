//Create a Car class the store the details of Car
public class Car {
    // Define the attribute of the
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double price;
    private double totalPrice;


    //Getter and setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    // Create a parameterized constructor to assign the details of Car
    public Car(String customerName, String carModel, int rentalDays, double price) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.price = price;
        this.totalPrice = price * rentalDays;
    }

    // Display the mobile details
    public void display() {
        System.out.println("\nCar Rental Details\n");
        System.out.println("Customer Name : " + this.customerName);
        System.out.println("Car Model : " + this.carModel);
        System.out.println("Rental Days : " + this.rentalDays);
        System.out.println("Total Rent : " + this.totalPrice);
    }
}
