package usuario.app.sistemadecadastro.registry.crudContacts;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import usuario.app.sistemadecadastro.R;
import usuario.app.sistemadecadastro.repository.ContactRepo;

/**
 * Created by suellencolangelo on 26/12/16.
 */

public class ListContactsFragment extends Fragment implements ListContactsContract.View {

    public static ListContactsFragment newInstance() {
        ListContactsFragment fragment = new ListContactsFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.list_contacts_fragment, container, false);

        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.list_contacts_recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);

        ListContactsAdapter adapter = new ListContactsAdapter(ContactRepo.retrieveContacts());
        recyclerView.setAdapter(adapter);
        return root;
    }
}
