package _12_java_collection_framework.bai_tap;

import java.util.Comparator;

public class DescendingOrder implements Comparator<Product> {
    @Override
    public int compare(Product t1, Product t2) {
        double res = t1.getPrice()-t2.getPrice();
        if (res>0){
            return -1;
        }else if (res<0){
            return 1;
        }
        return 0;
    }

}
