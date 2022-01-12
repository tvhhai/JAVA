package patterns.proxy;

public class ProxyDemo {

    public static void main(String[] args) {
        Worker proxyWorker = new ProxyWorker("Building website");
        //proxy worker handle for client
        proxyWorker.handleTask();
    }
}