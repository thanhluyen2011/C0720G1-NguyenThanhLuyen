package thi_cuoi_module;

import java.util.ArrayList;

public class KiemTra {
    public static boolean giaVaThue (String gia){
        boolean check = false;
        if (Integer.parseInt(gia) <= 0){
            check = false;
        }else {
            check = true;
        }
        return check;
    }
}
