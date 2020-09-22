package _10_danh_sach.bai_tap;

public class TestMyList {
    public static class Student{
        private int id;
        private String name;
        public Student(){}
        public Student(int id, String name){
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

    public static void main(String[] args) {
        Student a = new Student(1,"luyen");
        Student b = new Student(2,"khoa");
        Student c = new Student(3,"cuong");
        Student d = new Student(4,"duy");
        Student e = new Student(5,"nhi");
        Student f = new Student(6,"tien");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newstudentMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
        studentMyList.add(4,f);
        for (int i =0; i < studentMyList.size();i++){
            Student student = (Student) studentMyList.elements[i];
            System.out.println(student.getId() + " " + student.getName());
        }
        System.out.println(studentMyList.get(0).getId() + " " + studentMyList.get(0).getName());
//      trả về index
        System.out.println(studentMyList.indexOf(a));
//        kiểm tra phần tử có trong mảng hay không
        System.out.println(studentMyList.contains(d));
//        sao chép
        newstudentMyList = studentMyList.clone();
//        Xóa phần tử
        newstudentMyList.remove(2);
        for (int i =0; i < newstudentMyList.size();i++){
            System.out.println(newstudentMyList.get(i).getId() + " " + newstudentMyList.get(i).getName());
        }

    }
}
