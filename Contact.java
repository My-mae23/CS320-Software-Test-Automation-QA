package module3;

public class Contact {
    private final String contactID; // Unique identifier for the contact
    private String firstName; // First name of the contact
    private String lastName; // Last name of the contact
    private String phone; // Phone number of the contact
    private String address; // Address of the contact

    // Constructor to initialize the Contact object with given parameters
    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
    	// Validate contactID: must not be null and must be 10 characters or less
        if (contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("Invalid contact ID");
        }
        // Validate firstName: must not be null and must be 10 characters or less
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }
        // Validate lastName: must not be null and must be 10 characters or less
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        // Validate phone: must not be null and must be exactly 10 characters
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        // Validate address: must not be null and must be 30 characters or less
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        // Assign the validated parameters to the instance variables
        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }


    // Getter method for contactID
    public String getContactID() {
        return contactID; // Return the contactID
    }

    // Getter method for firstName
    public String getFirstName() {
        return firstName; // Return the first name
    }

    // Getter method for lastName
    public String getLastName() {
        return lastName; // Return the last name
    }

    // Getter method for phone
    public String getPhone() {
        return phone; // Return the phone number
    }

    // Getter method for address
    public String getAddress() {
        return address; // Return the address
    }


    // Setter method for firstName
    public void setFirstName(String firstName) {
    	// Validate firstName: must not be null and must be 10 characters or less
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }
        this.firstName = firstName; // Assign the validated firstName to the instance variable
    }

    // Setter method for lastName
    public void setLastName(String lastName) {
    	// Validate lastName: must not be null and must be 10 characters or less
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        this.lastName = lastName; // Assign the validated lastName to the instance variable
    }

    // Setter method for phone
    public void setPhone(String phone) {
    	// Validate phone: must not be null and must be exactly 10 characters
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phone = phone; // Assign the validated phone number to the instance variable
    }

    // Setter method for address
    public void setAddress(String address) {
    	// Validate address: must not be null and must be 30 characters or less
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address; // Assign the validated address to the instance variable
    }
}