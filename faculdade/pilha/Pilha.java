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
        pilha.remover(getTopo());
    }

    public int getTopo() {
        return pilha.getRef().getInfo();
    }
}