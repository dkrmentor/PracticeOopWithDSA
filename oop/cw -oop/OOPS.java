// ///object & classes
// class Pen {
// String color;
// public void write() {
// System.out.println("I write");
// }
// public void color() {
// System.out.println(this.color);
// }
// }

// public class OOPS {
// public static void main(String[] args) {
// Pen pen = new Pen();
// pen.write();
// Pen pen1 = new Pen();
// Pen pen2 = new Pen();
// pen1.color = "red";
// pen2.color = "green";
// pen1.color();
// pen2.color();
// }
// }

// ///unparametrized constructors
// class Student {
// String name;
// String age;

// public void printInfo() {
// System.out.println("my name is " + this.name);
// System.out.println("my age is " + this.age);

// }

// Student() {
// System.out.println("unparamentrized construtor");
// }
// }

// public class OOPS {
// public static void main(String[] args) {

// Student student = new Student();
// student.name = "dhara";
// student.age = "25";
// student.printInfo();}}

// ///parametrized constructors
// class Student {
// String name;
// String age;

// public void printInfo() {
// System.out.println("my name is " + this.name);
// System.out.println("my age is " + this.age);

// }

// Student(String name, String age) {
// this.name = name;
// this.age = age;
// System.out.println("parametrized constructor");
// }

// }

// public class OOPS {
// public static void main(String[] args) {
// Student students = new Student("dhara", "25");
// students.printInfo();

// }
// }

// /// copy constructors
// class Student {
// String name;
// String age;
// public void printInfo() {
// System.out.println(this.name);
// System.out.println(this.age);
// }
// Student() {
// }
// Student(Student s2) {
// this.name = s2.name;
// this.age = s2.age;
// }
// }

// public class OOPS {
// public static void main(String[] args) {
// Student student = new Student();
// student.name = "dhara";
// student.age = "25";
// student.printInfo();
// Student s2 = new Student(student);
// s2.printInfo();
// }
// }