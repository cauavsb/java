public class No<T> {
    private int info;
    private No<T> direita;
    private No<T> esquerda;

    public No(int info) {
        this.info = info;
        this.direita = null;
        this.esquerda = null;
    }

    public No(int info, No<T> direita, No<T> esquerda) {
        this.info = info;
        this.direita = direita;
        this.esquerda = esquerda;
    }
    
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    
    public No<T> getDireita() {
        return direita;
    }
    public void setDireita(No<T> direita) {
        this.direita = direita;
    }
    
    public No<T> getEsquerda() {
        return esquerda;
    }
    public void setEsquerda(No<T> esquerda) {
        this.esquerda = esquerda;
    }
}