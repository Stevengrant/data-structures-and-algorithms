package code401challenges.fifo_animal_shelter;

import org.junit.Test;

import static org.junit.Assert.*;
public class AnimalShelterTest {

    @Test
    public void enqueue() {
        AnimalShelter shelter = new AnimalShelter(null);
        Animal scruff = new Animal("Scruff","dog");
        Animal duff = new Animal("Duff","dog");
        Animal spot = new Animal("Spot","dog");
        Animal fluff = new Animal("Fluff","cat");
        Animal mrTinkles = new Animal("Mr Tinkles esquire","cat");

        shelter.enqueue(scruff);
        assertTrue("Should enqueue.", shelter.dogs.value.name.equals("Scruff"));

        shelter.enqueue(duff);
        assertTrue("Should enqueue.", shelter.dogs.value.name.equals("Duff"));

        shelter.enqueue(spot);
        assertTrue("Should enqueue.", shelter.dogs.value.name.equals("Spot"));

        shelter.enqueue(fluff);
        assertTrue("Should enqueue.", shelter.cats.value.name.equals("Fluff"));

        shelter.enqueue(mrTinkles);
        assertTrue("Should enqueue.", shelter.cats.value.name.equals("Mr Tinkles esquire"));
        assertTrue("Should enqueue.", shelter.dogs.value.name.equals("Spot"));
        boolean doesThrowEx= false;
        try{

            shelter.enqueue(new Animal("Beef", "Human"));
        }
        catch(IllegalArgumentException e) {
            doesThrowEx = true;
        }
        assertTrue("Should throw exeption when non cat/dog is enqueued",doesThrowEx);
    }

    @Test
    public void dequeue() {
        AnimalShelter shelter = new AnimalShelter(null);
        assertNull(shelter.dogs);
        assertNull(shelter.cats);
        assertNull(shelter.dequeue("dog"));
        Animal scruff = new Animal("Scruff","dog");
        shelter.enqueue(scruff);
        assertNotNull(shelter.dogs);
        assertTrue(shelter.dogs.value.name.equals("Scruff"));
        assertNull(shelter.cats);
        shelter.dequeue("dog");
        assertNull(shelter.dogs);
        assertNull(shelter.cats);
        shelter.enqueue(scruff);

        Animal duff = new Animal("Duff","dog");
        shelter.enqueue(duff);

        Animal spot = new Animal("Spot","dog");
        shelter.enqueue(spot);

        Animal fluff = new Animal("Fluff","cat");
        shelter.enqueue(fluff);

        Animal mrTinkles = new Animal("Mr Tinkles esquire","cat");
        shelter.enqueue(mrTinkles);




    }
}