package foundationsofjava.oop.videoexercises;

public class DogInheritance extends AnimalInheritance {
    private final String breed;

    private final String colour;

    public DogInheritance(String breed, String colour) {
        this.breed = breed;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "DogInheritance{" +
                "breed='" + breed + '\'' +
                ", colour='" + colour + '\'' +
                "} " + super.toString();
    }
}
