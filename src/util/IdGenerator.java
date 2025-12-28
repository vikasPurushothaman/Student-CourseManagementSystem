package util;

public class IdGenerator {

    private  static  int studentId = 1;
    private static  int courseId = 1;
    private static  int enrollmentId = 1;


    public static int nextStudentId() {
        return studentId++;
    }
    public static int nextCourseid() {
        return courseId++;
    }
    public static int nextEntrollmentId() {
        return enrollmentId++;
    }
}
