package patterns.decorator;

public class FrontendDev implements Developer {

    @Override
    public void mySkills() {
        System.out.println("\tCreating website using ReactJS");
    }
}