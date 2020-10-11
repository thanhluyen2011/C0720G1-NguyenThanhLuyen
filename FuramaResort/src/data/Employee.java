package data;

public class Employee {
    String id;
    String name;
    String age;
    String adress;

    public Employee(String id, String name, String age, String adress) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adress = adress;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
