package models;

public class Villa extends Services {
    private String standard;
    private String comment;
    private String areaPool;
    private String floors;
    public Villa(){}

    public Villa(String standard, String comment, String areaPool, String floors) {
        this.standard = standard;
        this.comment = comment;
        this.areaPool = areaPool;
        this.floors = floors;
    }

    public Villa(String id, String name, String area, String cost, String people, String rentalType, String standard, String comment, String areaPool, String floors) {
        super(id, name, area, cost, people, rentalType);
        this.standard = standard;
        this.comment = comment;
        this.areaPool = areaPool;
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

    public String getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(String areaPool) {
        this.areaPool = areaPool;
    }

    public String getFloors() {
        return floors;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                "standard='" + standard + '\'' +
                ", comment='" + comment + '\'' +
                ", areaPool='" + areaPool + '\'' +
                ", floors='" + floors + '\'' +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
