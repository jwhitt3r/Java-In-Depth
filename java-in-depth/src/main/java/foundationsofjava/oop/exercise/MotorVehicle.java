package foundationsofjava.oop.exercise;

public class MotorVehicle extends Vehicle {
    private String engine;
    public MotorVehicle(int wheels, String material, int speed, String engine) {
        super(wheels, material, speed);
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "MotorVehicle{" +
                "engine='" + engine + '\'' +
                "} " + super.toString();
    }
}
