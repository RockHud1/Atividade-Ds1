
public class Fornecedor extends Juridica{
    private String Produto;

    public Fornecedor() {
    }

    public Fornecedor(String Produto, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereco);
        this.Produto = Produto;
    }

    @Override
    public String toString() {
        return "\nCNPJ: " + super.cnpj+
                "\nInscrição Estadual: " + super.inscricaoEstadual+
                "\nId: " + super.id+
                "\nNome: " + super.nome+
                "\nTelefone: " + super.telefone+
                "\nEmail: " + super.email+
                "\nProduto: "+ this.Produto;
    }
    
    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }
    
    
}
