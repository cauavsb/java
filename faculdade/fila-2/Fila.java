public class Fila<T> {
    private No<T> inicio;
    private No<T> fim;

    public Fila() {
        this.inicio = null;
        this.fim = null;
    }

    public void insere(T elemento) {
        No<T> novoNo = new No<>(elemento);
        if (filaVazia()) {
            inicio = novoNo;
            fim = novoNo;
        }
        else {
            fim.setProx(novoNo);
            fim = novoNo;
        }
    }

    public void remove() {
        if (filaVazia()) {
            System.out.println("A fila está vazia!");
        }
        else if (inicio == fim) {
            inicio = null;
            fim = null;
        }
        else {
            inicio = inicio.getProx();
        }
    }

    public void imprime() {
        if (filaVazia()) {
            System.out.println("FILA VAZIA");
        }
        else {
            No<T> atual = inicio;
            System.out.print("[");
            while (atual.getProx() != null) {
                System.out.print(atual.getElemento() + ", ");
                atual = atual.getProx();
            }
            System.out.println(atual.getElemento() + "]");
        }
    }

    public Boolean filaVazia() {
        return inicio == null;
    }

    public No<T> getInicio() {
        return inicio;
    }
    public void setInicio(No<T> inicio) {
        this.inicio = inicio;
    }
    public No<T> getFim() {
        return fim;
    }
    public void setFim(No<T> fim) {
        this.fim = fim;
    }
}