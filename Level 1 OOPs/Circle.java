//Create a Book class the store the details of Book
public class Circle{

    //Define the attribute of the circle
    private double radius;
    private double area;
    private double circumference;

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