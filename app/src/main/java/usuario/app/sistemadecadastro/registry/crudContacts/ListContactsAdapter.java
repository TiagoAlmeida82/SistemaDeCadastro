package usuario.app.sistemadecadastro.registry.crudContacts;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import usuario.app.sistemadecadastro.R;
import usuario.app.sistemadecadastro.model.Contact;

/**
 * Created by suellencolangelo on 26/12/16.
 */

public class ListContactsAdapter extends RecyclerView.Adapter<ListContactsAdapter.ViewHolder> {
    @NonNull
    private List<Contact> contacts;

    public ListContactsAdapter(@NonNull List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Infla o layout da célula da lista
        View contactView = inflater.inflate(R.layout.contact_item, parent, false);
        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Contact contact = getItem(position);
        holder.nameTxv.setText(contact.getName());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public Contact getItem(int position) {
        return contacts.get(position);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTxv;


        ViewHolder(View itemView) {
            super(itemView);
            nameTxv = (TextView) itemView.findViewById(R.id.contact_name_txv);
        }
    }
}
