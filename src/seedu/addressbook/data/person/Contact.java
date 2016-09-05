package seedu.addressbook.data.person;

/**
 * Base class Contact to hold the common fields (isPrivate and value) of
 * address, email and phone
 */
public class Contact {

    protected String value;
    protected boolean isPrivate;
    
    public Contact(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    
    public boolean isPrivate() {
        return isPrivate;
    }
    
    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }
    
    @Override
    public int hashCode(){
        return value.hashCode();
    }
    
}
