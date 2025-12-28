package service;

import entity.Student;
import exception.EntityNotFoundException;
import repository.StudentRepository;
import java.util.ArrayList;

public class StudentService {
    private StudentRepository repository = new StudentRepository();

    public  void addStudent(Student student ){
        repository.save(student);
    }
    public Student getStudentById(int id) {
        Student student = repository.findById(id);
        if (student == null) {
            throw new EntityNotFoundException("Student not found");
        }
        return student;

    }

    public void listAllTheStudents(){
        repository.findAll().forEach(
                e ->  System.out.println(e.getId() + "" + e.getDisplayName())
        );
    }

}
