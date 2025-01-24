
class Order{
    
    //instance variable
    private String orderId;
    private String orderDate;

    
    //Constructor to initialize Class details
    Order(String orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    
    //Instance method to display the  details of Device
    public void getOrderStatus(){
        System.out.println("Order Details");
        System.out.println("Order Id : "+this.orderId);
        System.out.println("Order Date : "+this.orderDate);
    }   
}

class ShippedOrder extends Order{
    //instance variable
    private String trackingNumber;

    //Constructor to initialize Class details
    ShippedOrder(String orderId, String orderDate, String trackingNumber){
        // Calling the parent class constructor
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Order is Shipped");
        System.out.println("Tracking Number : "+this.trackingNumber);
    }   
}

class DeliverOrder extends ShippedOrder{
    //instance variable
    private String deliveryDate;

    //Constructor to initialize Class details
    DeliverOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate){
        // Calling the parent class constructor
        super(orderId, orderDate,trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Order is ready to deliver");
        System.out.println("Delivery Date : "+this.deliveryDate);
    }
}

class OnlineRetailOrderManagement{
    public static void main(String[] agrs){
        //Creating object of Thermostat class
       Order order = new Order("123FGHH","22-01-2025");
       order.getOrderStatus();

       //Creating object of ShippedOrder class
       ShippedOrder shippedOrder = new ShippedOrder("123FGHH","12-02-2025","87236487");
       shippedOrder.getOrderStatus();

       //Creating object of DeliverOrder class
       DeliverOrder deliverOrder = new DeliverOrder("123FGHH","12-02-2025","87236487","01-02-2025");
       deliverOrder.getOrderStatus();
    }
}