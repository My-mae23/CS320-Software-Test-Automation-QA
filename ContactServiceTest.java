package module3;

// The BeforeEach annotation is used for setup methods, 
// the Test annotation is used for test methods, 
// and the Assertions class provides static methods for making assertions in tests.

import org.junit.jupiter.api.BeforeEach; // Import BeforeEach annotation for setup method
import org.junit.jupiter.api.Test; // Import Test annotation for test methods
import static org.junit.jupiter.api.Assertions.*; // Import static methods from Assertions class


class ContactServiceTest {


    private ContactService contactService; // Declare ContactService instance


    @BeforeEach
    void setUp() {
        contactService = new ContactService(); // Initialize ContactService instance
    }


    @Test
    void testAddContact() {
        Contact contact = new Contact("1", "Myra", "Mae", "1234567890", "myra.mae@example.com"); // Create a new Contact object
        contactService.addContact(contact); // Add the contact to the contact service
        assertEquals(1, contactService.getAllContacts().size()); // Check if the contact was added successfully
    }


    @Test
    void testRemoveContact() {
        Contact contact = new Contact("1", "Myra", "Mae", "1234567890", "myra.mae@example.com"); // Create a new Contact object
        contactService.addContact(contact); // Add the contact to the contact service
        contactService.removeContact("1"); // Remove the contact by ID
        assertEquals(0, contactService.getAllContacts().size()); // Check if the contact was removed successfully
    }


    @Test
    void testGetContactById() {
        Contact contact = new Contact("1", "Myra", "Mae", "1234567890", "myra.mae@example.com"); // Create a new Contact object
        contactService.addContact(contact); // Add the contact to the contact service
        Contact retrievedContact = contactService.getContactById("1"); // Get the contact by ID
        assertEquals("Myra", retrievedContact.getFirstName()); // Check if the retrieved contact's first name matches
    }


    @Test
    void testUpdateContact() {
        Contact contact = new Contact("1", "Myra", "Mae", "1234567890", "myra.mae@example.com"); // Create a new Contact object
        contactService.addContact(contact); // Add the contact to the contact service
        contact.setFirstName("Sheila"); // Update the contact's first name
        contactService.updateContact(contact); // Update the contact in the contact service
        Contact updatedContact = contactService.getContactById("1"); // Get the updated contact
        assertEquals("Sheila", updatedContact.getFirstName()); // Check if the contact's first name was updated successfully
    }
}
