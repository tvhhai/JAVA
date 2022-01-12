package patterns.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Car car = null;
        car = ManufacturerProducer.getManufacturer(1).getFactory("Vfe34").make();
        System.out.println(car);

        car = ManufacturerProducer.getManufacturer(1).getFactory("Vfe35").make();
        System.out.println(car);

        car = ManufacturerProducer.getManufacturer(2).getFactory("Camry").make();
        System.out.println(car);

        car = ManufacturerProducer.getManufacturer(2).getFactory("Vios").make();
        System.out.println(car);
    }
}
