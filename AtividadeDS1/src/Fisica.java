
import java.util.Date;


public abstract class Fisica extends Pessoa{
    protected EstadoCivil estadoCivil;
    protected Genero genero;
    protected Date dataNascimento;

    public Fisica() {
    }

    public Fisica(EstadoCivil estadoCivil, Genero genero, Date dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        this.estadoCivil = estadoCivil;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }




    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    
}
