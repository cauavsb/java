package questao_prova;
public class Conta {
    protected int numero;
    protected Banco dados_banco;
    protected Cliente dados_cliente;
    protected float saldo;
    
    public Conta(int numero, Banco dados_banco, Cliente dados_cliente,float saldo) {
        this.numero=numero;
        this.dados_banco=dados_banco;
        this.dados_cliente=dados_cliente;
        this.saldo=saldo;
    }

    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int n) {
        this.numero=n;
    }

    public Banco getDados_banco() {
        return this.dados_banco;
    }
    public void setDados_banco(Banco dados_b) {
        this.dados_banco=dados_b;
    }

    public Cliente getDados_cliente() {
        return this.dados_cliente;
    }
    public void setDados_cliente(Cliente dados_c) {
        this.dados_cliente=dados_c;
    }

    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float s) {
        this.saldo=s;
    }
}