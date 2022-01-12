package patterns.abstractfactory;

public interface IManufacturer {
     String name = null;
    public CarFactory getFactory(String model) ;
}
