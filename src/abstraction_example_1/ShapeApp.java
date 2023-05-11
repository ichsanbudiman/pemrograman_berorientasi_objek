package abstraction_example_1;

public class ShapeApp {

    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);
        show(s1);
        show(s2);
    }

    public static void show(Shape shape){
        System.out.println("area "+shape.area());
    }


}
