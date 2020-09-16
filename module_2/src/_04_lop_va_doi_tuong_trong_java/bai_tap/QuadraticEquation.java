package lop_va_doi_tuong_trong_java_04.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        double delta = (2 * this.b) - 4 * (this.a * this.c);
        return delta;
    }

    public double getRoot1() {
        double r1 = ((-this.b + Math.pow((this.b * this.b) - 4 * this.a * this.c, 0.5)) / 2 * this.a);
        return r1;
    }

    public double getRoot2() {
        double r2 = ((-this.b - Math.pow((this.b * this.b) - 4 * this.a * this.c, 0.5)) / 2 * this.a);
        return r2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a = ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b = ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c = ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("PT có 2 nghiệm: \n r1 = " + quadraticEquation.getRoot1() + "\n r2 =" + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("PT có 1 nghiệm : \n" + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
