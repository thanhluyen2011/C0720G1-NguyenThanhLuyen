package models;

public class House extends Services {
    private String standard;
    private String comment;
    private String floors;
    public House(){

    }

    public House(String standard, String comment, String floors) {
        this.standard = standard;
        this.comment = comment;
        this.floors = floors;
    }

    public House(String id, String name, String area, String cost, String people, String rentalType, String standard, String comment, String floors) {
        super(id, name, area, cost, people, rentalType);
        this.standard = standard;
        this.comment = comment;
        this.floors = floors;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getFloors() {
        return floors;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString() + '\'' +
                "standard='" + standard + '\'' +
                ", comment='" + comment + '\'' +
                ", floors='" + floors + '\'' +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
