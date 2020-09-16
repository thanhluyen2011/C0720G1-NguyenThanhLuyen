package access_modifier_05.bai_tap;

public class Circle {
    private double radius;
    private String color;
    public Circle(){

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "bán kính : " + getRadius() + "\n" +
                "màu sắc : " + getColor() + "\n" +
                "diện tích : " + getArea();
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return height *this.getArea();
    }

    public String toString() {
        return "chiều cao : " + getHeight() + "\n" +
                "màu sắc : " + getColor() + "\n" +
                "thể tích : " + volume();
    }
}

class TestCircleVaCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5,"yellow");
        Cylinder cylinder = new Cylinder(3,3,"red");
        System.out.println("Thông tin hình tròn");
        System.out.println(circle.toString());
        System.out.println("Thông tin hình trụ");
        System.out.println(cylinder.toString());
    }
}
