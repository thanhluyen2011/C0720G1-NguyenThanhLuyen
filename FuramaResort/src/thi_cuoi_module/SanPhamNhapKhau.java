package thi_cuoi_module;

public class SanPhamNhapKhau extends SanPham {
    String giaNhapKhau;
    String tinhThanhNhapKhau;
    String thueNhapKhau;

    public SanPhamNhapKhau(String giaNhapKhau, String tinhThanhNhapKhau, String thueNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhapKhau = tinhThanhNhapKhau;
        this.thueNhapKhau = thueNhapKhau;
    }

    public SanPhamNhapKhau(String id, String maSanPham, String tenSanPham, String giaBan, String soLuong, String nhaSanXuat, String giaNhapKhau, String tinhThanhNhapKhau, String thueNhapKhau) {
        super(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhapKhau = tinhThanhNhapKhau;
        this.thueNhapKhau = thueNhapKhau;
    }

    public String getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(String giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhThanhNhapKhau() {
        return tinhThanhNhapKhau;
    }

    public void setTinhThanhNhapKhau(String tinhThanhNhapKhau) {
        this.tinhThanhNhapKhau = tinhThanhNhapKhau;
    }

    public String getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(String thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return "SanPhamNhapKhau{" +
                "giaNhapKhau='" + giaNhapKhau + '\'' +
                ", tinhThanhNhapKhau='" + tinhThanhNhapKhau + '\'' +
                ", thueNhapKhau='" + thueNhapKhau + '\'' +
                ", id='" + id + '\'' +
                ", maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaBan='" + giaBan + '\'' +
                ", soLuong='" + soLuong + '\'' +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }

    @Override
    public void hienThiThongTin() {
        System.out.println(this.toString());;
    }
}
