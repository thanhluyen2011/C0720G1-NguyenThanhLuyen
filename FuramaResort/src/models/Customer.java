package models;

public class Customer implements Comparable<Customer> {
    String name;
    String dateOfBirth;
    String sex;
    String cmnd;
    String phone;
    String email;
    String typeOfCustomer;
    String address;
    Services services;

    public Customer(String name, String dateOfBirth, String sex, String cmnd, String phone, String email, String typeOfCustomer, String address, Services services) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        this.services = services;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                ", services=" + services +
                '}';
    }
    public void showInfor(){
        System.out.println(this.toString());
    }
    public int compareTo(Customer name) {
        int swap = this.name.compareTo(name.name);
        if (swap == 0){
            int yearCustomer1 = Integer.parseInt(this.dateOfBirth.split("/")[2]);
            int yearCustomer2 = Integer.parseInt(name.dateOfBirth.split("/")[2]);
            swap = yearCustomer1 - yearCustomer2;
        }
        return swap;
    }
}
