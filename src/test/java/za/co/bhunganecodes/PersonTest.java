package za.co.bhunganecodes;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void userInitializedCorrectly(){
        User user1 = new User("Thamsanqa");
        assertEquals("Thamsanqa", user1.getName());
    }

    @Test
    public void personHeightIsCorrect(){
        Person person1 = new Person("You", 28, 1.85);
        assertEquals(1.85, person1.getHeight());
    }

    @Test
    public void newPersonNameUpdated(){
        Person newPerson = new Person("Bobby Brown");
        newPerson.setName("Superman");
        assertEquals("Superman", newPerson.getName());
    }

    @Test
    public void getPersonsAge(){
        Person person = new Person("Test", 22, 2.0);
        assertEquals(22, person.getAge());
    }
}
