package seedu.addressbook.common;

import org.junit.Before;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Test;

import seedu.addressbook.common.Utils;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Address;
import seedu.addressbook.data.person.Email;
import seedu.addressbook.data.person.Phone;
import seedu.addressbook.data.tag.UniqueTagList;

public class UtilsTest {

    private Person nullPerson;
    private Person person1;
    private Person person2;
    private Name person1Name;
    private Name person2Name;
    private Phone person1Phone;
    private Phone person2Phone;
    private Email person1Email;
    private Email person2Email;
    private Address person1Address;
    private Address person2Address;
    private Name nullName;
    private Phone nullPhone;
    private Email nullEmail;
    private Address nullAddress;
    
    @Before
    public void setup() throws IllegalValueException {
        person1Name = new Name("Test Person One");
        person1Phone = new Phone("65166666", false);
        person1Email = new Email("tpo@yahoo.com", false);
        person1Address = new Address("123, tpc, #01-01, 342145", false);
        
        person2Name = new Name("Test Person Two");
        person2Phone = new Phone("65155555", true);
        person2Email = new Email("tpotwo@yahoo.com", true);
        person2Address = new Address("100, tpc, #9-91, 694280", true);
        
        person1 = new Person(person1Name, person1Phone, person1Email, person1Address, new UniqueTagList());
        person2 = new Person(person2Name, person2Phone, person2Email, person2Address, new UniqueTagList());
        
    }
    
    @Test
    public void isAnyNull_nullList_trueReturned() {
        assertTrue(Utils.isAnyNull(nullPerson, nullName, nullPhone, nullAddress, nullEmail));
    }
    
    @Test
    public void isAnyNull_nonNullList_falseReturned() {
        assertFalse(Utils.isAnyNull(person1, person2Email));
    }
    
    @Test 
    public void isAnyNull_mixedList_trueReturned() {
        assertTrue(Utils.isAnyNull(person2, person1, nullPerson));
    }
    
    @Test
    public void isAnyNull_noObjects_falseReturned() {
        assertFalse(Utils.isAnyNull());
    }
    
    @Test
    public void elementsAreUnique_repeatedList_falseReturned() {
        ArrayList<Person> personsList = new ArrayList<Person>();
        personsList.add(person1);
        personsList.add(person1);
        assertFalse(Utils.elementsAreUnique(personsList));
        
        personsList.add(person2);
        assertFalse(Utils.elementsAreUnique(personsList));
    }
    
    @Test
    public void elementsAreUnique_uniqueList_trueReturned() {
        ArrayList<Person> personsList = new ArrayList<Person>();
        personsList.add(person1);
        assertTrue(Utils.elementsAreUnique(personsList));
        
        personsList.add(person2);
        assertTrue(Utils.elementsAreUnique(personsList));
    }
    
    @Test
    public void elementsAreUnique_emptyList_trueReturned() {
        ArrayList<Person> personsList = new ArrayList<Person>();
        assertTrue(Utils.elementsAreUnique(personsList));
    }
}
