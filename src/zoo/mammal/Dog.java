package zoo.mammal;

public class Dog extends Mammal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void noise() {
        System.out.println("'I will love you for the end of times' barking whenever you are in close proximity");
    }

    @Override
    public String toString() {
        return "Dog[" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ']';
    }
}
