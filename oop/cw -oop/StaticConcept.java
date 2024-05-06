class Concept {
    String name;
    static String school;

}

public class StaticConcept {

    public static void main(String[] args) {
        Concept.school = "abc";
        Concept c = new Concept();
        c.name = "dhara";
        System.out.println(c.name);
        System.out.println(c.school);
    }

}
