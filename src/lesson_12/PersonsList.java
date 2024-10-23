package lesson_12;

import java.util.ArrayList;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class PersonsList {
    private ArrayList<Person> persons;

    public PersonsList() {
        this.persons = new ArrayList<>();
    }

    public void add(int index, Person person) {
        if (index >= 0 && index <= persons.size()) {
            persons.add(index, person);
        }
    }

    public void remove() {
        if (!persons.isEmpty()) {
            persons.remove(persons.size() - 1);
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < persons.size()) {
            persons.remove(index);
        }
    }

    public void printPersons() {
        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }
}

