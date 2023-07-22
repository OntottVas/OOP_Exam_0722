package zoo.mammal;

import zoo.Animal;
import zoo.types.Viviparous;

public class Mammal extends Animal implements Viviparous {

    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void noise() {}
}
