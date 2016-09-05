package seedu.addressbook.data.person;

/**
 * A read-only immutable interface for a Contact in the addressbook.
 * Implementations should guarantee: details are present and not null, field values are validated.
 */
public interface Printable {

    /**
     * Returns a string representation of the field
     * @return string of the form \<Field\>: \<Value\>
     */
    String getPrintableString();
    
}
