package usuario.app.sistemadecadastro.registry.crudContacts.detail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import org.parceler.Parcels;

import usuario.app.sistemadecadastro.R;
import usuario.app.sistemadecadastro.model.Contact;

/**
 * Created by suellencolangelo on 22/01/17.
 */

public class ContactDetailActivity extends AppCompatActivity {
    public static final String CONTACT = "CONTACT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_activity);

        Toolbar toolbar = (Toolbar) findViewById(R.id.action_bar);
        setSupportActionBar(toolbar);

        // parcer do contato
        Contact contact = Parcels.unwrap(getIntent().getParcelableExtra(CONTACT));
    }


}
