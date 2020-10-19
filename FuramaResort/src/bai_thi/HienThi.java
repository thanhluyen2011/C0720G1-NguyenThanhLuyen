package bai_thi;

import views.SinhVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HienThi {
    public static final String COMA = ",";

    public static void main(String[] args) {
        while (true) {
            displayMenu();
        }
    }

    public static void displayMenu() {
        System.out.println("1.Xem danh sách \n" +
                "2.Thêm mới \n" +
                "3.Cập nhật \n" +
                "4.Xóa \n" +
                "5.Tìm kiếm" +
                "6.Exit");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();
        switch (choose) {
            case "1":
                xem();
                break;
            case "2":
                them();
                break;
            case "3":
                capNhat();
                break;
            case "4":
                xoa();
                break;
            case "5":
                timKiem();
                break;
            case "6" :
                System.exit(0);
            default:
                System.out.println("Nhập từ 1-6");
        }
    }

    public static void timKiem() {
        readFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập sdt cần tim kiếm: ");
        String id = scanner.nextLine();
        int d = 0;
        boolean check = false;
        for (int i = 0; i < danhBaList.size(); i++) {
            if (id.contains(danhBaList.get(i).getSdt())) {
                check = true;
                d = i;
                break;
            }
        }
        if (!check) {
            System.out.println("không tìm thấy");
        } else {
            System.out.println(danhBaList.get(d).toString());
        }
        danhBaList.clear();
    }

    public static void xoa() {
        readFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập sdt cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int d = 0;
        boolean check = false;
        for (int i = 0; i < danhBaList.size(); i++) {
            if (id == Integer.parseInt(danhBaList.get(i).getSdt())) {
                check = true;
                d = i;
                break;
            }
        }
        if (!check) {
            System.out.println("không tìm thấy");
        } else {
            danhBaList.remove(d);
            writeFileIndex0(DocGhiFile.DANHBA_FILE);
            for (int i = 1; i < danhBaList.size(); i++) {
                writeFile(i, DocGhiFile.DANHBA_FILE);
            }
        }
        danhBaList.clear();
    }

    public static void xem() {
        DocGhiFile.doc();
    }

    public static void them() {
        List<DanhBa> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String sdt;
        String nhom;
        String ten;
        String gioiTinh;
        String diaChi;
        String ngaySinh;
        String email;
        boolean check;
        try {
            System.out.println("Nhập số điện thoại");
            do {
                sdt = scanner.nextLine();
                check = KiemTra.setSdt(sdt);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            } while (true);
            System.out.println("Nhập nhóm");
            nhom = scanner.nextLine();
            System.out.println("Nhập tên");
            ten = scanner.nextLine();
            System.out.println("Nhập giới tính");
            gioiTinh = scanner.nextLine();
            System.out.println("Nhập địa chỉ");
            diaChi = scanner.nextLine();
            System.out.println("Nhập ngày sinh");
            ngaySinh = scanner.nextLine();
            System.out.println("Nhập email");
            do {
                email = scanner.nextLine();
                check = KiemTra.setEmail(email);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            } while (true);
            DanhBa danhBa = new DanhBa(sdt, nhom, ten, gioiTinh, diaChi, ngaySinh, email);
            String line = danhBa.getSdt() + COMA +
                    danhBa.getNhomDanhBa() + COMA +
                    danhBa.getHoVaTen() + COMA +
                    danhBa.getGioiTinh() + COMA +
                    danhBa.getDiaChi() + COMA +
                    danhBa.getNgaySinh() + COMA +
                    danhBa.getEmail();
            DocGhiFile.ghi(line);
            System.out.println("Thêm thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<DanhBa> danhBaList = new ArrayList<>();

    public static void readFile() {
        try {
            FileReader fileReader = new FileReader(DocGhiFile.DANHBA_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            DanhBa danhBa;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                danhBa = new DanhBa(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6]);
                danhBaList.add(danhBa);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFileIndex0(String file) {
        String line = danhBaList.get(0).getSdt() + "," + danhBaList.get(0).getNhomDanhBa() + "," + danhBaList.get(0).getHoVaTen() + "," + danhBaList.get(0).getGioiTinh()
                + "," + danhBaList.get(0).getDiaChi() + "," + danhBaList.get(0).getNgaySinh() + "," + danhBaList.get(0).getEmail();
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(int i, String file) {
        String line = danhBaList.get(0).getSdt() + "," + danhBaList.get(0).getNhomDanhBa() + "," + danhBaList.get(0).getHoVaTen() + "," + danhBaList.get(0).getGioiTinh()
                + "," + danhBaList.get(0).getDiaChi() + "," + danhBaList.get(0).getNgaySinh() + "," + danhBaList.get(0).getEmail();
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void capNhat() {
        readFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập sdt cần sửa: ");
        String sdt = scanner.nextLine();
        int num = 0;
        boolean check = false;
        for (int i = 0; i < danhBaList.size(); i++) {
            if (sdt.equals(danhBaList.get(i).getSdt())) {
                check = true;
                num = i;
                break;
            }
        }
        if (!check) {
            System.out.println("không tìm thấy");
        } else {

            System.out.println("Nhập nhóm");
            String nhom = scanner.nextLine();
            System.out.println("Nhập tên");
            String ten = scanner.nextLine();
            System.out.println("Nhập giới tính");
            String gioiTinh = scanner.nextLine();
            System.out.println("Nhập địa chỉ");
            String diaChi = scanner.nextLine();
            System.out.println("Nhập ngày sinh");
            String ngaySinh = scanner.nextLine();
            System.out.println("Nhập email");
            String email;
            do {
                email = scanner.nextLine();
                check = KiemTra.setEmail(email);
                if (check) {
                    break;
                } else {
                    System.out.println("Nhập sai.Nhập lại:");
                }
            } while (true);
            danhBaList.get(num).setNhomDanhBa(nhom);
            danhBaList.get(num).setHoVaTen(ten);
            danhBaList.get(num).setGioiTinh(gioiTinh);
            danhBaList.get(num).setDiaChi(diaChi);
            danhBaList.get(num).setNgaySinh(ngaySinh);
            danhBaList.get(num).setEmail(email);
        }
        for (DanhBa danhBa : danhBaList) {
            System.out.println(danhBa.toString());
        }
        writeFileIndex0(DocGhiFile.DANHBA_FILE);
        for (int i = 1; i < danhBaList.size(); i++) {
            writeFile(i, DocGhiFile.DANHBA_FILE);
        }
        danhBaList.clear();
    }
}
