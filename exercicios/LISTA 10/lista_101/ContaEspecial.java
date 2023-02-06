package lista_101;
public class ContaEspecial extends ContaBancaria{
    protected float limite;

    public ContaEspecial(String n, int numero,float s,float l) {
        super(n,numero,s);
        this.limite=l;
    }

    public void sacar_especial(float valor) {
        float novo_saldo=0;
        if(valor<=getSaldo()) {
            novo_saldo=getSaldo()-valor;
            setSaldo(novo_saldo);
            System.out.println("Saque efetuado!");
        }
        else {
            if(valor<=(getSaldo()+getLimite())) {
                novo_saldo=getSaldo()-valor;
                setSaldo(novo_saldo);
                System.out.println("Saque efetuado com utilização do seu limite!");
            }
        }
    }

    public float getLimite() {
        return this.limite;
    }
    public void setLimite(float l) {
        this.limite=l;
    }
}