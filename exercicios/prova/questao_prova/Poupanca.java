package questao_prova;
public class Poupanca extends Conta {
    protected float juros;
    
    public Poupanca(int numero, Banco dados_banco, Cliente dados_cliente,float saldo,float juros) {
        super(numero,dados_banco,dados_cliente,saldo);
        this.juros=juros;
    }

    public float getJuros() {
        return this.juros;
    }
    public void setJuros(float j) {
        this.juros=j;
    }

    public float renderJuros(float valor, float taxa) {
        return valor+(valor*taxa);
    }
}