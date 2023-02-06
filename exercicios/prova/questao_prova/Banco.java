package questao_prova;
public class Banco {
    protected int numero_agencia;
    protected String nome_agencia;

    public Banco(int numero_agencia, String nome_agencia) {
        this.numero_agencia=numero_agencia;
        this.nome_agencia=nome_agencia;
    }

    public int getNumero_agencia() {
        return this.numero_agencia;
    }
    public void setNumero_agencia(int numero_a) {
        this.numero_agencia=numero_a;
    }

    public String getNome_agencia() {
        return this.nome_agencia;
    }
    public void setNome_agencia(String nome_a) {
        this.nome_agencia=nome_a;
    }
}