package vet;

import java.util.ArrayList;
import java.util.List;

public class VetOffice {
    // has-a relationship with Pet class
    // composition
    private final List<Pet> pets = new ArrayList<>();

    public void addPet(Pet p){
        pets.add(p);
    }

    public void displayPets(){
        // display all the Pet objects in the pets ArrayList
        for(Pet p : pets){
            System.out.println(p);
        }
        System.out.println();
        /* reminder of other for loop that must
           be used if modifying the list of pets,
           removing, setting, etc.
         */
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i));
        }
    }

}
