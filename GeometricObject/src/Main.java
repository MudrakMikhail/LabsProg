public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.println(triangle.toString());
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Площадь: " + triangle.getArea());
    }
}
