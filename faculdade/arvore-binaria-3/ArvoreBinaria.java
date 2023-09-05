public class ArvoreBinaria<T> {
    private No<T> raiz;

    public void inserir(int info) {
        raiz = inserir(raiz, info);
    }

    public No<T> inserir(No<T> atual, int info) {
        if (atual == null) {
            return new No<>(info);
        }
        else if (info < atual.getInfo()) {
            atual.setEsquerda(inserir(atual.getEsquerda(), info));
        }
        else if (info > atual.getInfo()) {
            atual.setDireita(inserir(atual.getDireita(), info));
        }

        return atual;
    }

    public void buscarElemento(No<T> atual, int info) {
        if (buscar(atual, info) != null) {
            System.out.println("Elemento encontrado!");
        }
        else {
            System.out.println("Elemento não encontrado!");
        }
    }

    public No<T> buscar(No<T> atual, int info) {
        if (atual == null) {
            return null;
        }
    
        if (info == atual.getInfo()) {
            return atual;
        } 
        else if (info < atual.getInfo()) {
            return buscar(atual.getEsquerda(), info);
        } 
        else {
            return buscar(atual.getDireita(), info);
        }
    }

    public void buscarMin(No<T> atual) {
        No<T> bm = buscarMinimo(atual);
        if (bm != null) {
            System.out.println("O mínimo é " + bm.getInfo());
        }
        else {
            System.out.println("A árvore está vazia!");
        }
    }

    public No<T> buscarMinimo(No<T> atual) {
        if (atual == null) {
            return null;
        }

        if (atual.getEsquerda() == null) {
            return atual;
        }

        return buscarMinimo(atual.getEsquerda());
    }

    public void buscarMax(No<T> atual) {
        No<T> bm = buscarMaximo(atual);
        if (bm != null) {
            System.out.println("O máximo é " + bm.getInfo());
        }
        else {
            System.out.println("A árvore está vazia!");
        }
    }

    public No<T> buscarMaximo(No<T> atual) {
        if (atual == null) {
            return null;
        }
        
        if (atual.getDireita() == null) {
            return atual;
        }

        return buscarMaximo(atual.getDireita());
    }

    public void emOrdem(No<T> atual) {
        if (atual != null) {
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getInfo());
            emOrdem(atual.getDireita());
        }
    }

    public void buscarSuc(int info) {
        No<T> bs = buscarSucessor(info);
        if (bs != null) {
            System.out.println("O sucessor de " + info + " é " + bs.getInfo());
        }
        else {
            System.out.println("A árvore está vazia!");
        }
    }

    public No<T> buscarSucessor(int info) {
        No<T> atual = buscar(raiz, info);
        if (atual == null) {
            return null;
        }

        else {
            if (atual.getDireita() != null) {
                atual = atual.getDireita();
                while (atual.getEsquerda() != null) {
                    atual = atual.getEsquerda();
                }

                return atual;
            }

            else {
                No<T> sucessor = null;
                No<T> atualAgora = raiz;
                
                while (atualAgora != null) {
                    if (atual.getInfo() < atualAgora.getInfo()) {
                        sucessor = atualAgora;
                        atualAgora = atualAgora.getEsquerda();
                    } 
                    else if (atual.getInfo() > atualAgora.getInfo()) {
                        sucessor = atualAgora;
                        atualAgora = atualAgora.getDireita();
                    } 
                    else {
                        break;
                    }
                }

                return sucessor;
            }
        }
    }

    public Boolean arvoreVazia() {
        return raiz == null;
    }

    public No<T> getRaiz() {
        return raiz;
    }
    public void setRaiz(No<T> raiz) {
        this.raiz = raiz;
    }
}