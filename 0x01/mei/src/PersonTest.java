import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class PersonTest {

    Person person = new Person();

    @BeforeEach
    public void setup() {
        person.setName("Paul");
        person.setSurname("McCartney");
        person.setBirthDate(1947);
    }

    @Test
    public void show_full_name() {
        person.setName("Paul");
        person.setSurname("McCartney");
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    public void test_calculateYearlySalary() {
        Person person1 = new Person();
        person1.setSalary(1200f);
        assertEquals(14400.0, person1.calculateYearlySalary());


    }

    @Test
    public void person_is_MEI(){
        person.setAnotherCompanyOwner(false);
        person.setPensioner(false);
        person.setPublicServer(false);

        assertTrue(person.isMEI());
    }
    @Test
    public void person_is_not_MEI(){

        person.setAnotherCompanyOwner(true);
        person.setPensioner(true);
        person.setPublicServer(true);

        assertFalse(person.isMEI());
    }
}
