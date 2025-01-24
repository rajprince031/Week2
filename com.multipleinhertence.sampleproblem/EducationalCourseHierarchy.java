class Course{
    //instance variable
    private String courseName;
    private int duration;

    //Constructor to initialize Class details
    Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }

    //Instance method to display the  details of Course
    public void getCourseDetails(){
        System.out.println("Course Details");
        System.out.println("Course Name : "+this.courseName);
        System.out.println("Course Duration : "+this.duration);
    }
 
}
class OnlineCourse extends Course{
     //instance variable
     private String platform;
     private boolean isRecorded;
    
     
     //Constructor to initialize Class details
     OnlineCourse(String courseName, int duration, String platform, boolean isRecorded){
        // Calling the parent class constructor
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void getCourseDetails(){
        super.getCourseDetails();
        System.out.println("Platform : "+this.platform);
        System.out.println("Is Recorded : "+this.isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse{
     //instance variable
     private int fee;
     private int discount;
 
      //Constructor to initialize Class details
      PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, int fee, int discount){
        // Calling the parent class constructor
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void getCourseDetails(){
        super.getCourseDetails();
        System.out.println("Fee : Rs "+this.fee);
        System.out.println("Discount : "+this.discount+" %");
    }
}

public class  EducationalCourseHierarchy {
    public static void main(String[] agrs){
        //Creating object of Course class
        Course course = new Course("MACHINE LEARNING",4);
        course.getCourseDetails();

        //Creating object of OnlineCourse class
        OnlineCourse course2 = new OnlineCourse("DSA",8,"youtube",true);
        course2.getCourseDetails();

        //Creating object of PaidOnlineCourse class
        OnlineCourse course3 = new PaidOnlineCourse("OOPS",1,"udmey",false,12000,10);
        course3.getCourseDetails();
    }
}
