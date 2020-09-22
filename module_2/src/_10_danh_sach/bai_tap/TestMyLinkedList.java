package _10_danh_sach.bai_tap;

import java.util.Arrays;

public class TestMyLinkedList {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;
            public Student(){}

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
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
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"luyen");
        Student student2 = new Student(2,"khoa");
        Student student3 = new Student(3,"cuong");
        Student student4 = new Student(4,"nhi");
        Student student5 = new Student(5,"duy");

        myLinkedList.addFirst(student2);
        myLinkedList.addFirst(student1);
        myLinkedList.add(2,student4);
        myLinkedList.add(2,student3);
        myLinkedList.addLast(student5);

//        xóa bằng index
//        myLinkedList.remove(2);

//        xóa bằng object
//        myLinkedList.remove(student2);

//        sao chép
//        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();
//        for (int i = 0; i < cloneLinkedList.size(); i++){
//            Student student = (Student) cloneLinkedList.get(i);
//            System.out.println(student.getId() + " " + student.getName());
//        }

//        duyệt xem trong mảng có phần tử hay không
//        Student student6 = new Student(6,"gao");
//        System.out.println(myLinkedList.constrains(student6));

//        tìm kiếm chỉ số index của phần tử trong DS
//        System.out.println(myLinkedList.indexOf(student6));

//        lấy phần tử đầu tiên và cuối cùng
//        System.out.println(myLinkedList.getFirst().getId() + " " + myLinkedList.getFirst().getName());
//        System.out.println(myLinkedList.getLast().getId() + " " + myLinkedList.getLast().getName());

//        xóa tất cả phần tử
//        myLinkedList.clear();
//        System.out.println(myLinkedList.size());

//        for (int i = 0; i < myLinkedList.size(); i++){
//            Student student = (Student) myLinkedList.get(i);
//            System.out.println(student.getId() + " " + student.getName());
//        }
    }
}