package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

/**
 * Maintains association between person and tag.
 */
public class Tagging {
    
    private Person person;
    private Tag tag;
    private boolean isAdded;
    
    private final String ADD_PREFIX = "+ ";
    private final String DEL_PREFIX = "- ";
    
    
    public Tagging(Person p, Tag t, boolean isAdded) {
        this.person = p;
        this.tag = t;
        this.isAdded = isAdded;
    }
    
    /**
     * Returns the tag in the format + \<Name\> [\<tag\>] or
     * - \<Name\> [\<tag\>] for added and deleted tags respectively.
     */
    public String getTag() {
        StringBuilder builder = new StringBuilder();
        
        if (this.isAdded) {
            builder.append(ADD_PREFIX) ;
        } else {
            builder.append(DEL_PREFIX);
        }
        
        builder.append(this.person.getName().toString()); 
        builder.append(this.tag.toString());
        
        return builder.toString();
    }

}
