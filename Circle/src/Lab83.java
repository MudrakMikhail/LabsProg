import java.util.ArrayList;
import java.util.Date;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{radius=" + radius + '}';
    }
}

class Triangle {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {}

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() { return side1; }
    public double getSide2() { return side2; }
    public double getSide3() { return side3; }

    @Override
    public String toString() {
        return "Triangle{side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + '}';
    }
}

public class Lab83 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(new Triangle(3.0, 4.0, 5.0));
        list.add(new Date());
        list.add("Это строка");
        list.add(new Circle(7.5));

        System.out.println("Элементы списка:");
        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}
