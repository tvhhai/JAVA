package patterns.abstractfactory;


public abstract class Manufacturer {
    protected String name;
    abstract CarFactory getFactory(String model) ;
}