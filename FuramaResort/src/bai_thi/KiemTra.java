package bai_thi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KiemTra {
    public static final String EMAIL = "^\\w{3,}@[a-zA-Z]{3,5}\\.[a-zA-Z]{2,3}$";
    public static final String SDT = "^\\d{10,11}$";
    public static boolean setEmail(String email){
        Pattern pattern = Pattern.compile(EMAIL);
        Matcher matcher = pattern.matcher(email);
        boolean check = matcher.matches();
        return check;
    }
    public static boolean setSdt(String sdt){
        Pattern pattern = Pattern.compile(SDT);
        Matcher matcher = pattern.matcher(sdt);
        boolean check = matcher.matches();
        return check;
    }
}
