package _12_java_collection_framework.thuc_hanh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Students implements Comparable <Students> {


    private String name;
    private Integer age;
    private String address;

    public Students(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students student) {
        return this.getName().compareTo(student.getName());
    }
}
class AgeComparator implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Students student = new Students("Kien", 30, "HT");
        Students student1 = new Students("Nam", 26, "HN");
        Students student2 = new Students("Anh", 38, "HT" );
        Students student3 = new Students("Tung", 38, "HT" );

        List<Students> lists = new ArrayList<Students>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Students st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Students st : lists){
            System.out.println(st.toString());
        }
    }

}
