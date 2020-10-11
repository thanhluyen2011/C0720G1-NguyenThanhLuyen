package controllers;

import commons.*;
import data.Employee;
import models.*;

import java.io.*;
import java.util.*;

public class MainController {
    private static final String HOUSE_FILE = "D:\\C0720G1-NguyenThanhLuyen\\FuramaResort\\src\\views\\House.csv";
    private static final String ROOM_FILE = "D:\\C0720G1-NguyenThanhLuyen\\FuramaResort\\src\\views\\Room.csv";
    private static final String VILLA_FILE = "D:\\C0720G1-NguyenThanhLuyen\\FuramaResort\\src\\views\\Villa.csv";
    private static final String CUSTOMER_FILE = "D:\\C0720G1-NguyenThanhLuyen\\FuramaResort\\src\\views\\Customer.csv";
    private static final String ADDBOOKING_FILE = "D:\\C0720G1-NguyenThanhLuyen\\FuramaResort\\src\\views\\AddBooking.csv";
    private static final String COMA = ",";
    private static final String EMPLOYEE_FILE = "D:\\C0720G1-NguyenThanhLuyen\\FuramaResort\\src\\views\\Employee.csv";

    public static void main(String[] args) throws IdCardException, GenderException, BirthdayException, EmailException {
        displayMainMenu();
    }

