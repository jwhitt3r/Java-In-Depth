package foundationsofjava.oop.exercise;

public class Bicycle extends PedalVehicle {
    private String type;

    public Bicycle(int wheels, String material, int speed, int numberOfPedals, String type) {
        super(wheels, material, speed, numberOfPedals);
        this.type = type;
    }

    @Override
    public String toString(){
        return "Get on the bike CJ";
    }
}
