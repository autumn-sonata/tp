package seedu.address.model;

import javafx.collections.ObservableList;
import seedu.address.model.group.Group;
import seedu.address.model.person.Person;

/**
 * Unmodifiable view of an address book
 */
public interface ReadOnlyAddressBook {

    /**
     * Returns an unmodifiable view of the persons list.
     * This list will not contain any duplicate persons.
     */
    ObservableList<Person> getPersonList();

    /**
     * Returns an unmodifiable view of the teams list.
     * This list will not contain any duplicate teams but may contains subteams.
     */
    ObservableList<Group> getTeamsList();

    // /**
    // * Returns an unmodifiable view of all the tasks.
    // * This list will not contain any duplicate tasks.
    // */
    // ObservableList<Person> getTaskList();

}
