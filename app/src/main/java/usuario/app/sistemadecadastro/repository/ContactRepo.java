package usuario.app.sistemadecadastro.repository;

import java.util.ArrayList;
import java.util.List;

import usuario.app.sistemadecadastro.model.Contact;

/**
 * Created by suellencolangelo on 26/12/16.
 */

public class ContactRepo {

    public static List<Contact> sContacts;


    public static List<Contact> retrieveContacts(){
        sContacts = new ArrayList<>();
        sContacts.add(new Contact("Tiago", "Marechal", "(16)997343735"));
        sContacts.add(new Contact("Suellen", "Douradinho", "(16)997343734"));
        sContacts.add(new Contact("Janete", "Rodrigues Cajado", "(16)997343735"));

        return sContacts;
    }
}
