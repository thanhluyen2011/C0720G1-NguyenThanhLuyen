package thi_cuoi_module;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HienThi {
    public static List<SanPhamXuatKhau> sanPhamXuatKhaus = new ArrayList<>();
    public static List<String> listLine = new ArrayList<>();
    public static List<SanPhamNhapKhau> sanPhamNhapKhaus = new ArrayList<>();
    public static final String COMA = ",";
    public static final String SANPHAMXUATKHAU = "D:\\C0720G1-NguyenThanhLuyen\\FuramaResort\\src\\thi_cuoi_module\\sanphamxuatkhau.csv";
    public static final String SANPHAMNHAPKHAU = "D:\\C0720G1-NguyenThanhLuyen\\FuramaResort\\src\\thi_cuoi_module\\sanphamnhapkhau.csv";
    public static int sr = 0;
    public static void thucDon() {
        String luaChon;
        do {
            System.out.println("1. Them moi.");
            System.out.println("2. Xoa.");
            System.out.println("3. Xem danh sach.");
            System.out.println("4. Tim kiem .");
            System.out.println("5. Thoat.");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = scanner.nextLine();

            switch (luaChon) {
                case "1":
                    them();
                    break;
                case "2":
                    xoa();
                    break;
                case "3":
                    xem();
                    break;
                case "4":
                    timKiem();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    thucDon();
            }
        } while (Integer.parseInt(luaChon) > 0 && Integer.parseInt(luaChon) < 7);
    }
    public static void timKiem(){
        System.out.println("1.Tìm nhập khẩu \n" +
                "2.Tìm xuất khẩu");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        switch (num){
            case "1":
                try {
                    FileReader fileReader = new FileReader(SANPHAMNHAPKHAU);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String line;
                    String[] temp;
                    SanPhamNhapKhau sanPhamNhapKhau;
                    while ((line = bufferedReader.readLine()) != null) {
                        temp = line.split(",");
                        sanPhamNhapKhau = new SanPhamNhapKhau(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6],temp[7],temp[8]);
                        sanPhamNhapKhaus.add(sanPhamNhapKhau);
                    }
                    System.out.println("nhập id cần tim kiếm: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    int d = 0;
                    boolean check = false;
                    for (int i = 0; i < sanPhamNhapKhaus.size(); i++) {
                        if (id == Integer.parseInt(sanPhamNhapKhaus.get(i).getId())) {
                            check = true;
                            d = i;
                            break;
                        }
                    }
                    if (!check) {
                        System.out.println("không tìm thấy");
                    } else {
                        System.out.println(sanPhamNhapKhaus.get(d).toString());
                    }
                    sanPhamNhapKhaus.clear();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "2" :{
                try {
                    FileReader fileReader = new FileReader(SANPHAMXUATKHAU);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String line;
                    String[] temp;
                    SanPhamXuatKhau sanphamxuatkhau;
                    while ((line = bufferedReader.readLine()) != null) {
                        temp = line.split(",");
                        sanphamxuatkhau = new SanPhamXuatKhau(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6],temp[7]);
                        sanPhamXuatKhaus.add(sanphamxuatkhau);
                    }
                    System.out.println("nhập id cần tim kiếm: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    int d = 0;
                    boolean check = false;
                    for (int i = 0; i < sanPhamXuatKhaus.size(); i++) {
                        if (id == Integer.parseInt(sanPhamXuatKhaus.get(i).getId())) {
                            check = true;
                            d = i;
                            break;
                        }
                    }
                    if (!check) {
                        System.out.println("không tìm thấy");
                    } else {
                        System.out.println(sanPhamXuatKhaus.get(d).toString());
                    }
                    sanPhamXuatKhaus.clear();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }

        }
    }
    public static void xem(){
        System.out.println("1.Xem nhập khẩu" +
                "2.\n Xem xuất khẩu");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        switch (num){
            case "1" :
                try {
                    FileReader fileReader = new FileReader(SANPHAMNHAPKHAU);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String line;
                    String[] temp;
                    SanPhamNhapKhau sanPhamNhapKhau;
                    while ((line = bufferedReader.readLine()) != null) {
                        temp = line.split(",");
                        sanPhamNhapKhau = new SanPhamNhapKhau(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6],temp[7],temp[8]);
                        sanPhamNhapKhaus.add(sanPhamNhapKhau);
                    }
                    for (SanPhamNhapKhau sanPhamNhapKhau1 : sanPhamNhapKhaus){
                       sanPhamNhapKhau1.hienThiThongTin();
                    }
                    sanPhamNhapKhaus.clear();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "2" :
                try {
                    FileReader fileReader = new FileReader(SANPHAMXUATKHAU);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String line;
                    String[] temp;
                    SanPhamXuatKhau sanPhamXuatKhau;
                    while ((line = bufferedReader.readLine()) != null) {
                        temp = line.split(",");
                        sanPhamXuatKhau = new SanPhamXuatKhau(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6],temp[7]);
                        sanPhamXuatKhaus.add(sanPhamXuatKhau);
                    }
                    for (SanPhamXuatKhau sanPhamXuatKhau1 : sanPhamXuatKhaus){
                        sanPhamXuatKhau1.hienThiThongTin();
                    }
                    sanPhamXuatKhaus.clear();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
    public static void writeFileIndex0(String file) {
        String line = sanPhamNhapKhaus.get(0).getId() + "," + sanPhamNhapKhaus.get(0).getMaSanPham() + "," + sanPhamNhapKhaus.get(0).getTenSanPham() + "," +
                sanPhamNhapKhaus.get(0).getGiaBan() + "," + sanPhamNhapKhaus.get(0).getSoLuong() + "," + sanPhamNhapKhaus.get(0).getNhaSanXuat()
                + "," + sanPhamNhapKhaus.get(0).getGiaNhapKhau() + "," + sanPhamNhapKhaus.get(0).getTinhThanhNhapKhau() + "," + sanPhamNhapKhaus.get(0).getThueNhapKhau();
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
    public static void writeFileIndex1(String file) {
        String line = sanPhamXuatKhaus.get(0).getId() + "," + sanPhamXuatKhaus.get(0).getMaSanPham() + "," + sanPhamXuatKhaus.get(0).getTenSanPham() + "," +
                sanPhamXuatKhaus.get(0).getGiaBan() + "," + sanPhamXuatKhaus.get(0).getSoLuong() + "," + sanPhamXuatKhaus.get(0).getNhaSanXuat()
                + "," + sanPhamXuatKhaus.get(0).getGiaXuatKhau() + "," + sanPhamXuatKhaus.get(0).getQuocGiaNhap();
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
    public static void xoa(){
        System.out.println("1.Xóa sản phẩm nhập khâu \n" +
                "2.xóa sản phẩm xuất khẩu");
        Scanner scanner = new Scanner(System.in);
        String so = scanner.nextLine();
        switch (so){
            case "1":
                try {
                FileReader fileReader = new FileReader(SANPHAMNHAPKHAU);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                String[] temp;
                SanPhamNhapKhau sanPhamNhapKhau;
                while ((line = bufferedReader.readLine()) != null) {
                    temp = line.split(",");
                    sanPhamNhapKhau = new SanPhamNhapKhau(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6],temp[7],temp[8]);
                    sanPhamNhapKhaus.add(sanPhamNhapKhau);
                }
                bufferedReader.close();
                    System.out.println("nhập id cần xóa: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    int d = 0;
                    boolean check = false;
                    for (int i = 0; i < sanPhamNhapKhaus.size(); i++) {
                        if (id == Integer.parseInt(sanPhamNhapKhaus.get(i).getId())) {
                            check = true;
                            d = i;
                            break;
                        }
                    }
                    if (!check) {
                        System.out.println("không tìm thấy");
                    }else {
                        sanPhamNhapKhaus.remove(d);
                        writeFileIndex0(SANPHAMNHAPKHAU);
                        for (int i = 1; i < sanPhamNhapKhaus.size(); i++) {
                            try {
                                FileWriter fileWriter = new FileWriter(SANPHAMNHAPKHAU,true);
                                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                                bufferedWriter.write(line);
                                bufferedWriter.newLine();
                                bufferedWriter.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    sanPhamNhapKhaus.clear();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
                break;
            case "2" :
                try {
                    FileReader fileReader = new FileReader(SANPHAMXUATKHAU);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String line;
                    String[] temp;
                    SanPhamXuatKhau sanPhamXuatKhau;
                    while ((line = bufferedReader.readLine()) != null) {
                        temp = line.split(",");
                        sanPhamXuatKhau = new SanPhamXuatKhau(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6],temp[7]);
                        sanPhamXuatKhaus.add(sanPhamXuatKhau);
                    }
                    bufferedReader.close();
                    System.out.println("nhập id cần xóa: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    int d = 0;
                    boolean check = false;
                    for (int i = 0; i < sanPhamXuatKhaus.size(); i++) {
                        if (id == Integer.parseInt(sanPhamXuatKhaus.get(i).getId())) {
                            check = true;
                            d = i;
                            break;
                        }
                    }
                    if (!check) {
                        System.out.println("không tìm thấy");
                    }else {
                        sanPhamXuatKhaus.remove(d);
                        writeFileIndex1(SANPHAMXUATKHAU);
                        for (int i = 1; i < sanPhamXuatKhaus.size(); i++) {
                            try {
                                FileWriter fileWriter = new FileWriter(SANPHAMXUATKHAU,true);
                                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                                bufferedWriter.write(line);
                                bufferedWriter.newLine();
                                bufferedWriter.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    sanPhamNhapKhaus.clear();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
    public static List<String> read(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                listLine.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }
    public static void them(){
        Scanner scanner = new Scanner(System.in);
        String id = null;
        String maSanPham;
        String tenSanPham;
        String giaBan;
        String soLuong;
        String nhaSanXuat;
        String giaXuatKhau;
        String quocGiaNhap;
        String giaNhapKhau;
        String tinhThanhNhapKhau;
        String thueNhapKhau;
        System.out.println("Nhập thông tin sản phẩm");
        try {
            System.out.println("Nhập mã sản phẩm");
            maSanPham = scanner.nextLine();
            System.out.println("Nhập tên sản phẩm");
            tenSanPham = scanner.nextLine();
            System.out.println("Nhập giá bán");
            do {
                giaBan = scanner.nextLine();
                boolean check = KiemTra.giaVaThue(giaBan);
                if (check){
                    break;
                }else {
                    System.out.println("Nhập lại");
                }
            }while (true);
            System.out.println("Nhập số lượng");
            do {
                soLuong = scanner.nextLine();
                boolean check = KiemTra.giaVaThue(soLuong);
                if (check){
                    break;
                }else {
                    System.out.println("Nhập lại");
                }
            }while (true);
            System.out.println("Nhập nhà sản xuất");
            nhaSanXuat = scanner.nextLine();
            System.out.println("1.thêm mới sản phẩm xuất khẩu\n" +
                    "2.thêm mới sản phẩm nhập khẩu");
            String choose = scanner.nextLine();
            switch (choose){
                case "1":
                    id = String.valueOf(sr+1);
                    System.out.println("Nhập giá xuất khẩu");
                    do {
                        giaXuatKhau = scanner.nextLine();
                        boolean check = KiemTra.giaVaThue(giaXuatKhau);
                        if (check){
                            break;
                        }else {
                            System.out.println("Nhập lại");
                        }
                    }while (true);
                    System.out.println("Nhập quốc gia nhập sản phẩm");
                    quocGiaNhap = scanner.nextLine();
                    SanPhamXuatKhau sanPhamXuatKhau = new SanPhamXuatKhau(id,maSanPham,tenSanPham,giaBan,soLuong,nhaSanXuat,giaXuatKhau,quocGiaNhap);
                    String line = sanPhamXuatKhau.getId() + COMA +
                            sanPhamXuatKhau.getMaSanPham() + COMA +
                            sanPhamXuatKhau.getTenSanPham() + COMA +
                            sanPhamXuatKhau.getGiaBan() + COMA +
                            sanPhamXuatKhau.getSoLuong() + COMA +
                            sanPhamXuatKhau.getNhaSanXuat() + COMA +
                            sanPhamXuatKhau.getGiaXuatKhau() + COMA +
                            sanPhamXuatKhau.getQuocGiaNhap();
                    try {
                        FileWriter fileWriter = new FileWriter(SANPHAMXUATKHAU,true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        bufferedWriter.write(line);
                        bufferedWriter.newLine();
                        bufferedWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thêm thành công");
                    break;
                case "2" :
                    id = String.valueOf(sr++);
                    System.out.println("Nhập giá nhập khẩu");
                    do {
                        giaNhapKhau = scanner.nextLine();
                        boolean check = KiemTra.giaVaThue(giaNhapKhau);
                        if (check){
                            break;
                        }else {
                            System.out.println("Nhập lại");
                        }
                    }while (true);
                    System.out.println("Nhập tỉnh thành nhập");
                    tinhThanhNhapKhau = scanner.nextLine();
                    System.out.println("Nhập thuế nhập khẩu");
                    do {
                        thueNhapKhau = scanner.nextLine();
                        boolean check = KiemTra.giaVaThue(thueNhapKhau);
                        if (check){
                            break;
                        }else {
                            System.out.println("Nhập lại");
                        }
                    }while (true);
                    SanPhamNhapKhau sanphamnhapkhau = new SanPhamNhapKhau(id,maSanPham,tenSanPham,giaBan,soLuong,nhaSanXuat,giaNhapKhau,tinhThanhNhapKhau,thueNhapKhau);
                    String line1 = sanphamnhapkhau.getId() + COMA +
                            sanphamnhapkhau.getMaSanPham() + COMA +
                            sanphamnhapkhau.getTenSanPham() + COMA +
                            sanphamnhapkhau.getGiaBan() + COMA +
                            sanphamnhapkhau.getSoLuong() + COMA +
                            sanphamnhapkhau.getNhaSanXuat() + COMA +
                            sanphamnhapkhau.getGiaNhapKhau() + COMA +
                            sanphamnhapkhau.getTinhThanhNhapKhau() + COMA +
                            sanphamnhapkhau.getThueNhapKhau();
                    try {
                        FileWriter fileWriter = new FileWriter(SANPHAMNHAPKHAU,true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        bufferedWriter.write(line1);
                        bufferedWriter.newLine();
                        bufferedWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thêm thành công");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        thucDon();
    }
}
