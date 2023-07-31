public class No<T> {

    private int info;
    private No<T> proximo;

    public No(int info) {
        this.info = info;
    }

    public No(int info, No<T> proximo) {
        this.info = info;
        this.proximo = proximo;
    }

    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }

    public No<T> getProximo() {
        return proximo;
    }
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
}