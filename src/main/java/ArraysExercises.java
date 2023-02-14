import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        Person[] people = new Person[3];
        people[0] = new Person("John");
        people[1] = new Person("Jane");
        people[2] = new Person("Bob");

        Person newPerson = new Person("Alice");

        for (Person person : people) {
            System.out.println(person.getName());
        }

        System.out.println("------------------");

        Person[] newPeople = addPerson(people, newPerson);

        for (Person person : newPeople) {
            System.out.println(person.getName());
        }


    }

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[newPeople.length - 1] = newPerson;
        return newPeople;
    }


}
