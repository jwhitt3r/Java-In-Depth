package foundationsofjava.oop.exercise;

public class PedalVehicle extends Vehicle {
    private int numberOfPedals;

    public PedalVehicle(int wheels, String material, int speed, int numberOfPedals) {
        super(wheels, material, speed);
        this.numberOfPedals = numberOfPedals;
    }

    @Override
    public String toString() {
        return "PedalVehicle{" +
                "numberOfPedals=" + numberOfPedals +
                "} " + super.toString();
    }

    public int getNumberOfPedals() {
        return numberOfPedals;
    }

    public void setNumberOfPedals(int numberOfPedals) {
        this.numberOfPedals = numberOfPedals;
    }
}
