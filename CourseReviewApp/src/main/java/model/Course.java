package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Course {

    @Id
    private String id;
    private String courseName;

    @DBRef
    private Instructor instructor;
    
    private String schedule; // Change the type to String or another appropriate type

    @DBRef
    private List<Comment> comments;

    // Constructors, getters, setters, and toString methods...

    public Course(String string, String string2, Instructor instructor, String string3) {
        // Default constructor
    }

    public Course(String courseName, Instructor instructor, String schedule, List<Comment> comments) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.schedule = schedule;
        this.comments = comments;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    // toString method for easier debugging and logging

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", schedule='" + schedule + '\'' +
                ", comments=" + comments +
                '}';
    }
}
