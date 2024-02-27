package Service;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import model.Comment;
import model.Course;
import model.Instructor;
import model.User;
import repo.CommentRepository;
import repo.CourseRepository;
import repo.InstructorRepository;

import java.util.Arrays;

@Service
public class Data {

	private static CourseRepository courseRepository = null;
    private static InstructorRepository instructorRepository = null;
    private static CommentRepository commentRepository = null;  // Inject CommentRepository


    public Data(CourseRepository courseRepository, InstructorRepository instructorRepository, CommentRepository commentRepository) {
        Data.courseRepository = courseRepository;
        Data.instructorRepository = instructorRepository;
        Data.commentRepository = commentRepository;
    }
    @PostConstruct
    public static void initializeAllCoursesAndInstructors() {
        // Initialize sample instructors
        Instructor instructor1 = new Instructor("Kamer Kaya");
        Instructor instructor2 = new Instructor("Onur Varol");
        Instructor instructor3 = new Instructor("Gulsen Demiroz");
        Instructor instructor4 = new Instructor("Esra Erdem");
        Instructor instructor5 = new Instructor("Kemal Inan");
        Instructor instructor6 = new Instructor("Atil Ay");
        Instructor instructor7 = new Instructor("Husnu Yenigun");
        Instructor instructor8 = new Instructor("Yucel Saygin");
        Instructor instructor9 = new Instructor("Suha Mutluergil");
        Instructor instructor10 = new Instructor("Tolga Ovatman");
        Instructor instructor11 = new Instructor("Altug Tanaltay");
        Instructor instructor12 = new Instructor("Erchan Aptoula");
        Instructor instructor13 = new Instructor("Selim Balcisoy");
        Instructor instructor14 = new Instructor("Albert Levi");
        Instructor instructor15 = new Instructor("Erkay Savas");
        Instructor instructor16 = new Instructor("Feyzullah Cetin");
        Instructor instructor17 = new Instructor("Kursat Cagiltay");
        // Save instructors to the database
        try {
			instructorRepository.saveAll(Arrays.asList(
			        instructor1, instructor2, instructor3, instructor4, instructor5, instructor6, instructor7,
			        instructor8, instructor9, instructor10, instructor11, instructor12, instructor13, instructor14,
			        instructor15, instructor16, instructor17
			));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Initialize sample courses with schedule information
        Course course1 = new Course("CS 201", "Programming Fundamentals", instructor1, "Mon 2:00 PM - 4:00 PM");
        Course course2 = new Course("CS 204", "Advanced Programming", instructor2, "Wed 1:00 PM - 3:00 PM");
        Course course3 = new Course("CS 210", "Introduction to Data Science", instructor3, "Wed 12:40 PM - 2:40 PM");
        Course course4 = new Course("CS 300", "Data Structures", instructor4, "Tue 10:00 AM - 12:00 PM");
        Course course5 = new Course("CS 301", "Algorithms", instructor5, "Thu 3:00 PM - 5:00 PM");
        Course course6 = new Course("CS 302", "Formal Languages and Automata Theory", instructor6, "Mon 10:00 AM - 12:00 PM");
        Course course7 = new Course("CS 303", "Logic and Digital System Design", instructor7, "Tue 1:00 PM - 3:00 PM");
        Course course8 = new Course("CS 305", "Programming Languages", instructor8, "Wed 2:00 PM - 4:00 PM");
        Course course9 = new Course("CS 306", "Database Systems", instructor9, "Fri 10:00 AM - 12:00 PM");
        Course course10 = new Course("CS 307", "Operating Systems", instructor10, "Thu 1:00 PM - 3:00 PM");
        Course course11 = new Course("CS 308", "Software Engineering", instructor11, "Fri 2:00 PM - 4:00 PM");
        Course course12 = new Course("CS 310", "Mobile Application Development", instructor12, "Mon 1:00 PM - 3:00 PM");
        Course course13 = new Course("CS 395", "Internship Project", instructor1, "Flexible Schedule");
        Course course14 = new Course("CS 400", "Logic in Computer Science", instructor4, "Wed 3:00 PM - 5:00 PM");
        Course course15 = new Course("CS 403", "Distributed Systems", instructor10, "Tue 2:00 PM - 4:00 PM");
        Course course16 = new Course("CS 405", "Computer Graphics", instructor13, "Thu 10:00 AM - 12:00 PM");
        Course course17 = new Course("CS 408", "Computer Networks", instructor14, "Fri 1:00 PM - 3:00 PM");
        Course course18 = new Course("CS 411", "Cryptography", instructor15, "Mon 3:00 PM - 5:00 PM");
        Course course19 = new Course("CS 412", "Machine Learning", instructor2, "Thu 12:00 PM - 2:00 PM");
        Course course20 = new Course("CS 419", "Digital Image and Video Analysis", instructor12, "Tue 3:00 PM - 5:00 PM");
        Course course21 = new Course("CS 437", "Cybersecurity Practices and Applications", instructor16, "Wed 3:00 PM - 5:00 PM");
        Course course22 = new Course("CS 449", "Human Computer Interaction", instructor17, "Fri 3:00 PM - 5:00 PM");

        // Save courses to the database
        try {
			courseRepository.saveAll(Arrays.asList(
			        course1, course2, course3, course4, course5, course6, course7, course8, course9, course10,
			        course11, course12, course13, course14, course15, course16, course17, course18, course19,
			        course20, course21, course22
			));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // Initialize sample comments
        User user1 = new User("john doe", "JohnDoe@", "aasd");
        User user2 = new User("jane smith", "JaneSmith@","ads");

        Comment comment1 = new Comment("CS 201", "Programming Fundamentals", "Great course!");
        Comment comment2 = new Comment("CS 204", "Advanced Programming", "Enjoyed the challenges.");

        // Save comments to the database
        try {
            commentRepository.saveAll(Arrays.asList(
                    comment1, comment2 /* ... (add other comments) */
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

