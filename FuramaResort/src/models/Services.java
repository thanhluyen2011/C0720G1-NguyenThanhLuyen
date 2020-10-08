package models;

public abstract class Services {
    private String id;
    private String name;
    private String area;
    private String cost;
    private String people;
    private String rentalType;
    public Services(){}
    public Services(String id, String name, String area, String cost, String people, String rentalType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.people = people;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
    public abstract void showInfor();
    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", cost='" + cost + '\'' +
                ", people='" + people + '\'' +
                ", rentalType='" + rentalType;
    }
}
