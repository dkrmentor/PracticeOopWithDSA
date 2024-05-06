abstract class Animal {
    abstract void walks();

    public void eats() {
        System.out.println("animal eats");
    }
    Animal(){
        System.out.println("animal constructor");
    }
}

class Horse extends Animal {
    public void walks() {
        System.out.println("Horse walk");
    }
    Horse(){
        System.out.println("Horse constructor");
    }

}

class Hen extends Animal {
    public void walks() {
        System.out.println("Hen walk");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Horse ho = new Horse();
        Hen h = new Hen();
        ho.walks();
        ho.eats();
        h.walks();

    }
}