public class ArvoreBinaria<T> {
    private No<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public int alturaArvore(No<T> atual) {
        if (atual == null) {
            return -1;
        }
        else {
            int alturaEsquerda = alturaArvore(atual.getEsquerda());
            int alturaDireita = alturaArvore(atual.getDireita());
            return Math.max(alturaEsquerda, alturaDireita) + 1;
        }
    }

    public Boolean pertenceArvore(int info) {
        if (arvoreVazia()) {
            return false;
        }
        else {
            No<T> atual = raiz;
            while (atual != null) {
                if (atual.getInfo() == info) {
                    return true;
                }
                else if (info < atual.getInfo()) {
                    atual = atual.getEsquerda();
                }
                else {
                    atual = atual.getDireita();
                }
            }
        }
        return false;
    }

    public void preOrdem(No<T> atual) {
        if (atual != null) {
            System.out.println(atual.getInfo());
            preOrdem(atual.getEsquerda());
            preOrdem(atual.getDireita());
        }
    }

    public void emOrdem(No<T> atual) {
        if (atual != null) {
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getInfo());
            emOrdem(atual.getDireita());
        }
    }

    public void posOrdem(No<T> atual) {
        if (atual != null) {
            preOrdem(atual.getEsquerda());
            preOrdem(atual.getDireita());
            System.out.println(atual.getInfo());
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