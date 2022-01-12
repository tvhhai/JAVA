package patterns.abstractfactory;

public class Car {

    private  String model;
    private int yearMade ;

    public Car(String model, int yearMade) {
        this.model = model;
        this.yearMade = yearMade;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    @Override
    public String toString() {
        return "Car = " + "model:'" + model + '\'' + ", yearMade:" + yearMade ;
    }
}
