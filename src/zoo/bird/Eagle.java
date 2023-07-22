package zoo.bird;

public class Eagle extends Bird{
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void noise() {
        System.out.println("Cry like a majestic EEEEAGLE!");
    }

    @Override
    public String toString() {
        return "Eagle[" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ']';
    }
}
