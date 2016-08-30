package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    public final String value;
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        this.value = address;
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
    
    
    /**
     * Creates and maintains a field called block to store Block 
     * information of the address
     * @author anarayan
     *
     */
    class Block {
        private String block;
        
        public Block(String block) {
            this.block = block;
        }
        
        /** 
         * Converts block information to string and 
         * @return block in string format
         */
        @Override
        public String toString(){
            return this.block;
        }

        /**
         * Returns block information to caller
         */
        public String getBlock() {
            return this.toString();
        }

        /**
         * Sets block information to an empty block field created earlier
         * @param block
         */
        public void setBlock(String block) {
            this.block = block;
        }
        
        
    }
    
    
    /**
     * Creates and maintains a field called street to store Street 
     * information of the address
     * @author anarayan
     *
     */
    class Street {
        private String street;
        
        public Street(String street) {
            this.street = street;
        }
        
        /** 
         * Converts street information to string and 
         * @return street in string format
         */
        @Override
        public String toString(){
            return this.street;
        }

        /**
         * Returns street information to caller
         */
        public String getStreet() {
            return this.toString();
        }

        /**
         * Sets street information to an empty street field created earlier
         * @param block
         */
        public void setStreet(String street) {
            this.street = street;
        }
                
    }
    
    
   /** Creates and maintains a field called unit to store Unit
    * information of the address
    * @author anarayan
    *
    */
   class Unit {
       private String unit;
       private String level;
       
       public Unit(String unit) {
           this.setUnit(unit);;
       }
       
       /** 
        * Converts unit information to string format and returns it
        * E.g., Level: 2, unit 14 will be converted to #02-14
        * @return street in string format
        */
       @Override
       public String toString(){
           String unitInfo = "#" + String.format("%02d", this.unit) + "-" + this.level; 
           return unitInfo;
       }

       /**
        * Returns unit information to caller
        */
       public String getUnit() {
           return this.toString();
       }

       /**
        * Sets unit information to an empty street field created earlier
        * converts a unit like #02-14 to unit = 14 and level = 2 and stores
        * it in the respective fields
        */
       public void setUnit(String unit) {
           String[] unitInfo = unit.split("-");
           this.level = unitInfo[0].startsWith("#") ? unitInfo[0].substring(1) : unitInfo[0];
           this.unit = unitInfo[1];
       }
               
   }
   
   
   
    
}