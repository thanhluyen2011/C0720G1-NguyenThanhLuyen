package _16_text_file.bai_tap;

import java.io.*;

public class CoppyFile {
    private static String PATH_FILE_1 = "D:\\C0720G1-NguyenThanhLuyen\\module_2\\src\\_16_text_file\\bai_tap\\text";
    private static String PATH_FILE_2 = "D:\\C0720G1-NguyenThanhLuyen\\module_2\\src\\_16_text_file\\bai_tap\\text2";

    public static void main(String[] args) {
        copyFileOfCSV();
    }

    private static void copyFileOfCSV() {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(new File(PATH_FILE_1));
            outputStream = new FileOutputStream(new File(PATH_FILE_2));
            int length;
            byte[] buffer = new byte[1024];
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful! ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
