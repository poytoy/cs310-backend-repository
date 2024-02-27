package model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "comments") 
public class Comment {
	@Id
    private ObjectId id;
	 
   

	private String courseId;
    private String courseName;


    
    private LocalDateTime createdAt;

    private String comment; // Single comment

    // Constructors, getters, setters, and toString methods...

    public Comment() {
        // Default constructor
        this.createdAt = LocalDateTime.now();
    }

    public Comment(String code, String courseName,String comment) {
        this.courseId = code;
        this.courseName = courseName;
       

        this.comment = comment;
        this.createdAt = LocalDateTime.now();
    }

    // Getters and Setters...
    public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String code) {
        this.courseId = code;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // Method to return a user-friendly string representation of the comment

    // toString method for easier debugging and logging

    @Override
    public String toString() {
        return "Comment{" +
                "id='" + id + '\'' +
                ", courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", createdAt=" + createdAt +
                ", comment='" + comment + '\'' +
                '}';
    }
}
