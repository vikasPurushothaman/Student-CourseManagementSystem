package repository;

import entity.Enrollment;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentRepository {
        private List<Enrollment> enrollments = new ArrayList<>();

        public void save(Enrollment enrollment) {
            enrollments.add(enrollment);
        }

}
