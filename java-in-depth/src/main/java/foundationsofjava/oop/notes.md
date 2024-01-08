# Week [1]: [OOP]

## Key Concepts

- **Objectives:** Understand and define encapsulation, inheritance, composition, and polymorphism

- **Core Concepts**
    - Encapsulation
    - Inheritance
    - Composition
    - Polymorphism

## Hands-On Practice

- **Code Snippets**

The following code snippet illustrates the use of inheritance and encapsulation by providing the public facing contracts of use via the getter and setters functions.
```java
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

```

This code sample shows the use of composition to define a unique class that combines the car and bicycle classes to create the `BicycleWithSideCar` class
```java
    public BicycleWithSideCar(Car car, Bicycle bike) {
        super(bike.getWheels(), bike.getMaterial(), bike.getSpeed(), bike.getNumberOfPedals());
        this.sideCar = car;
        this.bike = bike;
    }
```

The following code sample provides an illustration on how inheritance and encapsulation can be maximised through the use of polymorphic code
```java
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
```
- **Projects:**
    - This week saw the creation of a vehicle hierarchy to define the uses of OOP

## Challenges and Solutions

- **Challenges:**
    - While a time-based learning pattern is good, I believe it doesn't sufficiently allow me time to gather my thoughts and glean a good understand. This is partly due to having a busy lifecycle. However, it has made me ensure that I am spending an hour a day minimum to the project. However, I believe we can remove this feature of the process
    - The video material is quite slow, I believe a purely visual representation and more hands on would actually be a stronger approach for me personally
- **Solutions:**
    - Remove the session tracker elements for using time-bound cycles
    - Reduce the burden of video material and favour reading as the initial introduction to the material and then using the video material as a substitute depending on the topics complexity 
## Reflection

- **What Went Well:**
    - The programming hands-on elements of the week went very smoothly along with the reading material

- **Areas for Improvement:**
    - Research in more detail the video aspects that are used throughout each topic

## Additional Resources

- **Reading Materials:**
    - N/A

- **Video Tutorials:**
    - N/A

## Future Focus

- **Key Takeaways:**
    - ChatGPT provides a good quizzing element to the course and allows for a quick feedback loop to be achieved when testing ones knowledge of the concepts. In addition, it has allowed me to further understand my own code to see how it may improve it, however, this is something to take care with as..... AI

- **Next Steps:**
    - Continue onto the next topic armed with the knowledge of starting with the reading material first

## Personal Notes

- **Personal Observations:**
    - I loose focus easily when the material is very boring and dry. It maybe worth copying the text into a nicer format than the glaring website format. In addition, it could be nicer to increase the font size when reading to put less strain on the eyeballs

- **Questions:**
    - Would further reading on object oritentated design be something I should in if there is time within the 24 weeks?

## Review

- **Review Date:**
    - Check in on: 08/02/2024
