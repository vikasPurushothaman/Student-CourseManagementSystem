package entity;

import enums.EnrollmentStatus;

import java.time.LocalDate;

public class Enrollment {

    private int id;
    private int studentId;
    private int courseId;
    private LocalDate entrollmentDate;
    private EnrollmentStatus status;


    public  Enrollment(int id, int courseId, int studentId) {
        this.id = id;
        this.courseId = courseId;
        this.studentId = studentId;
    }
    public int getStudentId() {
        return  studentId;
    }
    public int getCourseId() {
        return  courseId;
    }
    public void setStatus(EnrollmentStatus status) {
        this.status = status;
    }










}
