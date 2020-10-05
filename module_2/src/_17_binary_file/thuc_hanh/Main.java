package _17_binary_file.thuc_hanh;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest)throws IOException {
        Files.copy(source.toPath(),dest.toPath(),StandardCopyOption.REPLACE_EXISTING);

    }
    private static void copyFileUsingStream(File source, File dest)throws IOException{
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int lenght;
            while ((lenght = is.read(buffer)) > 0){
                os.write(buffer,0,lenght);
            }
        }finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp file nguồn :");
        String source = sc.nextLine();
        System.out.println("Nhập nơi đến");
        String destination = sc.nextLine();
        File sourceFile = new File(source);
        File destinationFile = new File(destination);
        try {
            copyFileUsingJava7Files(sourceFile,destinationFile);
            System.out.println("coppy thành công");
        }catch (IOException ioe){
            System.out.println("Không thể coppy");
            System.out.println(ioe.getMessage());
        }
    }
}
