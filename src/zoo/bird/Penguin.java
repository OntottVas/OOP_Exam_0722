package zoo.bird;

public class Penguin extends Bird{
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void noise() {
        System.out.println("Penguins' sound described as 'honk' in the scientific community.");
    }

    @Override
    public String toString() {
        return "Penguin[" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ']';
    }
}
