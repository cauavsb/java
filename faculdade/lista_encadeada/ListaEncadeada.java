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
            No aux = ref;
            novoNo.setProx(aux);
            ref = novoNo;
            tamanho++;
        }
    }

    public void remover(int elemento) {
        if(listaVazia()) {
            return;
        }

        else if (elemento == ref.getInfo()) {
            ref = ref.getProx();
            tamanho--;
        }

        else {
            No anterior = ref;
            No atual = ref.getProx();
            for(int i=0; i < tamanho - 1; i++) {
                if (atual.getProx() != null) {
                    if (atual.getInfo() == elemento) {
                        anterior.setProx(atual.getProx());
                        tamanho--;
                        if (atual.getProx().getInfo() != elemento) {
                            break;
                        }
                    }
                    else {
                        anterior = atual;
                        atual = atual.getProx();
                    }
                }
                else {
                    anterior.setProx(null);
                    tamanho--;
                }
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
                tamanho ++;
            }

            else {
                No anterior = ref;
                No atual = ref.getProx();
                for(int i=0; i < tamanho - 1; i++) {
                    if(atual != null) {
                        if (elemento <= atual.getInfo()) {
                            anterior.setProx(novoNo);
                            novoNo.setProx(atual);
                            tamanho++;
                            break;
                        }
                        else {
                            anterior = atual;
                            atual = atual.getProx();
                        }
                    }
                    
                }
                atual = novoNo;
                anterior.setProx(atual);
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