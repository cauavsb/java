package lista_73;
public class Conta {
    public String numero;
    public int agencia;
    public String cliente;
    public int cpf;
    public float saldo;

    public Conta(String n,int a,String c,int numero_cpf,float s) {
        this.numero=n;
        this.agencia=a;
        this.cliente=c;
        this.cpf=numero_cpf;
        this.saldo=s;
    }

    public String getNumero() {
        return this.numero;
    }
    public void setNumero(String n) {
        this.numero=n;
    }

    public int getAgencia() {
        return this.agencia;
    }
    public void setAgencia(int a) {
        this.agencia=a;
    }

    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float s) {
        this.saldo=s;
    }

    public String getCliente() {
        return this.cliente;
    }
    public void setCliente(String c) {
        this.cliente=c;
    }

    public int getCpf() {
        return this.cpf;
    }
    public void setCpf(int numero_cpf) {
        this.cpf=numero_cpf;
    }
}