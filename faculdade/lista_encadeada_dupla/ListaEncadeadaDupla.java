public class ListaEncadeadaDupla {
    private No ref;

    public ListaEncadeadaDupla() {
        this.ref = null;
    }

    public void insere(int info) {
        No novoNo = new No(info);
        if (ref == null) {
            ref = novoNo;
            return;
        }

        else if (info <= ref.getInfo()) {
            novoNo.setSucessor(ref);
            ref.setAnterior(novoNo);
            ref = novoNo;
            return;
        }

        else {
            No aux = ref;
            while (aux.getSucessor() != null) {
                if (info <= aux.getSucessor().getInfo()) {
                    aux.getSucessor().setAnterior(novoNo);
                    novoNo.setAnterior(aux);
                    novoNo.setSucessor(aux.getSucessor());
                    aux.setSucessor(novoNo);
                    return;
                }
                else {
                    aux = aux.getSucessor();
                }
            }

            if (info <= aux.getInfo()) {
                novoNo.setAnterior(aux.getAnterior());
                novoNo.setSucessor(aux);
                aux.getAnterior().setAnterior(novoNo);
                aux.setAnterior(novoNo);
                return;
            }
            else {
                aux.setSucessor(novoNo);
                novoNo.setAnterior(aux);
                return;
            }
        }
    }

    public void remove(int info) {
        if (listaVazia()) {
            System.out.println("A lista está vazia!");
        }
        else if (info < ref.getInfo()) {
            return;
        }
        else {
            No aux = ref;
            while (aux.getSucessor() != null) {
                if (aux == ref && aux.getInfo() == info) {
                    ref = aux.getSucessor();
                    ref.setAnterior(null);
                    if (ref.getInfo() != info) {
                        return;
                    }
                    else {
                        aux = ref;
                    }
                }
                else if (aux.getInfo() == info) {
                    aux.getAnterior().setSucessor(aux.getSucessor());
                    aux.getSucessor().setAnterior(aux.getAnterior());
                    if (aux.getSucessor().getInfo() != info) {
                        return;
                    }
                    else {
                        aux = aux.getSucessor();
                    }
                }
                else {
                    if (info < aux.getSucessor().getInfo()) {
                        return;
                    }
                    else {
                        aux = aux.getSucessor();
                    }
                }
            }

            if (aux == ref && ref.getInfo() == info) {
                ref = null;
                return;
            }
            else if (aux.getInfo() == info) {
                aux.getAnterior().setSucessor(null);
                return;
            }
        }
    }

    public void imprime() {
        if (listaVazia()) {
            System.out.println("[]");
        }
        else {
            System.out.print("[" + ref.getInfo());
            No aux = ref;
            while (aux.getSucessor() != null) {
                System.out.print(", " + aux.getSucessor().getInfo());
                aux = aux.getSucessor();
            }
            System.out.print("] -> ");
            System.out.print("[" + aux.getInfo());
            while (aux != ref) {
                System.out.print(", " + aux.getAnterior().getInfo());
                aux = aux.getAnterior();
            }
            System.out.println("]");
        }
    }
    
    public Boolean listaVazia() {
        return ref == null;
    }

    public No getRef() {
        return ref;
    }
    public void setRef(No ref) {
        this.ref = ref;
    }
}