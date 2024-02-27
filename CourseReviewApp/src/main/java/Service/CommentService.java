package Service;

import org.springframework.stereotype.Service;

import java.util.List;

import model.Comment;
import repo.CommentRepository;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    // Find all comments for a specific course
    public List<Comment> getCommentsByCourseId(String courseId) {
        return commentRepository.findByCourseId(courseId);
    }

    // Find all comments by a specific user (uncomment if needed)
    /*
    public List<Comment> getCommentsByUserId(String userId) {
        return commentRepository.findByUserId(userId);
    }
    */

    // Find all comments that contain a specific keyword in the text (uncomment if needed)
    /*
    public List<Comment> getCommentsByKeyword(String keyword) {
        return commentRepository.findByTextContainingIgnoreCase(keyword);
    }
    */

    // Find the latest N comments, ordered by creation timestamp (uncomment if needed)
    /*
    public List<Comment> getLatestComments(int n) {
        return commentRepository.findTopNByOrderByCreatedAtDesc(n);
    }
    */

    // Delete all comments for a specific course (uncomment if needed)
    /*
    public void deleteCommentsByCourseId(String courseId) {
        commentRepository.deleteByCourseId(courseId);
    }
    */

    // Delete all comments by a specific user (uncomment if needed)
    /*
    public void deleteCommentsByUserId(String userId) {
        commentRepository.deleteByUserId(userId);
    }
    */
}
