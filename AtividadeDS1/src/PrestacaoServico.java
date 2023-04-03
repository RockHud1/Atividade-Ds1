
import java.util.Date;


public class PrestacaoServico extends Juridica{
    private Date contratoInicio;
    private Date contratoFim;

    public PrestacaoServico() {
    }

    public PrestacaoServico(Date contratoInicio, Date contratoFim, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    @Override
    public String toString() {
        return "\nCNPJ: " + super.cnpj+
                "\nInscrição Estadual: " + super.inscricaoEstadual+
                "\nId: " + super.id+
                "\nNome: " + super.nome+
                "\nTelefone: " + super.telefone+
                "\nEmail: " + super.email+
                "\nInicio do Contrato: " + this.contratoInicio+
                "\nEncerramento do Contrato: " + this.contratoFim;
    }
      

    public Date getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(Date contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public Date getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(Date contratoFim) {
        this.contratoFim = contratoFim;
    }
    
    
}
