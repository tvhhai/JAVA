package patterns.abstractfactory;

public class Toyota extends Manufacturer {
    public CarFactory getFactory(String carModel){
        CarFactory factory = null;
        switch (carModel) {
            case "Camry":
                factory = new CamryFactory();
                break;
            case "Vios":
                factory = new ViosFactory();
                break;
        }
        return factory;
    }
}