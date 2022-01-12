package patterns.abstractfactory;

public class Vfe35Factory implements CarFactory {

    @Override
    public Car make() {
        return new Car("Vfe35", 2020);
    }
}
