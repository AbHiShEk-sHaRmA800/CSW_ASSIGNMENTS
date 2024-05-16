package question9;

import java.util.*;

interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);

    void dropStudent(Student student, Course course);

    void displayEnrollmentDetails();
}

class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

class Enrollment implements EnrollmentSystem {
    private List<Student> enrolledStudents;
    private List<Course> enrolledCourses;

    public Enrollment() {
        this.enrolledStudents = new ArrayList<>();
        this.enrolledCourses = new ArrayList<>();
    }

    @Override
    public void enrollStudent(Student student, Course course) {
        enrolledStudents.add(student);
        enrolledCourses.add(course);
        System.out.println(student.getName() + " enrolled in " + course.getCourseName());
    }

    @Override
    public void dropStudent(Student student, Course course) {
        int index = enrolledStudents.indexOf(student);
        if (index != -1 && enrolledCourses.get(index).equals(course)) {
            enrolledStudents.remove(index);
            enrolledCourses.remove(index);
            System.out.println(student.getName() + " dropped from " + course.getCourseName());
        } else {
            System.out.println("Student is not enrolled in this course.");
        }
    }

    @Override
    public void displayEnrollmentDetails() {
        System.out.println("Enrollment Details:");
        for (int i = 0; i < enrolledStudents.size(); i++) {
            System.out.println(enrolledStudents.get(i).getName() + " - " +
                    enrolledCourses.get(i).getCourseName());
        }
    }
}

public class Q9 {

    public static void main(String[] args) {
        Student student1 = new Student("S001", "Aditya");
        Student student2 = new Student("S002", "Debi");

        Course course1 = new Course("C001", "Java Programming");
        Course course2 = new Course("C002", "Data Structures");

        Enrollment enrollment = new Enrollment();

        enrollment.enrollStudent(student1, course1);
        enrollment.enrollStudent(student2, course2);

        enrollment.displayEnrollmentDetails();

        enrollment.dropStudent(student1, course1);

        enrollment.displayEnrollmentDetails();

    }

}
