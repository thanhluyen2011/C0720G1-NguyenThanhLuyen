package _15_debug.bai_tap;

import java.util.*;

public class Triangle {
    int a, b, c;
    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + a +
                ", side2=" + b +
                ", side3=" + c +
                '}';
    }
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side of Triangle:");
        try {
            System.out.println("Nhập a :");
            int a = scanner.nextInt();
            System.out.println("Nhập b :");
            int b = scanner.nextInt();
            System.out.println("Nhập c :");
            int c = scanner.nextInt();
            if (a <= 0 || b <=0 || c <=0) throw new IllegalTriangleException("Number must be greater than 0");
            else if(a+b< c || a+ c <b || b+ c <a) throw new IllegalTriangleException("The sum of any two sides is greater than the other side");
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
    static class IllegalTriangleException extends Exception {
        public IllegalTriangleException(String error){
            super(error);
        }
        @Override
        public String toString() {
            return "Error input side of Triangle: "+super.getMessage();
        }
    }
}
