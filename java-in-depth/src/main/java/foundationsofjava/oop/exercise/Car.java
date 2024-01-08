package foundationsofjava.oop.exercise;

public class Car extends MotorVehicle {
    private String brand;

    public Car(int wheels, String material, int speed, String engine, String brand) {
        super(wheels, material, speed, engine);
        this.brand = brand;
    }

    @Override
    public String toString(){
        return "Car goes brrr!";
    }
}
