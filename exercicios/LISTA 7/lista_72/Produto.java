package lista_72;
public class Produto {
    public String nome;
    public int codigo;
    public float preco;
    public int quantidade;

    public Produto(String n,int c,float p,int q) {
        this.nome=n;
        this.codigo=c;
        this.preco=p;
        this.quantidade=q;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String n) {
        this.nome=n;
    }

    public int getCodigo() {
        return this.codigo;
    }
    public void setCodigo(int c) {
        this.codigo=c;
    }

    public float getPreco() {
        return this.preco;
    }
    public void setPreco(float p) {
        this.preco=p;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
    public void setQuantidade(int q) {
        this.quantidade=q;
    }
}