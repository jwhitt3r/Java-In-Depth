package foundationsofjava.oop.exercise;

public class BicycleWithSideCar extends PedalVehicle {
    private Car sideCar;
    private Bicycle bike;
    /*
    This example illustrates composition
     */
    public BicycleWithSideCar(Car car, Bicycle bike) {
        super(bike.getWheels(), bike.getMaterial(), bike.getSpeed(), bike.getNumberOfPedals());
        this.sideCar = car;
        this.bike = bike;
    }
}
