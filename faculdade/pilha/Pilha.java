package pilha;

public class Pilha {
    private ListaEncadeada pilha;

    public Pilha() {
        this.pilha = new ListaEncadeada<>();
    }

    public void push(int info) {
        pilha.adicionarTopo(info);
    }

    public void pop() {
        if (pilhaVazia()) {
            System.out.println("[]");
        }
        else {
            pilha.removerTopo(pilha.getRef().getInfo());
        }
    }

    public void topoPilha() {
        if (pilhaVazia()) {
            System.out.println("[]");
        }
        else {
            
            System.out.println(pilha.getRef().getInfo());
        }
    }

    public void imprimir() {
        if (pilhaVazia()) {
            System.out.println("[]");
        }
        else {
            No aux = pilha.getRef();
            System.out.print("[");
            while (aux != null) {
                System.out.print(aux.getInfo());
                aux = aux.getProx();
                if (aux != null) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public boolean pilhaVazia() {
        return pilha.getTamanho() == 0;
    }

    public int tamanhoPilha() {
        return pilha.getTamanho();
    }
}