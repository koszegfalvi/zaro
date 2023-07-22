package zoo;

public class Penguin extends Bird{
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("penguin sound");
    }
}
