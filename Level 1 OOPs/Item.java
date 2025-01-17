
//Create Item class to store the details of item
public class Item{

    //Create item attribute
    private String code;
    private String name;
    private double price;
    private int quantity;
    private double total_price;

    
    //Create a constructor to assign the value of Item
    public Item(String code, String name, double price, int quantity){
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.total_price = price * quantity;
    }

    //Display the item details
    public void display(){
        System.out.println("\nItem Details\n");
        System.out.println("Code : "+this.code);
        System.out.println("Name : "+this.name);
        System.out.println("Price : "+this.price);
        System.out.println("Quantity : "+this.quantity);
        System.out.println("Total Price : "+this.total_price);
    }
}