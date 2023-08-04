public class No {
    private int info;
    private No anterior;
    private No sucessor;

    public No(int info) {
        this.info = info;
        this.anterior = null;
        this.sucessor = null;
    }

    public No(int info, No anterior, No sucessor) {
        this.info = info;
        this.anterior = anterior;
        this.sucessor = sucessor;
    }

    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public No getSucessor() {
        return sucessor;
    }

    public void setSucessor(No sucessor) {
        this.sucessor = sucessor;
    }
}