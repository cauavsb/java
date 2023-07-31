package lista_encadeada;

public class ListaEncadeada<T> {
    private No<T> ref;
    private int tamanho;

    public ListaEncadeada() {
        this.ref = null;
        this.tamanho = 0;
    }

    public void adicionar(int elemento) {
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

    public void remover(int elemento) {
        if(listaVazia()) {
            return;
        }

        else if (tamanho == 1) {
            if (elemento == ref.getInfo()) {
                ref = ref.getProx();
                tamanho--;
            }
        }
        
        else {
            No anterior = ref;
            No atual = ref.getProx();
            while (atual != null) {
                if (atual.getInfo() == elemento) {
                    anterior.setProx(atual.getProx());
                    tamanho--;
                    if (atual.getProx().getInfo() != elemento) {
                        if (ref.getInfo() == elemento) {
                            ref = ref.getProx();
                            tamanho--;
                        }
                        return;
                    }
                }
                if (atual.getProx() == null && elemento == atual.getInfo()) {
                    anterior.setProx(null);
                }
                atual = atual.getProx();
            }
        }
    }

    public void adicionarOrdenado(int elemento) {
        No novoNo = new No(elemento);
        if(listaVazia()) {
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
            if(elemento <= ref.getInfo()) {
                novoNo.setProx(ref);
                ref = novoNo;
                tamanho++;
            }

            else {
                No anterior = ref;
                No atual = ref.getProx();
                while (atual != null) {
                    if (elemento <= atual.getInfo()) {
                        anterior.setProx(novoNo);
                        novoNo.setProx(atual);
                        tamanho++;
                        return;
                    }
                    else {
                        anterior = atual;
                        atual = atual.getProx();
                    }
                }
                anterior.setProx(novoNo);
                tamanho++;
            }
        }
    }

    public void imprimir() {
        if (listaVazia()) {
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

    public Boolean listaVazia() {
        return tamanho == 0;
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
}