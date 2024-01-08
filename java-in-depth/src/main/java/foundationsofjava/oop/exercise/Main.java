package foundationsofjava.oop.exercise;

public class Main {
    public static void main(String[] args){
        /*
        We can create multiple objects of the same reference and object type like so
         */

        Vehicle vehicle = new Vehicle(4, "Steel", 10);
        System.out.println(vehicle);

        MotorVehicle motorVehicle = new MotorVehicle(4, "Steel", 10, "V8");
        System.out.println(motorVehicle);

        PedalVehicle pedalVehicle = new PedalVehicle(2, "Aluminium", 1, 2);
        System.out.println(pedalVehicle);

        Car porsche = new Car(4, "Carbon Fibre Blend", 10, "V8", "911");
        System.out.println(porsche);

        Bicycle bike = new Bicycle(2, "Aluminium", 1, 2, "BMX");
        System.out.println(bike);

        /*
        Alternatively with polymorphism, we can use the Reference type of the superclass instead, e.g., Car could have the MotorVehicle, and Bicycle could have the PedalVehicle, or they could all use Vehicle
         */

        Vehicle ford = new Car(4, "Steel", 11, "V10", "Dodge");
        System.out.println(ford);
    }
}

