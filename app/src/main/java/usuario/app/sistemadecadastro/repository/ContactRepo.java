package usuario.app.sistemadecadastro.repository;

import java.util.ArrayList;
import java.util.List;

import usuario.app.sistemadecadastro.model.Contact;

/**
 * Created by suellencolangelo on 26/12/16.
 */

public class ContactRepo {
    private static List<Contact> sContacts;

    public static List<Contact> retrieveContacts() {
        getsContacts().add(new Contact("Tiago", "Marechal", "(16)997343735"));
        getsContacts().add(new Contact("Suellen", "Douradinho", "(16)997343734"));
        getsContacts().add(new Contact("Janete", "Rodrigues Cajado", "(16)997343735"));

        return getsContacts();
    }

    private static List<Contact> getsContacts() {
        if (sContacts == null) {
            sContacts = new ArrayList<>();
        }
        return sContacts;
    }

    public static void addContact(Contact contact) {
        getsContacts().add(contact);
    }

    public static void deleteContact(Contact contact) {
        getsContacts().remove(contact);
    }

}
