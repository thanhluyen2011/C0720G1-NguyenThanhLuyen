package _19_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    public static void main(String[] args) {
        final String REGEX = "^\\(\\d{2}\\)[-]\\([0]\\d{9}\\)$";
//        final String REGEX ="^[(]{1}\\d{2}[)]{1}[-]{1}[(]{1}[0]{1}\\d{9}[)]{1}$"; Cường
//        final String REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$"; Nguyễn Khoa
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile(REGEX);
        while (true){
            System.out.println("Enter");
            String string = sc.nextLine();
            Matcher matcher = pattern.matcher(string);
            if (matcher.find()){
                System.out.println("True");
                break;
            }else {
                System.out.println("False");
            }
        }

    }
}
