package patterns.proxy;

public class RealWorker implements Worker {

    private String taskName;

    public RealWorker(String taskName){
        System.out.println("Real worker is assigned with task: " + taskName);
        this.taskName = taskName;
    }

    @Override
    public void handleTask() {
        System.out.println("Real worker handle: " + taskName);
    }
}