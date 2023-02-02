package lesson14.exceptions.castomException;

public class WorkerIsNotReadyException extends Exception{

    public WorkerIsNotReadyException() {
    }

    public WorkerIsNotReadyException(String message) {
        super(message);
    }
}
