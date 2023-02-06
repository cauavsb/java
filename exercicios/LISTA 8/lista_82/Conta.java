package lista_82;
public class Conta {
    public int telefone;
    public int numero;
    public String agencia;
    public String cliente;
    public String cpf;
    public float saldo;

    public Conta(int t,int n,String a,String c,String numero_cpf,float s) {
        this.telefone=t;
        this.numero=n;
        this.agencia=a;
        this.cliente=c;
        this.cpf=numero_cpf;
        this.saldo=s;
    }

    public int getTelefone() {
        return this.telefone;
    }
    public void setTelefone(int t) {
        this.telefone=t;
    }

    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int n) {
        this.numero=n;
    }

    public String getAgencia() {
        return this.agencia;
    }
    public void setAgencia(String a) {
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

    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String numero_cpf) {
        this.cpf=numero_cpf;
    }
}