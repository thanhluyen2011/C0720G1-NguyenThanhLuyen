package models;

public class Room extends Services {
    private String free;
    public Room(){}

    public Room(String free) {
        this.free = free;
    }

    public Room(String id, String name, String area, String cost, String people, String rentalType, String free) {
        super(id, name, area, cost, people, rentalType);
        this.free = free;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() + '\'' +
                "free='" + free + '\'' +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
