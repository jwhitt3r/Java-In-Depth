package foundationsofjava.oop.exercise;

public class Vehicle {
    private int wheels;
    private String material;
    private int speed;

    public Vehicle(int wheels, String material, int speed) {
        this.wheels = wheels;
        this.material = material;
        this.speed = speed;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", material='" + material + '\'' +
                ", speed=" + speed +
                '}';
    }
}
