package repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import model.Instructor;

import java.util.List;

public interface InstructorRepository extends MongoRepository<Instructor, String> {

    List<Instructor> findByName(String name);

}
