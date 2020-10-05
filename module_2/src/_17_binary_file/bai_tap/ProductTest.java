package _17_binary_file.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTest {
    public static List<Product> listProducts  = new ArrayList<>();
    public static List<Product> list  = new ArrayList<>();
    public static final String FILE_PATH = "D:\\C0720G1-NguyenThanhLuyen\\module_2\\src\\_17_binary_file\\bai_tap\\test_binary.txt";


    public static void addProduct() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Id product");
            int id = sc.nextInt();
            System.out.println("Enter name product");
            sc.nextLine();
            String nameProduct = sc.nextLine();
            System.out.println("Enter  manufacturer");
            String manufacturer = sc.nextLine();
            System.out.println("Enter price");
            int price = sc.nextInt();
            System.out.println("Enter other description (if have)");
            sc.nextLine();
            String otherDescription = sc.nextLine();
            Product product = new Product(id, nameProduct, manufacturer, price, otherDescription);
            listProducts.add(product);
            FileOutputStream fileWriter = new FileOutputStream(FILE_PATH);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileWriter);
            outputStream.writeObject(listProducts);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void displayProduct() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(FILE_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectInputStream objIS = null;
        try {
            objIS = new ObjectInputStream(fileInputStream);
            list = (List<Product>) objIS.readObject();
        } catch (EOFException e) {
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }
    public static Product search() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id want search");
        int id = sc.nextInt();
        for (Product product : list) {
            if (product.getId() == id) {
                System.out.println(product.toString());
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Thêm sản phẩm" +
                    "\n2.Hiển thị danh sách sản phẩm" +
                    "\n3.t Tìm theo Id" +
                    "\n4.Exit");
            try {
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1:
                        addProduct();
                        break;
                    case 2:
                        displayProduct();
                        break;
                    case 3:
                        search();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Không có lựa chọn này");
                }
            } catch (NumberFormatException e) {
                System.out.println("xin hãy nhập số");
            }
        }
    }
}
