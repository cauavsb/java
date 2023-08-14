public class No<T> {
    private String info;
    private No<T> prox;

    public No(String info) {
        this.info = info;
        this.prox = null;
    }

    public No(String info, No<T> prox) {
        this.info = info;
        this.prox = prox;
    }
    
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

    public No<T> getProx() {
        return prox;
    }
    public void setProx(No<T> prox) {
        this.prox = prox;
    }
}