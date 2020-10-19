package bai_thi;

import models.House;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    public static final String DANHBA_FILE = "D:\\C0720G1-NguyenThanhLuyen\\FuramaResort\\src\\bai_thi\\danhba.csv";
    public static void doc(){
        List<DanhBa> list = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(DANHBA_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            DanhBa danhBa;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                danhBa = new DanhBa(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6]);
                list.add(danhBa);
            }
            for (DanhBa danhBa1 : list) {
                System.out.println(danhBa1.toString());
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void ghi(String line){
        try {
            FileWriter fileWriter = new FileWriter(DANHBA_FILE, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
