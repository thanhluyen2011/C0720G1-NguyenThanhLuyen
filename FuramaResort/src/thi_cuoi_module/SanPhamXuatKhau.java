package thi_cuoi_module;

public class SanPhamXuatKhau extends SanPham {
    String giaXuatKhau;
    String quocGiaNhap;

    public SanPhamXuatKhau(String giaXuatKhau, String quocGiaNhap) {
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhap = quocGiaNhap;
    }

    public SanPhamXuatKhau(String id, String maSanPham, String tenSanPham, String giaBan, String soLuong, String nhaSanXuat, String giaXuatKhau, String quocGiaNhap) {
        super(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhap = quocGiaNhap;
    }

    public String getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(String giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhap() {
        return quocGiaNhap;
    }

    public void setQuocGiaNhap(String quocGiaNhap) {
        this.quocGiaNhap = quocGiaNhap;
    }

    @Override
    public String toString() {
        return "SanPhamXuatKhau{" +
                "giaXuatKhau='" + giaXuatKhau + '\'' +
                ", quocGiaNhap='" + quocGiaNhap + '\'' +
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
