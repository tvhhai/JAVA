package patterns.abstractfactory;

public class VinFast extends Manufacturer {
    public CarFactory getFactory(String carModel){
        CarFactory factory = null;
        switch (carModel) {
            case "Vfe34":
                factory = new Vfe34Factory();
                break;
            case "Vfe35":
                factory = new Vfe35Factory();
                break;
        }
        return factory;
    }
}