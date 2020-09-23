package _11_stack_and_squeue.bai_tap;


import java.util.Scanner;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String[] inputArray = scanner.nextLine().split(" ");
        TreeMap<String, Integer> myMap = new TreeMap<String, Integer>();
        for(int index = 0; index < inputArray.length; index++){
            String key = inputArray[index].toLowerCase();
            if(inputArray[index].length() > 1) {
                if(myMap.get(key) == null) {
                    myMap.put(key, 1);
                }
                else {
                    myMap.put(key, (myMap.get(key))+1);
                }
            }
        }
//        myMap.forEach((keyString, valueInteger)-> System.out.println(keyString +valueInteger));
        for(String entry : myMap.keySet()) {
            System.out.println(entry + " : "+ myMap.get(entry));
        }
    }
}
