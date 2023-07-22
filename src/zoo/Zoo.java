package zoo;

import zoo.bird.Bird;
import zoo.mammal.Mammal;
import zoo.reptile.Reptile;

import java.util.List;

public class Zoo {
    private final List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        this.animals.remove(animal);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }

    public String toStringMammals() {
        String result = "Mammals{";
        for (Animal actual : animals) {
            if(actual instanceof Mammal) {
                result += actual.toString() + ", ";
            }
        }
        return result.substring(0, result.length()-2).concat("}");
    }

    public String toStringBirds() {
        String result = "Birds{";
        for (Animal actual : animals) {
            if(actual instanceof Bird) {
                result += actual.toString() + ", ";
            }
        }
        return result.substring(0, result.length()-2).concat("}");
    }

    public String toStringReptiles() {
        String result = "Reptiles{";
        for (Animal actual : animals) {
            if(actual instanceof Reptile) {
                result += actual.toString() + ", ";
            }
        }
        return result.substring(0, result.length()-2).concat("}");
    }
}
