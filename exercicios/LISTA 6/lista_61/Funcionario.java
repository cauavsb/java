package lista_61;
public class Funcionario {
    public String nome;
    public float salario;
    public String nome_alta_renda;
    public float alta_renda;

    public Funcionario(String n, float s) {
        this.nome=n;
        this.salario=s;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String n) {
        this.nome=n;
    }
    public float getSalario() {
        return this.salario;
    }
    public void setSalario(float s) {
        this.salario=s;
    }

    public String nome_alta_renda() {
    	return this.nome_alta_renda=getNome();
    }
    public float alta_renda() {
    	return this.alta_renda=getSalario();
    }
}