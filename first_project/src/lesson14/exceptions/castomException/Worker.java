package lesson14.exceptions.castomException;

public class Worker {

    private String name;
    private boolean isReadyToWork;

    public Worker(String name) {
        this.name = name;
    }

    public void readyToWork(){
        isReadyToWork = true;
    }

    public void onVacation(){
        isReadyToWork = false;
    }

    public void goToWork() throws WorkerIsNotReadyException{
        if (isReadyToWork){
            System.out.println("The worker +  " + name + " is ready to work");
        }
        else{
            throw new WorkerIsNotReadyException("Worker " + name + " on vacation and not ready to work");
        }

    }
}
