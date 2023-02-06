package lesson14.exceptions;

import lesson14.exceptions.castomException.WorkerIsNotReadyException;

public class Exceptions_07_MethodsOfExceptions {
    public static void main(String[] args) {
        int[] array = new int[5];
        try {
            array[57] = 57;

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
