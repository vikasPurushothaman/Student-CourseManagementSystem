package repository;

import entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private List<Student> students = new ArrayList<>();

    public void save(Student student) {
        students.add(student);
    }
    public  Student findById(int id) {
        return students.stream()
                .filter(
                        s -> s.getId() == id
                ).findFirst()
                .orElse(null);
    }

    public List<Student> findAll() {
        return students;
    }


}
