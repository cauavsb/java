public class No<T> {
    private int info;
    private No<T> esquerda;
    private No<T> direita;
    private int fb;

    public No(int info) {
        this.info = info;
        this.esquerda = null;
        this.direita = null;
        this.fb = 0;
    }

    public No(int info, No<T> esquerda, No<T> direita, int fb) {
        this.info = info;
        this.esquerda = esquerda;
        this.direita = direita;
        this.fb = fb;
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
    public int getFb() {
        return fb;
    }
    public void setFb(int fb) {
        this.fb = fb;
    }
}