package lesson6.collections;

import java.util.ArrayList;
import java.util.Random;

public class CustomerArrayList {
    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Double> myArrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            myArrayList.add(random.nextDouble()*100);
            System.out.println(myArrayList.get(i));
        }

        System.out.println();
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;

        for (double element: myArrayList) {
            if (element > max){
                max = element;
            }
            if (element < min){
                min = element;
            }
            sum += element;
            if (element %2 != 0){
                System.out.println("нечетное " + element);
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
        System.out.println("average =" + (sum/myArrayList.size()));

    }
}
