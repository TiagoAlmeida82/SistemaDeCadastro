package usuario.app.sistemadecadastro.registry.crudContacts.list;

/**
 * Created by suellencolangelo on 26/12/16.
 */


import usuario.app.sistemadecadastro.model.Contact;


public interface ContactsContract {
    // Implementada pela activity, pela fragment, pelo adapter - atualização da tela.
    // mostrar mensagem de erro e status
    interface View {

    }

    // interface que gerencia as ações que o usuário requisita para a view
    // exemplo - salvar dados, adicionar dados, excluir dados.
    interface  UserAction {
        void selectContact(Contact contact);
    }
}
