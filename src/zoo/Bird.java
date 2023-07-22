package zoo;

public abstract class Bird extends Animals implements Flyable, Oviparous {
    public Bird(String name, int age) {
        super(name, age);
    }
}
