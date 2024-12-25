package View;

import java.util.List;

import Model.Contact;

public class AddressBookView {
    public void displayContactList(List<Contact> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contact List:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}