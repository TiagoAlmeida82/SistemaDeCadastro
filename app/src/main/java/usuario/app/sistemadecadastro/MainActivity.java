package usuario.app.sistemadecadastro;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import usuario.app.sistemadecadastro.registry.crudContacts.list.ContactsFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_activity);

        Toolbar toolbar = (Toolbar) findViewById(R.id.action_bar);
        setSupportActionBar(toolbar);
        openFragment(ContactsFragment.newInstance(), R.id.main_fragment_container);
    }

}