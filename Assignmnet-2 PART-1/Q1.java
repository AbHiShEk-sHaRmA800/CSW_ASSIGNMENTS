import java.util.Scanner;
class Student {
private String name;
private Object rollNumber; private int age;
public Student(String name, Object rollNumber, int age) {
this.name = name;
this.rollNumber = rollNumber;
this.age = age;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public Object getRollNumber() {
return rollNumber;
}
public void setRollNumber(Object rollNumber) {
if (rollNumber instanceof Integer || rollNumber instanceof String) {
this.rollNumber = rollNumber;
} else {
throw new IllegalArgumentException("Roll number must be an integer or a string");
}
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public String toString() {
return "Student{" + "name='" + name + '\'' ",rollNumber=" + rollNumber + ", age=" + age + '}';
}
}
public class    Q1 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter name, roll number, and age: ");
String name = scanner.nextLine();
Object rollNumber = scanner.nextLine();
int age = scanner.nextInt();
scanner.nextLine();
Student student1;
try {
student1 = new Student(name, rollNumber, age);
System.out.println(student1);
} catch (IllegalArgumentException e) {
System.out.println("Error: " + e.getMessage());
}
}
}