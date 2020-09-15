package access_modifier_05.bai_tap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){};
    public Circle(double radius){
        this.radius = radius;
    }
    double getRadius(){
        return this.radius;
    }
    double getArea(){
        return (Math.PI)* this.radius*this.radius;
    }
}
class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("radius : " + circle.getRadius());
        System.out.println("Area : " + circle.getArea());
    }
}

