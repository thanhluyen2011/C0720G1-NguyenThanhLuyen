package access_modifier_05.bai_tap;

public class Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

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
    public Shape(){}
    public Shape(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getArea(double side1,double side2,double side3){
        double p = 1/2*(side1+side2+side3);
        return Math.sqrt(p*(p - getSide1())*(p - getSide2())*(p - getSide3()));
    }
    public double getPerimeterd(double side1,double side2,double side3){
        return (getSide1() + getSide2() + getSide3());
    }
    public String toString(){
        return "side1 = " + getSide1() +"\t" +
                "side 2 = " + getSide2() + "\t" +
                "side 3 = " + getSide3() + "\t" +
                "S = " + getArea() + "\t" +
                "P = " + getPerimeterd();
    }
}
