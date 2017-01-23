package usuario.app.sistemadecadastro.registry.crudContacts.list;

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

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {
    @NonNull
    private List<Contact> contacts;

    @NonNull
    private OnItemClickListener mListener;

    public ContactsAdapter(@NonNull List<Contact> contacts, @NonNull OnItemClickListener listener) {
        this.mListener = listener;
        this.contacts = contacts;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Infla o layout da célula da lista
        View contactView = inflater.inflate(R.layout.contact_item, parent, false);
        return new ViewHolder(contactView, mListener);
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

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView nameTxv;
        OnItemClickListener listener;

        ViewHolder(View itemView, OnItemClickListener listener) {
            super(itemView);
            nameTxv = (TextView) itemView.findViewById(R.id.contact_name_txv);
            this.listener = listener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (listener != null) {
                listener.onItemClick(getLayoutPosition());
            }
        }
    }
}
