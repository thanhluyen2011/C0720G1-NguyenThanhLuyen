package _17_binary_file.bai_tap;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String productiondelay;
    private int price;
    private String coment;

    public Product(int id, String name, String productiondelay, int price, String coment) {
        this.id = id;
        this.name = name;
        this.productiondelay = productiondelay;
        this.price = price;
        this.coment = coment;
    }

    public Product() {

    }

    public Product(int parseInt, String s) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductiondelay() {
        return productiondelay;
    }

    public void setProductiondelay(String productiondelay) {
        this.productiondelay = productiondelay;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productiondelay='" + productiondelay + '\'' +
                ", price=" + price +
                ", coment='" + coment + '\'' +
                '}' + "\n";
    }
}
