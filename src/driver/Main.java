package driver;

import vet.Pet;
import vet.VetOffice;

public class Main {
    public static void main(String[] args) {
        Pet scooby = new Pet("Scooby","canine");
        System.out.println(scooby);

        Pet garfield = new Pet("Garfield","feline");
        System.out.println(garfield);

        // construct a VetOffice
        VetOffice vet = new VetOffice();

        // add scooby and garfield to the vet office
        vet.addPet(scooby);
        vet.addPet(garfield);

        // displayPets
        vet.displayPets();
    }
}
