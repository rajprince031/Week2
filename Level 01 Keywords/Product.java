public class Product {
    // Instance Variables
    private String productName;
    private double price;
    private int quantity;
    final String PRODUCT_ID;

    // Class Variable (shared among all products)
    private static double discount = 8.0;

    //Create a method to update the Product name
    public static void updateDiscount(double discount){
        Product.discount = discount;
    }

    // Constructor to initialize Product details
    Product(String productName, double price, int quantity, String PRODUCT_ID){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.PRODUCT_ID = PRODUCT_ID;
    }

    // Instance method to display Product details
    public void displayProductDetails(){
        System.out.println("\nProduct Details\n");
        System.out.println("Product Name : "+this.productName);
        System.out.println("Price : Rs "+this.price);
        System.out.println("Discount : "+Product.discount);
        System.out.println("Quantity : "+this.quantity);

    }

}
