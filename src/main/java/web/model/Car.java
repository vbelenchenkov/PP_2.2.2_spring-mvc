package web.model;

public class Car {
    private String model;
    private int produced;
    private String driver;

    public Car(String model, int produced, String driver) {
        this.model = model;
        this.produced = produced;
        this.driver = driver;
    }

    public String getModel() {
        return model;
    }

    public int getProduced() {
        return produced;
    }

    public String getDriver() {
        return driver;
    }
}
