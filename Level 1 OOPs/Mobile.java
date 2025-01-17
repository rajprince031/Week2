
//Create a mobile class that conatin mobile details
public class Mobile{

    private String brand;
    private String model;
    private double price;

    //Create a constructor to assign the value of Mobile
    public Mobile(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    //Display the mobile details
    public void display(){
        System.out.println("\nMobile Details\n");
        System.out.println("Brand : "+this.brand);
        System.out.println("Model : "+this.model);
        System.out.println("Price : "+this.price);
        System.out.println();//Change the line
       
    }
}