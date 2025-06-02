
import java.util.*;

class StudentRegistrationManager {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<Registration> registrations = new ArrayList<>();
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    public Registration registerStudentToCourse(Student student, Course course) {
        Registration registration = new Registration(student, course);
        registrations.add(registration);
        return registration;
    }
}

class Student {
    private int studentId;
    private String name;
    
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
}

class Course {
    private int courseId;
    private String courseName;
    
    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
}

class Registration {
    private Student student;
    private Course course;
    
    public Registration(Student student, Course course) {
        this.student = student;
        this.course = course;
    }
}
