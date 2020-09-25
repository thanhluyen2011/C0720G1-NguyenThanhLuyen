package _12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager{
    ArrayList<Product> productArrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void displayMenu(){
        System.out.println("1.addProduct" +
                "\n 2.repair" +
                "\n 3.erase" +
                "\n 4.search" +
                "\n 5.sort" +
                "\n 6.display");
        int choose = sc.nextInt();
            switch (choose){
                case 1:
                    addProduct();
                    break;
                case 2:
                    repair();
                    break;
                case 3:
                    erase();
                    break;
                case 4 :
                    search();
                    break;
                case 5 :
                    sort();
                    break;
                case 6:
                    displayProduct();
                    break;
                default:
                    System.out.println("bạn nhập sai.Bạn hãy nhập 1 -> 6");
            }
    }
    public void addProduct(){
        System.out.println("Nhập id sản phẩm: ");
        int id = sc.nextInt();
        System.out.println("nhập tên sản phẩm: ");
        String name = sc.next();
        System.out.println("nhập giá sản phẩm: ");
        int price = sc.nextInt();
        Product product = new Product(id,name,price);
        productArrayList.add(product);
        displayMenu();
    }
    public void repair(){
        System.out.println("Nhập id sản phẩm muốn tìm kiếm");
        int id = sc.nextInt();
        for (int i = 0; i < productArrayList.size(); i++){
            if (id == productArrayList.get(i).getId()){
                System.out.println("Nhập lại tên sản phẩm");
                String name = sc.next();
                productArrayList.get(i).setName(name);
                System.out.println("Nhập lại giá sản phẩm");
                int price = sc.nextInt();
                productArrayList.get(i).setPrice(price);
                break;
            }
        }
        displayMenu();
    }
    public void erase(){
        System.out.println("Nhập id sản phẩm muốn tìm kiếm");
        int id = sc.nextInt();
        for (int i = 0; i < productArrayList.size(); i++) {
            if (id == productArrayList.get(i).getId()) {
                productArrayList.remove(i);
                break;
            }
        }
        displayMenu();
    }
    public void search(){
        System.out.println("Nhập tên sản phẩm");
        String name = sc.next();
        for (int i = 0; i < productArrayList.size(); i++) {
            if (name.equals(productArrayList.get(i).getName())) {
                System.out.println(productArrayList.get(i).getId() + " " + productArrayList.get(i).getName() + " " + productArrayList.get(i).getPrice());
                break;
            }
        }
        displayMenu();
    }
    public void sort(){
        System.out.println("1.sắp xếp theo giá tăng dần" +
                "\n 2.sắp xếp theo giá giảm dần");
        int sort = sc.nextInt();
        switch (sort){
            case 1:
                Collections.sort(productArrayList,new SortInCreasePrice());
                break;
            case 2 :
                Collections.sort(productArrayList, new DescendingOrder());
        }
        displayMenu();
    }
    public void displayProduct(){
        for (int i = 0; i < productArrayList.size(); i++){
            System.out.println(productArrayList.get(i).getId() + " " + productArrayList.get(i).getName() + " " + productArrayList.get(i).getPrice());
        }
        displayMenu();
    }
}
class Test{
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.displayMenu();
    }
}
