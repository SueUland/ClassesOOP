package vet;

public class Pet {
    // instance variables, fields, properties
    private final String name;
    private final String breed;
    private final int id;

    // share a piece of data with all objects
    // class field - unique id number
    private static int nextNum = 1;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.id = nextNum++;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", id=" + id +
                '}';
    }
}
