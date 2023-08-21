public class No<T> {
    private int info;
    private No<T> esquerda;
    private No<T> direita;

    public No(int info) {
        this.info = info;
        this.esquerda = null;
        this.direita = null;
    }

    public No(int info, No<T> esquerda, No<T> direita) {
        this.info = info;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }

    public No<T> getEsquerda() {
        return esquerda;
    }
    public void setEsquerda(No<T> esquerda) {
        this.esquerda = esquerda;
    }

     public No<T> getDireita() {
        return direita;
    }
    public void setDireita(No<T> direita) {
        this.direita = direita;
    }
}