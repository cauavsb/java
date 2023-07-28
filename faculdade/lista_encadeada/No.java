package lista_encadeada;

public class No<T> {
    private int info;
    private No<T> prox;

    public No(int info) {
        this.info = info;
        this.prox = null;
    }

    public No(int info, No<T> prox) {
        this.info = info;
        this.prox = prox;
    }

    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }

    public No<T> getProx() {
        return prox;
    }
    public void setProx(No<T> prox) {
        this.prox = prox;
    }  
}