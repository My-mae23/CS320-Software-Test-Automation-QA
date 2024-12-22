package module3;

// The HashMap class and the Map interface from the java.util package are being imported. 
// The HashMap class implements the Map interface, which stores key-value pairs.

import java.util.HashMap; // Import HashMap class
import java.util.Map; // Import Map interface


public class ContactService {
    // Initialize a HashMap to store contacts with their contactID as the key
    private final Map<String, Contact> contactList = new HashMap<>();


    // Method to add a new contact
    public void addContact(Contact contact) {
        // Check if the contactID already exists in the contactList
        if (contactList.containsKey(contact.getContactID())) {
            throw new IllegalArgumentException("Contact ID already exists");
        }
        // Add the contact to the contactList
        contactList.put(contact.getContactID(), contact);
    }


    // Method to delete a contact by contactID
    public void deleteContact(String contactID) {
        // Check if the contactID exists in the contactList
        if (!contactList.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact ID not found");
        }
        // Remove the contact from the contactList
        contactList.remove(contactID);
    }

public void updateContact(String contactID, String firstName, String lastName, String phone, String address) {
    // Retrieve the contact from the contactList using the contactID
    Contact contact = contactList.get(contactID);
    // If the contact does not exist, throw an exception
    if (contact == null) {
        throw new IllegalArgumentException("Contact ID not found");
    }
    // Update the firstName if it is not null and its length is less than or equal to 10
    if (firstName != null && firstName.length() <= 10) {
        contact.setFirstName(firstName);
    }
    // Update the lastName if it is not null and its length is less than or equal to 10
    if (lastName != null && lastName.length() <= 10) {
        contact.setLastName(lastName);
    }
    // Update the phone if it is not null and its length is exactly 10
    if (phone != null && phone.length() == 10) {
        contact.setPhone(phone);
    }
    // Update the address if it is not null and its length is less than or equal to 30
    if (address != null && address.length() <= 30) {
        contact.setAddress(address);
    }
}

public Contact getContact(String contactID) {
    // Retrieve and return the contact from the contactList using the contactID
    return contactList.get(contactID);
	}
}
