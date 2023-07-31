public class ListaDuplaCircular<T> {
    private No<T> ref;
    private int tamanho;

    public ListaDuplaCircular() {
        this.ref = null;
        this.tamanho = 0;
    }
    
    public void adicionar(int elemento) {
        No<T> novoNo = new No<T>(elemento);
        if (listaVazia()) {
            novoNo.setAntes(novoNo);
            novoNo.setDepois(novoNo);
            ref = novoNo;
            tamanho++;
        }
        else {
            if(novoNo.getInfo() <= ref.getInfo()) {
                if (tamanho == 1) {
                    ref.setAntes(novoNo);
                    ref.setDepois(novoNo);
                    novoNo.setAntes(ref);
                    novoNo.setDepois(ref);
                    ref = novoNo;
                    tamanho++;
                }
                else {
                    ref.getAntes().setDepois(novoNo);
                    novoNo.setAntes(ref.getAntes());
                    novoNo.setDepois(ref);
                    ref.setAntes(novoNo);
                    ref = novoNo;
                    tamanho++;
                }  
            }
            else if(novoNo.getInfo() >= ref.getAntes().getInfo()) {
                if (tamanho == 1) {
                    ref.setAntes(novoNo);
                    ref.setDepois(novoNo);
                    novoNo.setAntes(ref);
                    novoNo.setDepois(ref);
                    tamanho++;
                }
                else {
                    ref.getAntes().setDepois(novoNo);
                    novoNo.setAntes(ref.getAntes());
                    novoNo.setDepois(ref);
                    ref.setAntes(novoNo);
                    tamanho++;
                }
            }
            else {
                No auxiliarAntes = ref;
                No auxiliar = ref.getDepois();
                while (auxiliar != ref) {
                    if (novoNo.getInfo() <= auxiliar.getInfo()) {
                        auxiliarAntes.setDepois(novoNo);
                        auxiliar.setAntes(novoNo);
                        novoNo.setAntes(auxiliarAntes);
                        novoNo.setDepois(auxiliar);
                        tamanho++;
                        break;
                    }
                    else {
                        auxiliarAntes = auxiliar;
                        auxiliar = auxiliar.getDepois();
                    }
                }
            }
        }
    }

    public void remover(int elemento) {
        if (listaVazia()) {
            System.out.println("A lista está vazia!");
        }
        else if (tamanho == 1) {
            if (elemento == ref.getInfo()) {
                ref = null;
                tamanho--;
            }
            else {
                return;
            }
        }
        else {
            No auxiliarAntes = ref;
            No auxiliar = ref.getDepois();
            if (elemento == ref.getInfo()) {
                ref.getAntes().setDepois(auxiliar);
                auxiliar.setAntes(ref.getAntes());
                ref = auxiliar;
                tamanho--;
            }
            else if (elemento == ref.getAntes().getInfo()) {

            }
        }
    }

    public Boolean listaVazia() {
        return tamanho == 0;
    }

    public void imprimir() {
        if(listaVazia()) {
            System.out.println("[]");
        }
        else if (tamanho == 1) {
            System.out.println("[" + ref.getInfo() + "]");
        }
        else {
            No aux = ref.getDepois();
            System.out.print("[" + ref.getInfo() + ", ");
            while (aux != ref) {
                if (aux.getDepois() != ref) {
                    System.out.print(aux.getInfo() + ", ");
                    aux = aux.getDepois();
                }
                else {
                    System.out.print(aux.getInfo());
                    aux = aux.getDepois();
                }
            }
            System.out.println("]");
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
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}