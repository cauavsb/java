package questao_prova;
public class Cliente {
    protected String nome;
    protected String cpf;

    public Cliente(String nome, String cpf) {
        this.nome=nome;
        this.cpf=cpf;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String n) {
        this.nome=n;
    }

    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String num_cpf) {
        this.cpf=num_cpf;
    }
}