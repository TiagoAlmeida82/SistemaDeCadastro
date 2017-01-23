package usuario.app.sistemadecadastro.registry.crudContacts.list;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.parceler.Parcels;

import usuario.app.sistemadecadastro.R;
import usuario.app.sistemadecadastro.model.Contact;
import usuario.app.sistemadecadastro.registry.crudContacts.detail.ContactDetailActivity;
import usuario.app.sistemadecadastro.repository.ContactRepo;

/**
 * Created by suellencolangelo on 26/12/16.
 */

public class ContactsFragment extends Fragment implements ContactsContract.View, ContactsAdapter.OnItemClickListener {
    private ContactsAdapter mAdapter;

    public static ContactsFragment newInstance() {
        ContactsFragment fragment = new ContactsFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.list_contacts_fragment, container, false);

        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.list_contacts_recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);

        mAdapter = new ContactsAdapter(ContactRepo.retrieveContacts(), this);
        recyclerView.setAdapter(mAdapter);
        return root;
    }

    @Override
    public void onItemClick(int position) {
        Contact contact = mAdapter.getItem(position);

        Intent intent = new Intent(getActivity(), ContactDetailActivity.class);
        intent.putExtra(ContactDetailActivity.CONTACT, Parcels.wrap(contact));
        startActivity(intent);
    }
}
