package patterns.decorator;

public class BackendDev implements Developer {

    @Override
    public void mySkills() {
        System.out.println("\tCreating backend service using Java");
    }
}