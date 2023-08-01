package lista_encadeada_ordenada;

public class ListaEncadeada<T> {
    private No<T> ref;
    private int tamanho;

    public ListaEncadeada() {
        this.ref = null;
        this.tamanho = 0;
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

    public void removerOrdenado(int elemento) {
        if(listaVazia()) {
            return;
        }

        else if (elemento == ref.getInfo()) {
            while (elemento == ref.getInfo()) {
                ref = ref.getProx();
                tamanho--;
                if (ref == null) {
                    return;
                }
            }
            return;
        }
        
        else {
            No atual = ref;
            while (atual.getProx() != null) {
                if (atual.getProx().getInfo() == elemento) {
                    atual.setProx(atual.getProx().getProx());
                    tamanho--;
                    if (atual.getProx() != null) {
                        if (atual.getProx().getInfo() != elemento) {
                        return;
                        }
                    } 
                }
                else {
                    atual = atual.getProx();
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