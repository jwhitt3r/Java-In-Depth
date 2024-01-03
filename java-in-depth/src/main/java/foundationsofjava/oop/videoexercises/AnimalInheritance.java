package foundationsofjava.oop.videoexercises;

public class AnimalInheritance {
    private final String type;

    private final String voice;

    public AnimalInheritance(){
        this.type = "Unknown";
        this.voice = "grr!!!";
    }

    @Override
    public String toString() {
        return "AnimalInheritance{" +
                "type='" + type + '\'' +
                ", voice='" + voice + '\'' +
                '}';
    }
}
