class Shape {
    double area;
    double pie = 3.14;

    public void area() {
        System.out.println("Shape");

    }
}

class Triangle extends Shape {
    public void area(double l, double h) {
        area();
        System.out.println("Triangle");
        area = 0.5 * l * h;
        System.out.println(area);

    }
}

class EqualTriangle extends Triangle {
    public void area(double l, double h) {
        area();
        System.out.println("EqualTriangle");
        area = 0.5 * l * h;
        System.out.println(area);

    }
}

class Circle extends Shape {
    public void area(double r) {
        area();
        System.out.println("Circle");
        area = pie * r * r;
        System.out.println(area);

    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Shape size = new Shape();
        // size.area();
        Triangle Trianglesize = new Triangle();
        Trianglesize.area(20, 52);
        EqualTriangle EqualTrianglesize = new EqualTriangle();
        EqualTrianglesize.area(2, 2);
        Circle Circlesize = new Circle();
        Circlesize.area(2);

    }
}
