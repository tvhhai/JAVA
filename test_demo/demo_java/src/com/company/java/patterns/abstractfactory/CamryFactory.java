package patterns.abstractfactory;


public class CamryFactory implements CarFactory {

    @Override
    public Car make() {
        return new Car("Camry", 2020);
    }
}
