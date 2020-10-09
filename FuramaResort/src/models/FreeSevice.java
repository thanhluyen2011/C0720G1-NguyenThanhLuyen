package models;

public class FreeSevice {
    String name;
    String unit;
    String price;

    public FreeSevice(String name, String unit, String price) {
        this.name = name;
        this.unit = unit;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                " name = " + '\'' + name + '\'' +
                ", unit =" + '\'' + unit + '\'' +
                ", prive =" +'\'' +  price + '\'';
    }
}
