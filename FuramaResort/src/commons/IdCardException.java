package commons;

public class IdCardException extends Exception {
    public IdCardException(){
        super("Id hoa hoặc in thường vẫn chấp nhận nhưng phải chuẩn hóa dữ liệu đúng trước khi lưu");
    }
}
