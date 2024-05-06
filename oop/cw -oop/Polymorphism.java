// method overloading

class Student {
    String name;
    int age;
    public void student(String name){
        System.out.println("name "+name);

    }
    public void student(int age){
        System.out.println("age "+age);

    }
    public void student(String name, int age){
        System.out.println("name "+name+" age "+age);

    }
    
    
}

public class Polymorphism {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age=21;
        s1.name="dhara";
        
        s1.student(s1.name);        
        s1.student(s1.age);
        s1.student(s1.name,s1.age);
        
    }
}