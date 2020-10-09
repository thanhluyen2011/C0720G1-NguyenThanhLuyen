package controllers;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FileUtils {
    public static void writeFile(String line, String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // read file:
//    public static void readObject(String fileName) {
//        List<String> listStr = new ArrayList<>();
//        try {
//            FileReader fileReader = new FileReader(fileName);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line = null;
//            while ((line = bufferedReader.readLine()) != null) {
//                listStr.add(line);
//            }
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
    public static void read(String fileName) {
        List<String> listStr = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                listStr.add(line);
            }
            Collections.sort(listStr);
            Iterator itr = listStr.iterator();
            int i = 0;
            while (itr.hasNext()) {
                System.out.println((i + 1) + " : " + itr.next());
                i++;
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
