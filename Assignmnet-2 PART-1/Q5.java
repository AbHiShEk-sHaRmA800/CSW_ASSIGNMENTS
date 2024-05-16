import java.util.*;
class Student implements Comparable<Student> {
private String name;
private Object rn;
private int totalMark;
public Student(String name, Object rn, int totalMark) {
this.name = name;
this.rn = rn;
this.totalMark = totalMark;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public Object getRn() {
return rn;
}
public void setRn(Object rn) {
this.rn = rn;
}
public int getTotalMark() {
return totalMark;
}
public void setTotalMark(int totalMark) {
this.totalMark = totalMark;
}
public int compareTo(Student other) {
if (this.rn instanceof String && other.rn instanceof String) {
return ((String) this.rn).compareTo((String) other.rn);
} else if (this.rn instanceof Integer && other.rn instanceof Integer) {
return ((Integer) this.rn).compareTo((Integer) other.rn);
} else {
throw new IllegalArgumentException("rn must be either a string or an integer");
}
}
public String toString() {
return this.getName() + " (" + this.getRn() + ") - Total Mark: " + this.getTotalMark();
}
}
public class Q5 {
public static void main(String[] args) {
Student[] students = new Student[5];
students[0] = new Student("Student1", 1, 90);
students[1] = new Student("Student2", 2, 80);
students[2] = new Student("Student3", 3, 85);
students[3] = new Student("Student4", 4, 95);
students[4] = new Student("Student5", 5, 70);
for (int i = 0; i < students.length - 1; i++) {
for (int j = 0; j < students.length - 1 - i; j++) {
if (students[j].compareTo(students[j + 1]) > 0) {
Student temp = students[j];
students[j] = students[j + 1];
students[j + 1] = temp;
}
}
}
System.out.println("Students sorted by rn:");
for (Student student : students) {
System.out.println(student);
}
}
}