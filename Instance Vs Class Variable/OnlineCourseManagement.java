public class OnlineCourseManagement {
    public static void main(String[] agrs){

        // Creating Course objects
        Course course1 = new Course("Java Programming", 6, 500);
        Course course2 = new Course("Web Development", 4, 400);
        Course course3 = new Course("Data Science", 8, 800);

        // Displaying course details
        System.out.println("Before updating Institute Name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();

        // Updating the institute name for all courses
        Course.updateInstituteName("ABC Academy");

        // Displaying course details after updating the institute name
        System.out.println("\nAfter updating Institute Name:");
        course1.displayCourseDetails();
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();
    }
}
