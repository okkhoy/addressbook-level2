package seedu.addressbook.data.person;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Name;

public class NameTest {

    private Name name1;
    private Name name2;
    private Name nullName;
    
    @Before
    public void setup() throws IllegalValueException {
        name1 = new Name("Name one");
        name2 = new Name("Name two");
    }
    
    @Test(expected = RuntimeException.class)
    public void isSimilar_notImplemented_returnexception() {
        name1.isSimilar(null);
    }
    
    
}
