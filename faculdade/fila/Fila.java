public class Fila<T> {
    private No<T> inicio;
    private No<T> fim;

    public Fila() {
        this.inicio = null;
        this.fim = null;
    }

    public void insere(String info) {
        No<T> novoNo = new No<>(info);
        if (filaVazia()) {
            novoNo.setProx(null);
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
            System.out.println("Fila vazia!");
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
            System.out.println("Fila vazia!");
        }
        else {
            No<T> aux = inicio;
            System.out.print("[");
            while (aux.getProx() != null) {
                System.out.print(aux.getInfo() + " -> ");
                aux = aux.getProx();
            }
            System.out.println(aux.getInfo() + "]");
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