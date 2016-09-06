package seedu.addressbook.commands;

import seedu.addressbook.data.AddressBook;

/**
 * Terminates the program.
 */
public class ExitCommand extends Command {

    public static final String COMMAND_WORD = "exit";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Exits the program.\n"
            + "Example: " + COMMAND_WORD;
    public static final String MESSAGE_EXIT_ACKNOWEDGEMENT = "Exiting Address Book as requested ...";
    public static final String MESSAGE_TAGS = "Tags added this session: \n";
    public static final String LS = "\n";
    
    @Override
    public CommandResult execute() {
        String tagsThisSession = AddressBook.getTagsModifiedThisSession();
        String returnMessage = MESSAGE_TAGS + tagsThisSession + LS + MESSAGE_EXIT_ACKNOWEDGEMENT; 
        
        AddressBook.clearTagsModified();
        
        return new CommandResult(returnMessage);
    }

    public static boolean isExit(Command command) {
        return command instanceof ExitCommand; // instanceof returns false if it is null
    }
}
