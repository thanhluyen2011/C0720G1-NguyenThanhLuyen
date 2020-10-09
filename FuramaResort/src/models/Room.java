package models;

public class Room extends Services {
    private FreeSevice free;
    public Room(){}

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }

    public Room(FreeSevice free) {
        this.free = free;
    }

    public Room(String id, String name, String area, String cost, String people, String rentalType, FreeSevice free) {
        super(id, name, area, cost, people, rentalType);
        this.free = free;
    }

    public FreeSevice getFree() {
        return free;
    }

    public void setFree(FreeSevice free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() + '\'' +
                " free :" + free +
                '}';
    }
}
