package zoo.reptile;

public class Snake extends Reptile{
    public Snake(String name, int age) {
        super(name, age);
    }

    @Override
    public void noise() {
        System.out.println("Hissing something in parseltounge.");
    }

    @Override
    public String toString() {
        return "Snake[" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ']';
    }
}
