package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Instructor {

    @Id
    private String id;
    private String name;

    // Constructors, getters, setters, and toString methods...

    public Instructor() {
        // Default constructor
    }

    public Instructor(String name) {
        this.name = name;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString method for easier debugging and logging

    @Override
    public String toString() {
        return "Instructor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
