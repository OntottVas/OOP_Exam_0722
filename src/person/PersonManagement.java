package person;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonManagement {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person("Ger", 15, Gender.MALE);
        Person p2 = new Person("Ren", 19, Gender.FEMALE);
        Person p3 = new Person("Mar", 10, Gender.FEMALE);
        Person p4 = new Person("Tom", 18, Gender.MALE);
        Person p5 = new Person("Ten", 17, Gender.MALE);
        Person p6 = new Person("Lia", 11, Gender.FEMALE);

        p1.addFriend(p2);
        p1.addFriend(p3);
        p1.addFriend(p4);
        p1.addFriend(p5);
        p1.addFriend(p6);

        p1.addHobbies("Swimming");
        //p1.addHobbies("Swimming");

        System.out.println(p1);
        //p1.addFriend(p2);

        System.out.println(p2);

    }
}
