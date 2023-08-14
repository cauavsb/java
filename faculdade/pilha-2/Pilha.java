public class Pilha<T> {
    private No<T> topo;

    public Pilha() {
        this.topo = null;
    }

    public void push(String info) {
        No novo = new No(info);
        if (pilhaVazia()) {
            topo = novo;
        } 
        else {
            novo.setProx(topo);
            topo = novo;
        }
    }

    public void pop() {
        if (pilhaVazia()) {
            System.out.println("Pilha vazia!");
            return;
        }
        else {
            topo = topo.getProx();
        }
    }

    public void imprime() {
        if (pilhaVazia()) {
            System.out.println("Pilha vazia!");
            return;
        }
        else {
            No aux = topo;
            System.out.print("[");
            while (aux.getProx() != null) {
                System.out.print(aux.getInfo() + " -> ");
                aux = aux.getProx();
            }
            System.out.println(aux.getInfo() + "]");
        }
    }

    public Boolean pilhaVazia() {
        return topo == null;
    }

    public No<T> getTopo() {
        return topo;
    }
    public void setTopo(No<T> topo) {
        this.topo = topo;
    }
}