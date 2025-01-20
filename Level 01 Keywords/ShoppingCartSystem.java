public class ShoppingCartSystem{
    public static void main(String[] agrs){

        // Creating Product objects
        Product product = new Product("Oreo Biscuit", 10.0, 5, "OREO105");



        //Checking the instance
        if(product instanceof Product)
        {  
            System.out.println("product is an instance of Product");

            System.out.println("Before updating Discount value");
            // Displaying Product details
            product.displayProductDetails();
            // Updating the Product Discount for all Products
            Product.updateDiscount(9.0);

            // Displaying Product details after updating the Product Discount
            System.out.println("\nAfter updating Discount\n");
            product.displayProductDetails();
        }else{
            System.out.println("product is not an instance of Product");
        }
    }
}