    public static void displayMainMenu() throws IdCardException, GenderException, BirthdayException, EmailException {
        System.out.println("1. Add New Services\n"
                + "2.Show Services\n"
                + "3.Add New Customer\n"
                + "4.Show Information of Customer\n"
                + "5.Add New Booking\n"
                + "6.Show Information of Employee\n"
                + "7.Show list lined up\n"
                + "8.search Employee \n"
                + "9.Exit");
        System.out.print("nhập sự lựa chọn của bạn: ");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                addNewServices();
                displayMainMenu();
                break;
            case 2:
                showServices();
                displayMainMenu();
                break;
            case 3:
                addNewCustomer();
                displayMainMenu();
                break;
            case 4:
                showCustomer();
                displayMainMenu();
                break;
            case 5:
                addNewBooking();
                displayMainMenu();
                break;
            case 6 :
                showInformationOfEmployee();
                displayMainMenu();
                break;
            case 7 :
                showListLinedUp();
                displayMainMenu();
                break;
            case 8 :
                searchEmployee();
                displayMainMenu();
                break;
            case 9 :
                System.exit(0);
        }
    }
    public static void searchEmployee(){
        FilingCabinets.employeeProfileSearch();
    }
    public static void showListLinedUp(){
        Queue<Customer> queue = new LinkedList<>();
        try{
            FileReader fileReader = new FileReader(CUSTOMER_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Customer customer;
            while ((line = bufferedReader.readLine()) != null){
                temp = line.split(COMA);
                customer = new Customer(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6],temp[7],null);
                queue.add(customer);
            }
            while (!queue.isEmpty()){
                System.out.println(queue.poll());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void showInformationOfEmployee(){
        Map<Integer, Employee> map = new TreeMap<>();
        try {
            FileReader fileReader = new FileReader(EMPLOYEE_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Employee employee;
            while ((line = bufferedReader.readLine()) != null){
                temp = line.split(COMA);
                employee = new Employee(temp[0],temp[1],temp[2],temp[3]);
                map.put((Integer.parseInt(employee.getId())),employee);
            }
            for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void addNewBooking() {
        List<Customer> customerList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(CUSTOMER_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Customer customer;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMA);
                customer = new Customer(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], null);
                customerList.add(customer);
            }
            Collections.sort(customerList);
            for (int i = 0; i < customerList.size(); i++) {
                System.out.print(i + 1 + " : ");
                customerList.get(i).showInfor();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("chọn khách hàng: ");
        int numberCustomer = Integer.parseInt(scanner.nextLine());
        customerList.get(numberCustomer - 1).showInfor();
        System.out.println("1.Booking Villa" + "\n"
                + "2.Booking House" + "\n"
                + "3.Booking Room");
        System.out.print("chọn dịch vụ: ");
        int d = Integer.parseInt(scanner.nextLine());
        switch (d) {
            case 1: {
                List<Villa> villaList = new ArrayList<>();
                try {
                    FileReader fileReader = new FileReader(VILLA_FILE);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String line;
                    String[] temp;
                    Villa villa;
                    while ((line = bufferedReader.readLine()) != null) {
                        temp = line.split(COMA);
                        villa = new Villa(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
                        villaList.add(villa);
                    }
                    for (int i = 0; i < villaList.size(); i++) {
                        System.out.print(i + 1 + ": ");
                        villaList.get(i).showInfor();
                    }
                    bufferedReader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    e.printStackTrace();
                } catch (IOException e) {
                }
                System.out.print("chọn loại Villa: ");
                int numberVilla = Integer.parseInt(scanner.nextLine());
                villaList.get(numberVilla - 1).showInfor();
                customerList.get(numberCustomer - 1).setServices(villaList.get(numberVilla - 1));
                try {
                    String line = customerList.get(numberCustomer - 1).toString();
                    FileWriter fileWriter = new FileWriter(ADDBOOKING_FILE, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 2: {
                List<House> houseList = new ArrayList<>();
                try {
                    FileReader fileReader = new FileReader(HOUSE_FILE);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String line;
                    House house;
                    String[] temp;
                    while ((line = bufferedReader.readLine()) != null) {
                        temp = line.split(COMA);
                        house = new House(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
                        houseList.add(house);
                    }
                    for (int i = 0; i < houseList.size(); i++) {
                        System.out.println(i + 1 + ": ");
                        houseList.get(i).showInfor();
                    }
                    bufferedReader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.print("chọn loại House: ");
                int numberHouse = Integer.parseInt(scanner.nextLine());
                houseList.get(numberHouse - 1).showInfor();
                customerList.get(numberCustomer - 1).setServices(houseList.get(numberHouse - 1));
                String line = customerList.toString();
                try {
                    FileWriter fileWriter = new FileWriter(ADDBOOKING_FILE, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 3:
                List<Room> roomList = new ArrayList<>();
                try {
                    FileReader fileReader = new FileReader(ROOM_FILE);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String line;
                    String[] temp;
                    Room room;
                    while ((line = bufferedReader.readLine()) != null) {
                        temp = line.split(COMA);
                        room = new Room(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], new FreeSevice(temp[6], temp[7], temp[8]));
                        roomList.add(room);
                    }
                    for (int i = 0; i < roomList.size(); i++) {
                        System.out.print(i + 1 + ": ");
                        roomList.get(i).showInfor();
                    }
                    bufferedReader.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.print("chọn loại Room: ");
                int numberRoom = Integer.parseInt(scanner.nextLine());
                roomList.get(numberRoom - 1).showInfor();
                customerList.get(numberCustomer - 1).setServices(roomList.get(numberRoom - 1));
                String line = customerList.toString();
                try {
                    FileWriter fileWriter = new FileWriter(ADDBOOKING_FILE, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    public static void showCustomer() {
        List<Customer> customerList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(CUSTOMER_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Customer customer;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMA);
                customer = new Customer(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], null);
                customerList.add(customer);
            }
            Collections.sort(customerList);
            for (int i = 0; i < customerList.size(); i++) {
                System.out.print(i + 1 + " : ");
                customerList.get(i).showInfor();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addNewCustomer() throws BirthdayException, GenderException, IdCardException, EmailException {
        String name;
        String dateOfBirth;
        String sex;
        String cmnd;
        String phone;
        String email;
        String typeOfCustomer;
        String address;
        Scanner scanner = new Scanner(System.in);
        boolean check;
        System.out.println("Nhập thông tin Customer");
        System.out.println("Nhập tên");
        while (true) {
            try {
                name = scanner.nextLine();
                check = Validator.isValiNameCustomer(name);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập lại");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Nhập ngày tháng năm sinh");
        while (true) {
            dateOfBirth = scanner.nextLine();
            check = Validator.isValiDayOfBirth(dateOfBirth);
            if (check) {
                break;
            } else {
                System.out.println("Nhập lại");
            }
        }
        System.out.println("Nhập giới tính");
        while (true) {
            sex = scanner.nextLine();
            check = Validator.isValiSexCustomer(sex);
            if (check) {
                break;
            } else {
                System.out.println("Nhập lại");
            }
        }
        System.out.println("cmnd");
        while (true) {
            cmnd = scanner.nextLine();
            check = Validator.isValiCMND(cmnd);
            if (check) {
                break;
            } else {
                System.out.println("Nhập lại");
            }
        }
        System.out.println("Số điện thoại");
        phone = scanner.nextLine();
        System.out.println("Nhập email");
        while (true) {
            email = scanner.nextLine();
            check = Validator.isValiEmaiCustomer(email);
            if (check) {
                break;
            } else {
                System.out.println("Nhập lại");
            }
        }
        System.out.println("Loại khách hàng");
        typeOfCustomer = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        address = scanner.nextLine();
        Customer customer = new Customer(name, dateOfBirth, sex, cmnd, phone, email, typeOfCustomer, address, null);
        String line =
                customer.getName() + COMA +
                        customer.getDateOfBirth() + COMA +
                        customer.getSex() + COMA +
                        customer.getCmnd() + COMA +
                        customer.getPhone() + COMA +
                        customer.getEmail() + COMA +
                        customer.getTypeOfCustomer() + COMA +
                        customer.getAddress() + COMA +
                        customer.getServices();
        FileUtils.writeFile(line, CUSTOMER_FILE);
    }

    public static void addNewServices() throws IdCardException, GenderException, BirthdayException, EmailException {
        System.out.println("1.Add New Villa" + "\n"
                + "2.Add New House" + "\n"
                + "3.Add New Room" + "\n"
                + "4.Back to menu" + "\n"
                + "5.Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("chọn dịch vụ cần thêm: ");
        int choose = scanner.nextInt();

        switch (choose) {
            case 1:
                addVilla();
                break;
            case 2:
                addHouse();
                break;
            case 3:
                addRoom();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
        }
    }

    public static void addVilla() {
        String id;
        String name;
        String area;
        String cost;
        String peopleMax;
        String rentalType;
        String standard;
        String comment;
        String areaPool;
        String floors;
        try {
            Scanner sc = new Scanner(System.in);
            boolean check;
            System.out.println("Nhập thông tin Villa");
            System.out.println("Nhập id");
            while (true) {
                id = sc.nextLine();
                check = Validator.regexId(id);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("Nhập tên :");
            while (true) {
                name = sc.nextLine();
                check = Validator.regexNameService(name);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("Nhập diện tích");
            while (true) {
                area = sc.nextLine();
                check = Validator.regexAreaOfUse(area);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("Nhập giá");
            while (true) {
                cost = sc.nextLine();
                check = Validator.regexCost(cost);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("nhập số người tối đa");
            while (true) {
                peopleMax = sc.nextLine();
                check = Validator.regexPeople(peopleMax);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("Nhập kiểu phòng");
            while (true) {
                rentalType = sc.nextLine();
                check = Validator.regexNameService(rentalType);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("Nhập tiêu chuẩn phòng:");
            while (true) {
                standard = sc.nextLine();
                check = Validator.regexNameService(standard);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("Mô tả phòng :");
            comment = sc.nextLine();
            System.out.println("Diện tích hồ bơi");
            while (true) {
                areaPool = sc.nextLine();
                check = Validator.regexAreaOfUse(areaPool);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại :");
                }
            }
            System.out.println("Nhập số tầng :");
            while (true) {
                floors = sc.nextLine();
                check = Validator.regexFloors(floors);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại :");
                }
            }
            Villa villa = new Villa(id, name, area, cost, peopleMax, rentalType, standard, comment, areaPool, floors);
            String line =
                    villa.getId() + COMA +
                            villa.getName() + COMA +
                            villa.getArea() + COMA +
                            villa.getCost() + COMA +
                            villa.getPeople() + COMA +
                            villa.getRentalType() + COMA +
                            villa.getStandard() + COMA +
                            villa.getComment() + COMA +
                            villa.getAreaPool() + COMA +
                            villa.getFloors();
            FileUtils.writeFile(line, VILLA_FILE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addHouse() {
        String id;
        String name;
        String area;
        String cost;
        String peopleMax;
        String rentalType;
        String standard;
        String comment;
        String floors;
        try {
            Scanner sc = new Scanner(System.in);
            boolean check;
            System.out.println("Nhập thông tin House");
            System.out.println("Nhập id");
            while (true) {
                id = sc.nextLine();
                check = Validator.regexId(id);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("Nhập tên :");
            while (true) {
                name = sc.nextLine();
                check = Validator.regexNameService(name);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("Nhập diện tích");
            while (true) {
                area = sc.nextLine();
                check = Validator.regexAreaOfUse(area);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("Nhập giá");
            while (true) {
                cost = sc.nextLine();
                check = Validator.regexCost(cost);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("nhập số người tối đa");
            while (true) {
                peopleMax = sc.nextLine();
                check = Validator.regexPeople(peopleMax);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("Nhập kiểu phòng");
            while (true) {
                rentalType = sc.nextLine();
                check = Validator.regexNameService(rentalType);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("Nhập tiêu chuẩn phòng:");
            while (true) {
                standard = sc.nextLine();
                check = Validator.regexNameService(standard);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("Mô tả phòng :");
            comment = sc.nextLine();
            System.out.println("Nhập số tầng :");
            while (true) {
                floors = sc.nextLine();
                check = Validator.regexFloors(floors);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại :");
                }
            }
            House house = new House(id, name, area, cost, peopleMax, rentalType, standard, comment, floors);
            String line =
                    house.getId() + COMA +
                            house.getName() + COMA +
                            house.getArea() + COMA +
                            house.getCost() + COMA +
                            house.getPeople() + COMA +
                            house.getRentalType() + COMA +
                            house.getStandard() + COMA +
                            house.getComment() + COMA +
                            house.getFloors();
            FileUtils.writeFile(line, HOUSE_FILE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addRoom() {
        String id;
        String name;
        String area;
        String cost;
        String peopleMax;
        String rentalType;
        try {
            Scanner sc = new Scanner(System.in);
            boolean check;
            System.out.println("Nhập thông tin Room");
            System.out.println("Nhập id");
            while (true) {
                id = sc.nextLine();
                check = Validator.regexId(id);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("Nhập tên :");
            while (true) {
                name = sc.nextLine();
                check = Validator.regexNameService(name);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("Nhập diện tích");
            while (true) {
                area = sc.nextLine();
                check = Validator.regexAreaOfUse(area);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("Nhập giá");
            while (true) {
                cost = sc.nextLine();
                check = Validator.regexCost(cost);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("nhập số người tối đa");
            while (true) {
                peopleMax = sc.nextLine();
                check = Validator.regexPeople(peopleMax);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("Nhập kiểu phòng");
            while (true) {
                rentalType = sc.nextLine();
                check = Validator.regexNameService(rentalType);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            }
            System.out.println("Nhập dịch vụ kèm");
            System.out.println("Nhập tên dịch vụ đính kèm");
            String nameFree;
            while (true) {
                nameFree = sc.nextLine();
                check = Validator.isValiNameCustomer(name);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại");
                }
            }
            String unit;
            System.out.println("Nhập đơn vị đi kèm");
            while (true) {
                unit = sc.nextLine();
                check = Validator.regexFree(unit);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại");
                }
            }
            String price;
            System.out.println("Nhập giá ");
            while (true) {
                price = sc.nextLine();
                check = Validator.regexCost(price);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại");
                }
            }
            FreeSevice freeSevice = new FreeSevice(nameFree, unit, price);
            Room room = new Room(id, name, area, cost, peopleMax, rentalType, freeSevice);
            String line =
                    room.getId() + COMA +
                            room.getName() + COMA +
                            room.getArea() + COMA +
                            room.getCost() + COMA +
                            room.getPeople() + COMA +
                            room.getRentalType() + COMA +
                            room.getFree().getName() + COMA +
                            room.getFree().getUnit() + COMA +
                            room.getFree().getPrice();
            FileUtils.writeFile(line, ROOM_FILE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showServices() throws IdCardException, GenderException, BirthdayException, EmailException {
        System.out.println("1.Show all Villa" + "\n"
                + "2.Show all House" + "\n"
                + "3.Show all Room" + "\n"
                + "4.Show All Name Villa Not Duplicate" + "\n"
                + "5.Show All Name House Not Duplicate" + "\n"
                + "6.Show All Name Name Not Duplicate" + "\n"
                + "7.Back to menu" + "\n"
                + "8.Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sự lựa chọn :");
        int d = scanner.nextInt();
        switch (d) {
            case 1:
                showAllVilla();
                showServices();
                break;
            case 2:
                showAllHouse();
                showServices();
                break;
            case 3:
                showAllRoom();
                showServices();
                break;
            case 4:
                showAllNameVillaNotDuplicate();
                showServices();
                break;
            case 5:
                showAllNameHouseNotDuplicate();
                showServices();
                break;
            case 6:
                showAllNameRoomNotDuplicate();
                showServices();
                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                System.exit(0);

        }
    }

    public static void showAllNameRoomNotDuplicate() {
        List<Room> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(ROOM_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Room room;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMA);
                room = new Room(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], new FreeSevice(temp[6], temp[7], temp[8]));
                list.add(room);
            }
            Set<String> treeSet = new TreeSet<>();
            for (Room room1 : list) {
                treeSet.add(room1.getName());
            }
            for (String string : treeSet) {
                System.out.println(string);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showAllNameHouseNotDuplicate() {
        List<House> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(ROOM_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            House house;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMA);
                house = new House(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
                list.add(house);
            }
            Set<String> treeSet = new TreeSet<>();
            for (House house1 : list) {
                treeSet.add(house1.getName());
            }
            for (String string : treeSet) {
                System.out.println(string);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showAllNameVillaNotDuplicate() {
        List<Villa> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(VILLA_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Villa villa;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMA);
                villa = new Villa(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
                list.add(villa);
            }
            Set<String> treeSet = new TreeSet<>();
            for (Villa villa1 : list) {
                treeSet.add(villa1.getName());
            }
            for (String string : treeSet) {
                System.out.println(string);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showAllVilla() {
        List<Villa> villaList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(VILLA_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Villa villa;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMA);
                villa = new Villa(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
                villaList.add(villa);
            }
            for (Villa villa1 : villaList) {
                villa1.showInfor();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showAllHouse() {
        List<House> houseList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(HOUSE_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            House house;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMA);
                house = new House(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
                houseList.add(house);
            }
            for (House house1 : houseList) {
                house1.showInfor();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showAllRoom() {
        List<Room> roomList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(ROOM_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Room room;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(COMA);
                room = new Room(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], new FreeSevice(temp[6], temp[7], temp[8]));
                roomList.add(room);
            }
            for (Room room1 : roomList) {
                room1.showInfor();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
