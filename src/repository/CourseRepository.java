package repository;

import entity.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository {
    private List<Course> courses = new ArrayList<>();

    public void save(Course course) {
        courses.add(course);
    }
    public List<Course> finaAll(){
        return courses;
    }

}
