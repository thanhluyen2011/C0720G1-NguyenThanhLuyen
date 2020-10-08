package commons;

public class GenderException extends Exception {
    public GenderException(){
        super("nhập vào Male, Female hoặc Unknow");
    }
}
