
interface animal {
    void walk();    
}

interface herb{
 void eats();
}

class Horse implements animal, herb{
    public void walk(){
        System.out.println("walk");
    }
    public void eats(){
        System.out.println("Eat grass");
    }
}

public class Interface {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eats();
        
    }
}
