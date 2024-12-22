package module3;

// The BeforeEach annotation is used for setup methods, 
// the Test annotation is used for test methods, 
// and the Assertions class provides static methods for making assertions in tests.

import org.junit.jupiter.api.BeforeEach; // Import BeforeEach annotation for setup 
import org.junit.jupiter.api.Test; // Import Test annotation for test methods
import static org.junit.jupiter.api.Assertions.*; // Import static methods from Assertions class


class ContactTest {


    private Contact contact; // Declare a Contact object


    @BeforeEach
    void setUp() {
        contact = new Contact("1", "Myra", "Mae", "1234567890", "myra.mae@example.com"); // Initialize the Contact object with test data
    }


    @Test
    void testGetId() {
        assertEquals("1", contact.getId()); // Test the getId method
    }


    @Test
    void testGetFirstName() {
        assertEquals("Myra", contact.getFirstName()); // Test the getFirstName method
    }


    @Test
    void testGetLastName() {
        assertEquals("Mae", contact.getLastName()); // Test the getLastName method
    }


    @Test
    void testGetPhoneNumber() {
        assertEquals("1234567890", contact.getPhoneNumber()); // Test the getPhoneNumber method
    }


    @Test
    void testGetEmail() {
        assertEquals("myra.mae@example.com", contact.getEmail()); // Test the getEmail method
    }


    @Test
    void testSetFirstName() {
        contact.setFirstName("Sheila"); // Set a new first name
        assertEquals("Sheila", contact.getFirstName()); // Test if the first name was set correctly
    }


    @Test
    void testSetLastName() {
        contact.setLastName("Zamora"); // Set a new last name
        assertEquals("Zamora", contact.getLastName()); // Test if the last name was set correctly
    }


    @Test
    void testSetPhoneNumber() {
        contact.setPhoneNumber("0987654321"); // Set a new phone number
        assertEquals("0987654321", contact.getPhoneNumber()); // Test if the phone number was set correctly
    }


    @Test
    void testSetEmail() {
        contact.setEmail("sheila.zamora@example.com"); // Set a new email
        assertEquals("sheila.zamora@example.com", contact.getEmail()); // Test if the email was set correctly
    }
}
