public class ListaEncadeada<T> {
    private No<T> ref;
    private int tamanho;

    public ListaEncadeada() {
        this.ref = null;
        this.tamanho = 0;
    }

    public void adicionar(String elemento) {
        if(listaVazia()) {
            No novoNo = new No(elemento);
            ref = novoNo;
            tamanho++;
        }
        else {
            No novoNo = new No(elemento);
            novoNo.setProx(ref);
            ref = novoNo;
            tamanho++;
        }
    }

    public void remover(String elemento) {
        if (listaVazia()) {
            return;
        }
        
        else {
            No atual = ref;
            while (atual.getProx() != null) {
                if (atual.getProx().getInfo().equals(elemento)) {
                    atual.setProx(atual.getProx().getProx());
                    tamanho--;
                }
                else {
                    atual = atual.getProx();
                }
            }
            
            if (ref.getInfo().equals(elemento)) {
                if (tamanho == 1) {
                    ref = null;
                    tamanho = 0;
                }
                else {
                    ref = ref.getProx();
                    tamanho--;
                }
            }
        }
    }

    public void imprimir() {
        if (listaVazia()) {
            System.out.println("[]");
        } 
        else {
            No aux = ref;
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

    public Boolean listaVazia() {
        return tamanho == 0;
    }

    public No<T> getRef() {
        return ref;
    }
    public void setRef(No<T> ref) {
        this.ref = ref;
    }
    
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}