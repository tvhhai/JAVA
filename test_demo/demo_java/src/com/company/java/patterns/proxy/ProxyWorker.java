package patterns.proxy;


public class ProxyWorker implements Worker {

    private String taskName;
    private RealWorker realWorker;

    public ProxyWorker(String taskName){
        System.out.println("Proxy worker is assigned with task: " + taskName);
        this.taskName = taskName;
    }

    @Override
    public void handleTask() {
        if(realWorker == null){
            realWorker = new RealWorker(taskName);
        }
        realWorker.handleTask();
    }
}
