import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nome;

    @Column
    private int idade;

    @ManyToOne(fetch = FetchType.EAGER)
    private Estado estado;
    //Eager e Lazy
    //O eager ele ja carrega automaticamente
    //o lazy quando se da um get


    public Aluno(int id, String nome, int idade, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.estado = estado;
    }

        public Aluno(String nome, int idade, Estado estado) {
            this.nome = nome;
            this.idade = idade;
            this.estado = estado;
        }

        public Aluno(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", estado='" + estado + '\'' +
                '}';
    }
}

