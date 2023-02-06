package lista_112;
public class Pessoa {
    private String nome;
    private String data_nascimento;

    public Pessoa(String nome, String data_nascimento) {
        this.nome=nome;
        this.data_nascimento=data_nascimento;
    }

    public void info() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Data de nascimento: "+this.data_nascimento);
    };

    public void setNome(String nome) {
        this.nome=nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento=data_nascimento;
    }
    public String getData_nascimento() {
        return this.data_nascimento;
    }
}