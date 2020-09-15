package ke_thua_06.bai_tap;

public class Circle {
    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double Area(double radius) {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "bán kính : " + getRadius() +
                "màu sắc : " + getColor() +
                "diên tích : " + Area(this.radius);
    }
}
