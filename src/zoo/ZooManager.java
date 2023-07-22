package zoo;

import zoo.bird.Eagle;
import zoo.bird.Penguin;
import zoo.mammal.Cat;
import zoo.mammal.Dog;
import zoo.reptile.Snake;
import zoo.reptile.Turtle;

import java.util.ArrayList;

public class ZooManager {
    public static void main(String[] args) {
        Dog frakk = new Dog("Frakk", 8);
        Cat tom = new Cat("Tom", 5);
        Eagle mmerica = new Eagle("'MERICA", 350);
        Penguin rico = new Penguin("Rico", 3);
        Snake kha = new Snake("Kha", 50);
        Turtle oogway = new Turtle("Oogway", 150);

        Zoo firstZoo = new Zoo(new ArrayList<>());

        firstZoo.addAnimal(frakk);
        firstZoo.addAnimal(tom);
        firstZoo.addAnimal(mmerica);
        firstZoo.addAnimal(rico);
        firstZoo.addAnimal(kha);
        firstZoo.addAnimal(oogway);

        System.out.println(firstZoo);

        frakk.noise();
        tom.noise();
        mmerica.noise();
        rico.noise();
        kha.noise();
        oogway.noise();

        System.out.println(firstZoo.toStringMammals());
        System.out.println(firstZoo.toStringBirds());
        System.out.println(firstZoo.toStringReptiles());
    }
}
