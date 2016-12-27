package usuario.app.sistemadecadastro.model;

public class Contact {

    private String nome;
    private String endereco;
    private String telefone;
    public Contact(String nome, String endereco, String telefone)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEndereco() { return endereco; }

}
