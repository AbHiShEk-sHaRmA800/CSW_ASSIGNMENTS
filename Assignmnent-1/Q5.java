class College {
    private String collegeName;
    private String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }
}

class Student {
    private int studentId;
    private String studentName;
    private College college;

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College: " + college.getCollegeName() + " located at " + college.getCollegeLoc());
        System.out.println();
    }
}

public class Q5 {

    public static void main(String[] args) {
        College college1 = new College("ITER", "JAGAMARA");
        College college2 = new College("SUM", "KALINGA NAGAR");

        System.out.println("College Information:");
    }
}