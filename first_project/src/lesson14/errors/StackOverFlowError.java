package lesson14.errors;

public class StackOverFlowError {

    public static void main(String[] args) {
        calculate(10);
    }

    public static int calculate(int number){
        return number * calculate(number-1);
    }
}
