package ke_thua_06.bai_tap;

import ke_thua_06.thuc_hanh.Shape;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public Triangle(){}
    public Triangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeterd(){
        return (this.side1 +this.side2 + this.side3);
    }
    public double getArea(){
        double p = getPerimeterd()/2;
        return Math.sqrt(p*(p - this.side1)*(p - this.side2)*(p - this.side3));
    }

    public String toString(){
        return super.toString() + "\t" +
                "side1 = " + this.side1 +"\t" +
                "side 2 = " + this.side2 + "\t" +
                "side 3 = " + this.side3 + "\t"+
                "S = " + getArea() + "\t" +
                "P = " + getPerimeterd();
    }
}
class Test{
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Triangle triangle1 = new Triangle(5,10,12);
        System.out.println(triangle.toString());
        System.out.println(triangle1.toString());
    }
}
