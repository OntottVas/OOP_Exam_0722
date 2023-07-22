package zoo.bird;

import zoo.Animal;
import zoo.types.Flyable;
import zoo.types.Oviparous;

public class Bird extends Animal implements Flyable, Oviparous {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void noise() {}
}
