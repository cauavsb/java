public class No<T> {
    private No<T> esquerda;
    private No<T> direita;
    private int info;
    private int fb;

    public No(int info) {
        this.esquerda = null;
        this.direita = null;
        this.info = info;
        this.fb = 0;
    }

    public No(No<T> esquerda, No<T> direita, int info, int fb) {
        this.esquerda = esquerda;
        this.direita = direita;
        this.info = info;
        this.fb = fb;
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
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    public int getFb() {
        return fb;
    }
    public void setFb(int fb) {
        this.fb = fb;
    }
}