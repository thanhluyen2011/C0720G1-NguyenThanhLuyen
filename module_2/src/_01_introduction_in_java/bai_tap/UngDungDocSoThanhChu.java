package introduction_in_java_01.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhấp số để đọc thành chữ");
        int number = sc.nextInt();
        String read;
        String read1;
        String read2;
        int result = number % 10;
        int result1 = number/10;
        int result2 = number/100;
        if (number < 0){
            System.out.print("Bạn nên nhập số nguyên dương");
        }else if (number < 10){
            switch (number){
                case 0 :
                    read = "Zero";
                    break;
                case 1 :
                    read = "One";
                    break;
                case 2 :
                    read = "Two";
                    break;
                case 3 :
                    read = "Three";
                    break;
                case 4 :
                    read = "Four";
                    break;
                case 5 :
                    read = "Five";
                    break;
                case 6 :
                    read = "Six";
                    break;
                case 7 :
                    read = "Seven";
                    break;
                case 8 :
                    read = "Eight";
                    break;
                case 9 :
                    read = "Nine";
                    break;
                default:
                    read = "";
            }
            if (read != ""){
                System.out.printf("Số '%d' đọc là %s !", number, read);
            }else {
                System.out.print("Số vừa nhập lớn hơn 1 chữ số");
            }
        }else if (number < 20){
            switch (number){
                case 10 :
                    read = "Ten";
                    break;
                case 11 :
                    read = "Eleven";
                    break;
                case 12 :
                    read = "twelve";
                    break;
                case 13 :
                    read = "thirteen";
                    break;
                case 14 :
                    read = "fourteen";
                    break;
                case 15 :
                    read = "fifteen";
                    break;
                case 16 :
                    read = "sixteen";
                    break;
                case 17 :
                    read = "seventeen";
                    break;
                case 18 :
                    read = "eighteen";
                    break;
                case 19 :
                    read = "nineteen";
                    break;
                default:
                    read = "";
            }
            if (read != ""){
                System.out.printf("Số '%d' đọc là %s !", number, read);
            }else {
                System.out.print("Số vừa nhập lớn hơn 2 chữ số");
            }
        }else if (number < 100){
            switch (result){
                case 1 :
                    read = "one";
                    break;
                case 2 :
                    read = "two";
                    break;
                case 3 :
                    read = "three";
                    break;
                case 4 :
                    read = "four";
                    break;
                case 5 :
                    read = "five";
                    break;
                case 6 :
                    read = "six";
                    break;
                case 7 :
                    read = "seven";
                    break;
                case 8 :
                    read = "eight";
                    break;
                case 9 :
                    read = "nine";
                    break;
                default:
                    read = "";
            }
            switch (result1) {
                case 2:
                    read1 = "twenty";
                    break;
                case 3:
                    read1 = "thirty";
                    break;
                case 4:
                    read1 = "forty";
                    break;
                case 5:
                    read1 = "fifty";
                    break;
                case 6:
                    read1 = "sixty";
                    break;
                case 7:
                    read1 = "seventy";
                    break;
                case 8:
                    read1 = "eighty";
                    break;
                case 9:
                    read1 = "ninety";
                    break;
                default:
                    read1 = "";
            }
            System.out.println(read1 + ' ' + read);
            //            System.out.print(readten);
//            System.out.print(readty);
        }else if (number < 1000){
            switch (result2) {
                case 1:
                    read2 = "one hundred";
                    break;
                case 2:
                    read2 = "two hundred";
                    break;
                case 3:
                    read2 = "three hundred";
                    break;
                case 4:
                    read2 = "four hundred";
                    break;
                case 5:
                    read2 = "five hundred";
                    break;
                case 6:
                    read2 = "six hundred";
                    break;
                case 7:
                    read2 = "seven hundred";
                    break;
                case 8:
                    read2 = "eight hundred";
                    break;
                case 9:
                    read2 = "nine hundred";
                    break;
                default:
                    read2 = "";
            }
            int dozen = number %100;
            if (dozen < 20){
                switch (dozen){
                    case 1 :
                        read1 = "one";
                        break;
                    case 2 :
                        read1 = "two";
                        break;
                    case 3 :
                        read1 = "three";
                        break;
                    case 4 :
                        read1 = "four";
                        break;
                    case 5 :
                        read1 = "five";
                        break;
                    case 6 :
                        read1 = "six";
                        break;
                    case 7 :
                        read1 = "seven";
                        break;
                    case 8 :
                        read1 = "eight";
                        break;
                    case 9 :
                        read1 = "nine";
                        break;
                    case 10 :
                        read1 = "Ten";
                        break;
                    case 11 :
                        read1 = "Eleven";
                        break;
                    case 12 :
                        read1 = "twelve";
                        break;
                    case 13 :
                        read1 = "thirteen";
                        break;
                    case 14 :
                        read1 = "fourteen";
                        break;
                    case 15 :
                        read1 = "fifteen";
                        break;
                    case 16 :
                        read1 = "sixteen";
                        break;
                    case 17 :
                        read1 = "seventeen";
                        break;
                    case 18 :
                        read1 = "eighteen";
                        break;
                    case 19 :
                        read1 = "nineteen";
                        break;
                    default:
                        read1 = "";
                }
                read = "";
            }else {
                int unit = dozen % 10;
                int unit1 = dozen / 10;
                switch (unit){
                    case 1 :
                        read = "one";
                        break;
                    case 2 :
                        read = "two";
                        break;
                    case 3 :
                        read = "three";
                        break;
                    case 4 :
                        read = "four";
                        break;
                    case 5 :
                        read = "five";
                        break;
                    case 6 :
                        read = "six";
                        break;
                    case 7 :
                        read = "seven";
                        break;
                    case 8 :
                        read = "eight";
                        break;
                    case 9 :
                        read = "nine";
                        break;
                    default:
                        read = "";
                }
                switch (unit1) {
                    case 2:
                        read1 = "twenty";
                        break;
                    case 3:
                        read1 = "thirty";
                        break;
                    case 4:
                        read1 = "forty";
                        break;
                    case 5:
                        read1 = "fifty";
                        break;
                    case 6:
                        read1 = "sixty";
                        break;
                    case 7:
                        read1 = "seventy";
                        break;
                    case 8:
                        read1 = "eighty";
                        break;
                    case 9:
                        read1 = "ninety";
                        break;
                    default:
                        read1 = "";
                }
            }
            System.out.println( read2 + ' ' + read1 + ' ' + read);
        }
    }
}
