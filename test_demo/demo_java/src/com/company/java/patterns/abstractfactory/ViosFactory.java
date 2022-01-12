package patterns.abstractfactory;


public class ViosFactory implements CarFactory {

    @Override
    public Car make() {
        return new Car("Vios", 2020);
    }
}
