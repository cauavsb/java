package lista_101;
public class ContaBancaria {
    protected String nome;
    protected int num_conta;
    protected float saldo;

    public ContaBancaria(String n, int numero,float s) {
        this.nome=n;
        this.num_conta=numero;
        this.saldo=s;
    }

    public void sacar(float valor) {
        float novo_saldo=0;
        if(valor<=getSaldo()) {
            novo_saldo=getSaldo()-valor;
            setSaldo(novo_saldo);
            System.out.println("Saque efetuado!");
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(float valor) {
        float pos_deposito=getSaldo()+valor;
        setSaldo(pos_deposito);
        System.out.println("Depósito realizado com sucesso!");
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String n) {
        this.nome=n;
    }

    public int getNumero_conta() {
        return this.num_conta;
    }
    public void setNumero_conta(int numero) {
        this.num_conta=numero;
    }

    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float s) {
        this.saldo=s;
    }
}