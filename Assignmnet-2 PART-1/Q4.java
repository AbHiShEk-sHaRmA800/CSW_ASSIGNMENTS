import java.util.*;
class Student implements Comparable<Student> {
String name;
Object rn;
int totalMark;
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
if (this.totalMark < other.totalMark) {
return 1;
} else if (this.totalMark > other.totalMark) {
return -1;
} else {
return 0;
}
}
public String toString() {
return "Student{" +"name='" + name + '\'' +", rn=" + rn +", totalMark=" + totalMark +'}';
}
public static int compare(Student student1, Student student2) {
if (student1.totalMark < student2.totalMark) {
return 1;
} else if (student1.totalMark > student2.totalMark) {
return -1;
} else {
return 0;
}
}
}
public class Q4 {
public static void main(String[] args) {
Student[] students = new Student[5];
students[0] = new Student("Student1", 1, 90);
students[1] = new Student("Student2", 2, 80);
students[2] = new Student("Student3", 3, 85);
students[3] = new Student("Student4", 4, 95);
students[4] = new Student("Student5", 5, 70);
Arrays.sort(students);
System.out.println("Students sorted by total mark:");
for (Student student : students) {
System.out.println(student);
}
Student searchKey = new Student("Student3", 3, 85);
int searchIndex = linearSearch(students, searchKey);
if (searchIndex != -1) {
System.out.println("\nStudent found at position " + (searchIndex + 1));
} else {
System.out.println("\nStudent not found");
}
}
public static int linearSearch(Student[] arr, Student key) {
for (int i = 0; i < arr.length; i++) {
if (arr[i].compareTo(key) == 0) {
return i;
}
}
return -1;
}
}