package lesson7.methods;

import java.util.Date;

public class Methods_03_ReturnWithoutParams {
    public static void main(String[] args) {

        System.out.println(getRandomNumber());
    }

    public static long getRandomNumber(){
        Date date = new Date();
        long currentDate = date.getTime();
        return currentDate;
    }

}
