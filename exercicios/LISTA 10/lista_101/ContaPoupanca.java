package lista_101;
public class ContaPoupanca extends ContaBancaria{
    protected float taxa_rendimento;

    public ContaPoupanca(String n, int numero,float s,float taxa) {
        super(n,numero,s);
        this.taxa_rendimento=taxa;
    }

    public void calcularNovoSaldo() {
        super.saldo = saldo*taxa_rendimento;
    }

    public float getTaxa_rendimento() {
        return this.taxa_rendimento;
    }
    public void setTaxa_rendimento(float taxa) {
        this.taxa_rendimento=taxa;
    }
}