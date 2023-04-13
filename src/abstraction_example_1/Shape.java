package abstraction_example_1;

public abstract class Shape {
    String color;
 
    abstract double area();


    public abstract String toString();
 
    public Shape(String color)
    {
        System.out.println("Shape constructor called");
        this.color = color;
    }
 
    // this is a concrete method
    public String getColor() { 
        return color; 
    }
}
