package patterns.abstractfactory;


public class Vfe34Factory implements CarFactory {

    @Override
    public Car make() {
        return new Car("Vfe34", 2020);
    }
}
