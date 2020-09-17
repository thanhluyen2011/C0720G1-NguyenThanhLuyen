package _07_abstract_class_va_interface.bai_tap.Resizeable;


public class Rectangle extends Shape {

    private  double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth()+ (percent/100));
        setHeight(getHeight() + (percent/100));
    }
}
class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,4);
        System.out.println(rectangle.getArea());
        rectangle.resize(Math.random()*100);
        System.out.println(rectangle.getArea());
    }
}
