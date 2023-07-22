package zoo.reptile;

public class Turtle extends Reptile{
    public Turtle(String name, int age){
        super(name, age);
    }

    @Override
    public void noise() {
        System.out.println("Mysterious turtle sounds.");
    }

    @Override
    public String toString() {
        return "Turtle[" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ']';
    }
}
