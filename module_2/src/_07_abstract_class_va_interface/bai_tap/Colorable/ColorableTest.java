package _07_abstract_class_va_interface.bai_tap.Colorable;
public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(3);
        shapes[1] = new Circle();
        shapes[2] = new Rectangle();
        for (Shape shape : shapes){
            System.out.println(shape);
            if (shape instanceof Square){
                ((Square) shape).howToColor();
                System.out.println(((Square) shape).getArea());
            }
        }
    }
}
