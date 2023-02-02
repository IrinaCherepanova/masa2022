package lesson14.exceptions.castomException;

public class Factory {
    public static void main(String[] args) {
        Worker worker = new Worker("Irina");
        worker.onVacation();
        try {
            worker.goToWork();
        }
        catch (WorkerIsNotReadyException e){
            e.getMessage();
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
        }
    }
}
