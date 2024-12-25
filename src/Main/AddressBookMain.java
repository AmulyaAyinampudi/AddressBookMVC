
package Main;

import Controller.AddressBookControl;
import Model.AddressBook;
import View.AddressBookView;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook model = new AddressBook();
        AddressBookView view = new AddressBookView();
        AddressBookControl controller = new AddressBookControl(model, view);

        controller.start();
    }
}