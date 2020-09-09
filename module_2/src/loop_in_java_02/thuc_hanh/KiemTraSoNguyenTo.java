package loop_in_java_02.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số : ");
        int number = sc.nextInt();
        if (number < 2){
            System.out.println(number + " không phải số nguyên tố");
        }else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number + " là số nguyên tố");
            }else {
                System.out.println(number + " không phải là số nguyên tố");
            }
        }
    }
}
