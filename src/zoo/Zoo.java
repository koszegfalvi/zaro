package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animals> animals = new ArrayList<>();

    public void addAnimal(Animals animal) {
        animals.add(animal);
    }

    public void throwOutAnimal(Animals animal) {
        animals.remove(animal);
    }

    public List<Animals> allAnimalsList() {
        return animals;
    }

    public List<Mammal> listOutMammals() {
        List<Mammal> mammals = new ArrayList<>();
        for (Animals animal : animals) {
            if (animal instanceof Mammal) {
                mammals.add((Mammal) animal);
            }
        }
        return mammals;
    }

    public List<Bird> listOutBirds() {
        List<Bird> birds = new ArrayList<>();
        for (Animals animal : animals) {
            if (animal instanceof Bird) {
                birds.add((Bird) animal);
            }
        }
        return birds;
    }

    public List<Reptile> listOutReptile() {
        List<Reptile> reptiles = new ArrayList<>();
        for (Animals animal : animals) {
            if (animal instanceof Reptile) {
                reptiles.add((Reptile) animal);
            }
        }
        return reptiles;
    }

}
