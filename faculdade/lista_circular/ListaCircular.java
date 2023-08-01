public class ListaCircular<T> {
    
    private No<T> ref;
    private int tamanho;

    public void ListaCircular() {
        this.ref = null;
    }

    public void adicionar(int info) {
        No novoNo = new No(info);
        if (ref == null) {
            novoNo.setProximo(novoNo);
            ref = novoNo;
            tamanho++;
        }
        else {
            if (novoNo.getInfo() >= ref.getInfo()) {
                novoNo.setProximo(ref.getProximo()); 
                ref.setProximo(novoNo);
                ref = novoNo;
                tamanho++;
            }
            else if (novoNo.getInfo() <= ref.getProximo().getInfo()) {
                novoNo.setProximo(ref.getProximo());
                ref.setProximo(novoNo);
                tamanho++;
            }
            else {
                No primeiroNo = ref.getProximo();
                No noAuxiliar = primeiroNo;
                while (noAuxiliar != ref) {
                    No proximo = noAuxiliar.getProximo();
                    if (proximo.getInfo() >= novoNo.getInfo()) {
                        novoNo.setProximo(proximo);
                        noAuxiliar.setProximo(novoNo);
                        tamanho++;
                        return;
                    }
                    noAuxiliar = proximo;
                }
            }
        }
    }

    public void remover(int info) {
        if (tamanho == 0) {
          return;
        }
      
        No atual = ref.getProximo();
        No ex = ref;
      
        while (atual != ref) {
            if (atual.getInfo() == info) {
                ex.setProximo(atual.getProximo());
                atual = atual.getProximo();
                tamanho--;
                if (atual.getInfo() != info) {
                    return;
                }
            } 
            else {
                ex = atual;
                atual = atual.getProximo();
            }
        }
      
        if (atual.getInfo() == info) {
            if (tamanho == 1) {
                ref = null;
                tamanho = 0;
            }
            else if (tamanho == 2) {
                ref = atual.getProximo();
                atual.getProximo().setProximo(ref);
                tamanho--;
            }
            else {
                ref = atual.getProximo();
                tamanho--;
            }
        }
    }

    public void imprimir() {
        if (ref == null) {
            System.out.println("[]");
            return;
        }
        else {
            StringBuilder retorno = new StringBuilder("[");
            No noAuxiliar = ref.getProximo();
            while (noAuxiliar != ref) {
                retorno.append(noAuxiliar.getInfo()).append(", ");
                noAuxiliar = noAuxiliar.getProximo();
            }
            retorno.append(ref.getInfo()).append("]");
            System.out.println(retorno.toString());
        }
    }

    public Boolean listaVazia() {
        if(ref == null) {
          return true;
        }
        else {
            return false;
        }
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
}