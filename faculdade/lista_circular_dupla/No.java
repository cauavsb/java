public class No<T> {
    private int info;
    private No<T> antes;
    private No<T> depois;

    public No(int info) {
        this.info = info;
        this.antes = null;
        this.depois = null;
    }

    public No(int info, No<T> antes, No<T> depois) {
        this.info = info;
        this.antes = antes;
        this.depois = depois;
    }

    public int getInfo() {
        return info;
    }

    public No<T> getAntes() {
        return antes;
    }
    void setAntes(No<T> antes) {
        this.antes = antes;
    }

    public No<T> getDepois() {
        return depois;
    }
    public void setDepois(No<T> depois) {
        this.depois = depois;
    }
}