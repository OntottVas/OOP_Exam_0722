package zoo.mammal;

public class Cat extends Mammal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void noise() {
        System.out.println("'You have been judged!' meows all over the place.");
    }

    @Override
    public String toString() {
        return "Cat[" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ']';
    }
}
