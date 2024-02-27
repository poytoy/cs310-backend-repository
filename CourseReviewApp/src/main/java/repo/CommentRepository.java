package repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import model.Comment;
@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {

    // Find all comments for a specific course
    List<Comment> findByCourseId(String courseId);

    // Find all comments by a specific user
    //List<Comment> findByUserId(String userId);

    // Find all comments that contain a specific keyword in the text
    //List<Comment> findByTextContainingIgnoreCase(String keyword);

    // Find the latest N comments, ordered by creation timestamp
    //List<Comment> findTopNByOrderByCreatedAtDesc(int n);

    // Delete all comments for a specific course
    //void deleteByCourseId(String courseId);

    // Delete all comments by a specific user
    //void deleteByUserId(String userId);

}
