package models;
import data.Employee;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class FilingCabinets {
    public static final String FILE_NAME_EMPLOYEE = "D:\\C0720G1-NguyenThanhLuyen\\FuramaResort\\src\\views\\Employee.csv";
    private static Stack<Employee> listStack = new Stack<>();
    public static void readFileEmpoyee() {
        try {
            FileReader fileReader = new FileReader(FILE_NAME_EMPLOYEE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Employee employee;
            while ((line = bufferedReader.readLine()) != null){
                temp = line.split(",");
                employee = new Employee(temp[0],temp[1],temp[2],temp[3]);
                listStack.add(employee);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void employeeProfileSearch() {
        Scanner scanner = new Scanner(System.in);
        readFileEmpoyee();
        int size = listStack.size();
        boolean flag = false;
        System.out.print("Nhập tên bạn muốn tìm:");
        String input = scanner.nextLine();
        for (int i = 0; i < size; i++) {
            if (listStack.peek().getName().equals(input)) { //001
                System.out.println(listStack.pop());
                flag = true;
                continue;
            }
            listStack.pop();
        }
        if (!flag) {
            System.err.println("Không có nhân viên bạn muốn tìm");
        }
    }
}
