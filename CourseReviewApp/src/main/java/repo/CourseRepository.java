package repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import model.Course;

import java.util.List;
@Repository
public interface CourseRepository extends MongoRepository<Course, String> {

    List<Course> findByCourseName(String courseName);
    List<Course> findByInstructorName(String instructorName);
}
