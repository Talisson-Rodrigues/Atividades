import java.util.Date;

//   classe Pessoa
/* 
* classe que representa uma pessoa
*/
class Pessoa {
    // caracteristícas (atributos)
    private String nome;
    private int cpf;
    private float saldoBancario;
    private Date dataNascimento; 
    private String endereco;//camel case

    //getters e setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 100) {
            System.out.println("Nome muito grande");
            return;
        }
        this.nome = nome;
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public float getSaldoBancario() {
        return this.saldoBancario;
    }

    public void setSaldoBancario(float saldoBancario) {
        this.saldoBancario = saldoBancario;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    //comportamentos (metodos)

    void andar() {
        System.out.println( this.nome + " Andou...");
    }

    void falar() {
        System.out.println("Falou...");
    }

    void comer() {
        System.out.println("Comeu...");
    }

    void dormir() {
        System.out.println("Dormiu...");
    }
}