package patterns.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        VinFast vinfast = new VinFast();

        CarFactory vfe34Factory = vinfast.getFactory("Vfe34");
        vfe34Factory.make();

        CarFactory vfe35Factory = vinfast.getFactory("Vfe35");
        vfe35Factory.make();
    }
}
