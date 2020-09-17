package _07_abstract_class_va_interface.bai_tap.Resizeable;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius() + (percent/100));
    }
}
class CircleTest{
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.getArea());
        circle.resize(Math.random()*100);
        System.out.println(circle.getArea());
    }
}
