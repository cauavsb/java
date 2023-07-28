package lista_encadeada;

public class ListaEncadeada<T> {
    private No<T> ref;
    private int tamanho;

    public ListaEncadeada() {
        this.ref = null;
        this.tamanho = 0;
    }

    public void adicionar(int elemento) {
        if(tamanho == 0) {
            No novoNo = new No(elemento);
            ref = novoNo;
            tamanho++;
        }
        else {
            No novoNo = new No(elemento);
            No aux = ref;
            novoNo.setProx(aux);
            ref = novoNo;
            tamanho++;
        }
    }

    public void adicionarOrdenado(int elemento) {
        No novoNo = new No(elemento);
        if(tamanho == 0) {
            ref = novoNo;
            tamanho++;
        }
        
        else if(tamanho == 1) {
            if(elemento <= ref.getInfo()) {
                novoNo.setProx(ref);
                ref = novoNo;
                tamanho++; 
            }
            else {
                ref.setProx(novoNo);
                tamanho++;
            }   
        }

        else {
            No anterior = ref;
            No atual = ref.getProx();
            for(int i=0; i < tamanho - 1; i++) {
                if(atual != null) {
                    if (elemento <= atual.getInfo()) {
                        anterior.setProx(novoNo);
                        novoNo.setProx(atual);
                        break;
                    }
                    else {
                        anterior = atual;
                        atual = atual.getProx();
                    }
                }
            }
            atual.setProx(novoNo);
        }
    }

    public No<T> getRef() {
        return ref;
    }
    private void setRef(No<T> ref) {
        this.ref = ref;
    }
    
    public int getTamanho() {
        return tamanho;
    }
    private void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void imprimir() {
        if (ref == null) {
            System.out.println("A lista está vazia.");
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
}