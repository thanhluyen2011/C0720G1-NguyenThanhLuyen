package lop_va_doi_tuong_trong_java_04.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài HCN: ");
        double width = scanner.nextFloat();
        System.out.println("Nhập chiều rộng HCN: ");
        double height = scanner.nextFloat();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Diện tích HCN: " + rectangle.getArea());
        System.out.println("Chu vi HCN: " + rectangle.getPerimeter());
        System.out.println("Hiển thị HCN: " + rectangle.display());
    }
}