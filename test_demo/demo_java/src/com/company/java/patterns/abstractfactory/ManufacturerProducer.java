package patterns.abstractfactory;

public class ManufacturerProducer {
    public static Manufacturer getManufacturer(int code){
        Manufacturer manufacturer = null;
        switch (code) {
            case 1:
                manufacturer = new VinFast();
                break;
            case 2:
                manufacturer = new Toyota();
                break;
        }
        return manufacturer;
    }
}