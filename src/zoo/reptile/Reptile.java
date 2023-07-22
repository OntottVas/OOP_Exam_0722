package zoo.reptile;

import zoo.Animal;
import zoo.types.Oviparous;

public class Reptile extends Animal implements Oviparous {
    public Reptile(String name, int age) {
        super(name, age);
    }

    @Override
    public void noise() {}
}
