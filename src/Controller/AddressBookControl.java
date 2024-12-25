package Controller;

import java.util.Scanner;

import Model.AddressBook;
import Model.Contact;
import View.AddressBookView;

public class AddressBookControl {
    private AddressBook model;
    private AddressBookView view;
    private Scanner scanner;

    public AddressBookControl(AddressBook model, AddressBookView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            view.displayMessage("Welcome to the Address Book!");
            view.displayMessage("1. Add Contact");
            view.displayMessage("2. View All Contacts");
            view.displayMessage("3. Exit");
            view.displayMessage("Please choose an option:");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    viewAllContacts();
                    break;
                case 3:
                    view.displayMessage("Goodbye!");
                    return;
                default:
                    view.displayMessage("Invalid choice, please try again.");
            }
        }
    }

    private void addContact() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        Contact newContact = new Contact(name, phoneNumber, email);
        model.addContact(newContact);
        view.displayMessage("Contact added successfully!");
    }

    private void viewAllContacts() {
        view.displayContactList(model.getAllContacts());
    }
}
