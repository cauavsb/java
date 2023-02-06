package lista_63;
public class Imc {
    public String nome;
    public float peso;
    public float altura;
    public float indice;

    public Imc(String n,float p,float h, float i) {
        this.nome=n;
        this.peso=p;
        this.altura=h;
        this.indice=i;
    }

    public float getPeso() {
        return this.peso;
    }
    public void setPeso(float p) {
        this.peso=p;
    }
    public float getAltura() {
        return this.altura;
    }
    public void setAltura(float h) {
        this.altura=h;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String n) {
        this.nome=n;
    }
    public float getIndice() {
        return this.indice;
    }
    public void setIndice(float i) {
        this.indice=i;
    }
}
