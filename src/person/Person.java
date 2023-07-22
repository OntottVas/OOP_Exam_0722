package person;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private final Gender gender;
    private List<String> hobbies;
    private List<Person> friends;
    private static int counter = 0;


    public Person(String name, int age, Gender gender, List<String> hobbies, List<Person> friends) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobbies = hobbies;
        this.friends = friends;
        counter++;
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.friends = new ArrayList<>();
        this.hobbies = new ArrayList<>();
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<Person> getFriends() {
        return friends;
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }

    public int getPopulation(){
        return counter;
    }

    public void addFriend(Person friend) throws AlreadyFriendsException{
        if (!this.friends.contains(friend)) {
            this.friends.add(friend);
        } else {
            throw new AlreadyFriendsException();
        }
        friend.friends.add(new Person(this.name, this.age, this.gender, this.hobbies, this.friends));
    }

    public void addHobbies(String hobby) throws HobbyAlreadyExistException{
        if (!this.hobbies.contains(hobby)) {
            this.hobbies.add(hobby);
        } else {
            throw new HobbyAlreadyExistException();
        }
    }

    public String friendListing(List<Person> friends) {
        String result = "";
        for (int i = 0; i < friends.size(); i++) {
            result += friends.get(i).getName() + ", ";
        }
        return result.substring(0, result.length() - 2);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hobbies=" + hobbies +
                ", friends=" + friendListing(friends) +
                '}';
    }
}
