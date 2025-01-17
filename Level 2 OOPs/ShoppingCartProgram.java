class CartItem {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate total cost for this item
    public double getTotalCost() {
        return price * quantity;
    }
}

class ShoppingCart {
    private CartItem[] cartItems;
    private int itemCount;  // To keep track of how many items are currently in the cart

    // Constructor to initialize cart with a fixed size
    public ShoppingCart(int maxItems) {
        cartItems = new CartItem[maxItems];  // Array of CartItem objects
        itemCount = 0;  // Initially no items in the cart
    }

    // Add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        if (itemCount < cartItems.length) {
            cartItems[itemCount] = new CartItem(itemName, price, quantity);
            System.out.println("Added " + quantity + " of " + itemName + " to the cart.");
            itemCount++;  // Increment the item count
        } else {
            System.out.println("Cart is full! Cannot add more items.");
        }
    }

    // Remove an item from the cart
    public void removeItem(String itemName) {
        boolean itemRemoved = false;
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].getItemName().equalsIgnoreCase(itemName)) {
                // Shift the elements after the removed item to the left
                for (int j = i; j < itemCount - 1; j++) {
                    cartItems[j] = cartItems[j + 1];
                }
                cartItems[itemCount - 1] = null;  // Set the last element to null
                itemCount--;  // Decrease the item count
                System.out.println("Removed " + itemName + " from the cart.");
                itemRemoved = true;
                break;
            }
        }
        if (!itemRemoved) {
            System.out.println(itemName + " is not in the cart.");
        }
    }

    // Display total cost of all items in the cart
    public void displayTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += cartItems[i].getTotalCost();
        }
        System.out.println("Total cost of items in the cart: Rs " + totalCost);
    }

    // Display all items in the cart
    public void displayCartItems() {
        if (itemCount == 0) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (int i = 0; i < itemCount; i++) {
                System.out.println(cartItems[i].getQuantity() + " x " + cartItems[i].getItemName() + " @ Rs " + cartItems[i].getPrice() + " each");
            }
        }
    }
}

public class ShoppingCartProgram {
    public static void main(String[] args) {
        // Create a shopping cart with a max size of 5 items
        ShoppingCart cart = new ShoppingCart(5);

        // Adding items to the cart
        cart.addItem("Apple", 1.99, 3);  // 3 Apples
        cart.addItem("Bread", 2.50, 2);   // 2 Breads
        cart.addItem("Milk", 3.75, 1);    // 1 Milk

        // Displaying the cart items
        cart.displayCartItems();

        // Displaying total cost
        cart.displayTotalCost();

        // Removing an item
        cart.removeItem("Bread");

        // Displaying updated cart and total cost
        cart.displayCartItems();
        cart.displayTotalCost();
    }
}
