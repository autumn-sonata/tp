package seedu.address.model.item;

import org.junit.jupiter.api.Test;

import seedu.address.model.person.Person;
import seedu.address.model.tag.Tag;
import seedu.address.testutil.PersonBuilder;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;
import static seedu.address.testutil.TypicalPersons.ALICE;

class AbstractDisplayItemTest {
    private Set<Tag> tags;

    Person buildDefaultPerson(String name, String... tags) {
        return new PersonBuilder().withName(name)
                .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
                .withPhone("94351253")
                .withTags(tags).build();
    }

    @Test
    void rename_validName_success() {
        Person alice = buildDefaultPerson("Alice");
        alice.rename("Bob");
        assertEquals(alice.getName().fullName, "Bob");
    }

    @Test
    void getTags() {
        tags = new HashSet<>();
        tags.add(new Tag("friends"));
        assertEquals(buildDefaultPerson("Charlie", "friends").getTags(), tags);
    }

    @Test
    void addTags() {
        tags = new HashSet<>();
        tags.add(new Tag("friends"));
        tags.add(new Tag("colleagues"));
        Person donny = buildDefaultPerson("Donny", "friends");
        donny.addTags("colleagues");
        assertEquals(donny.getTags(), tags);
    }

    @Test
    void deleteTag_existingTag_success() {
        Person echo = buildDefaultPerson("Echo", "friends");
        echo.deleteTag("friends");
        assertTrue(echo.getTags().isEmpty());
    }

    @Test
    void deleteTag_tagNotFound_doesNothing() {
        Set<Tag> prevTags = ALICE.getTags();
        ALICE.deleteTag("doctor");
        assertEquals(ALICE.getTags(), prevTags);
    }

    @Test
    void getAttribute_attributeNotFound_success() {
        Person george = buildDefaultPerson("George", "friends");
        assertFalse(george.getAttribute("dummy").isPresent());
    }

    @Test
    void getAttribute_attributeFound_success() {

    }

    @Test
    void editAttribute() {
    }

    @Test
    void addAttribute() {
    }

    @Test
    void testAddAttribute() {
    }

    @Test
    void setTags() {
    }

    @Test
    void canBeChildOf() {
    }

    @Test
    void getTitle() {
    }

    @Test
    void getTypeFlag() {
    }

    @Test
    void deleteAttribute() {
    }

    @Test
    void testToString() {
    }

    @Test
    void getName() {
    }

    @Test
    void stronglyEqual() {
    }

    @Test
    void weaklyEqual() {
    }

    @Test
    void isPartOfContext() {
    }

    @Test
    void getAttributes() {
    }

    @Test
    void getSavedAttributes() {
    }

    @Test
    void testEquals() {
    }
}