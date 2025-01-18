public class DisplayTotalProduct {
    public static void main(String[] args) {
        // Creating Product objects
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 699.99);
        Product product3 = new Product("Tablet", 499.99);

        // Displaying individual product details
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

        // Displaying total number of products created
        Product.displayTotalProducts();
    }
}
