package lista_64;
public class Imposto {
    public String nome;
    public float salario;

    public Imposto(String n,float s) {
        this.nome=n;
        this.salario=s;
    }

    public float getSalario() {
        return this.salario;
    }
    public void setSalario(float s) {
        this.salario=s;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String n) {
        this.nome=n;
    }
}