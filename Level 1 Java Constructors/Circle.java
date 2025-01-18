//Create a Book class the store the details of Book
public class Circle{

    //Define the attribute of the circle
    private double radius;
    private double area;
    private double circumference;

    //Getter and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    //Create a default Constructor
    public Circle(){
        System.out.println("Please enter the radius of the circle");
    }

    //Create a constructor to assign the value of the radius
    public Circle(double radius){
        this.radius = radius;
    }

    //Create a method to calculate Circumference
    public void computeCircumference(){
        this.circumference =  2 * Math.PI * radius;
    }

    //Create a method to calculate Area
    public void computeArea(){
        this.area =  Math.PI * radius * radius;
    }

    //Create a method to display the area
    public void displayArea(){
        System.out.println("The Area of circle: "+this.area + " meter square");
    }

    //Create a method to display the Circumference
    public void displayCircumference(){
        System.out.println("The circumference of circle: "+this.circumference +" meter");
    }
}