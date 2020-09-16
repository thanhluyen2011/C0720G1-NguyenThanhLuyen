package _07_abstract_class_va_interface.thuc_hanh;

public abstract class Animal {
    public abstract String makeSound();
}
class Tiger extends Animal{

    @Override
    public String makeSound() {
        return "cà-uồm";
    }
}
class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "quát-quát";
    }

    @Override
    public String howToEAt() {
        return "thoc";
    }
}
class Orange extends Fruit{

    @Override
    public String howToEAt() {
        return "vắt lấy nước";
    }
}
class Apple extends Fruit{

    @Override
    public String howToEAt() {
        return "cắn";
    }
}
class TestDV{
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        System.out.println(" hổ kêu : \t" + tiger.makeSound());
        Chicken chicken = new Chicken();
        System.out.println("gà kêu : \t" + chicken.makeSound());
        System.out.println("gà ăn : \t" + chicken.howToEAt());
        Orange orange = new Orange();
        System.out.println("cách ăn cam : \t" + orange.howToEAt());
        Apple apple = new Apple();
        System.out.println("cách ăn táo : \t" +apple.howToEAt());
    }
}
