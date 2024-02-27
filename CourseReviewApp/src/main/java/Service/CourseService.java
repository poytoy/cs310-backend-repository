package Service;

import org.springframework.stereotype.Service;
import model.Course;
import repo.CommentRepository;
import repo.CourseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository courseRepository;
    private final CommentRepository commentRepository;

    public CourseService(CourseRepository courseRepository, CommentRepository commentRepository) {
        this.courseRepository = courseRepository;
        this.commentRepository = commentRepository;
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course addCommentToCourse(String courseId, model.Comment comment) {
        Course course = courseRepository.findById(courseId).orElse(null);
        if (course != null) {
            commentRepository.save(comment);
            course.getComments().add(comment);
            return courseRepository.save(course);
        } else {
            return null;
        }
    }

    public List<model.Comment> getCommentsForCourse(String courseId) {
        Course course = courseRepository.findById(courseId).orElse(null);
        return course != null ? course.getComments() : null;
    }

    public Optional<Course> getCourseById(String courseId) {
        return courseRepository.findById(courseId);
    }

    // Add other methods for CRUD operations as needed

    public void saveCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String courseId) {
        courseRepository.deleteById(courseId);
    }
}
