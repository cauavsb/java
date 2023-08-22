public class ArvoreBinaria<T> {
    private No<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void adiciona(int info) {
        No<T> novoNo = new No<>(info);
        if (arvoreVazia()) {
            raiz = novoNo;
            return;
        }
        else {
            No<T> atual = raiz;
            while (true) {
                if (novoNo.getInfo() < atual.getInfo()) {
                    if (atual.getEsquerda() != null) {
                        atual = atual.getEsquerda();
                    }
                    else {
                        atual.setEsquerda(novoNo);
                        break;
                    }
                }
                else {
                    if (atual.getDireita() != null) {
                        atual = atual.getDireita();
                    }
                    else {
                        atual.setDireita(novoNo);
                        break;
                    }
                }
            }
        }
    }

    public void remove(int info) {
        if (procuraElemento(info)) {
            No<T> paiAtual = null;
            No<T> atual = raiz;
            while (atual != null) {
                if (info == atual.getInfo()) {
                    break;
                }
                else {
                    if (info < atual.getInfo()) {
                        paiAtual = atual;
                        atual = atual.getEsquerda();
                    }
                    else {
                        paiAtual = atual;
                        atual = atual.getDireita();
                    }
                }
            }

            if (atual.getDireita() == null && atual.getEsquerda() == null) { // nenhum filho
                if (paiAtual == null) {
                    raiz = null;
                }
                else if (atual.getInfo() < paiAtual.getInfo()) {
                    paiAtual.setEsquerda(null);
                }
                else {
                    paiAtual.setDireita(null);
                }
            }
            else if (atual.getDireita() != null && atual.getEsquerda() == null || atual.getDireita() == null && atual.getEsquerda() != null) { // um filho
               if (atual == raiz) {
                    if (raiz.getEsquerda() == null) {
                        raiz = raiz.getDireita();
                    }
                    else {
                        raiz = raiz.getEsquerda();
                    }
                }
                else if (atual.getInfo() < paiAtual.getInfo()) {
                    if (atual.getEsquerda() != null) {
                        paiAtual.setEsquerda(atual.getEsquerda());
                    }
                    else {
                        paiAtual.setEsquerda(atual.getDireita());
                    }
                }
                else {
                    if (atual.getEsquerda() != null) {
                        paiAtual.setDireita(atual.getEsquerda());
                    }
                    else {
                        paiAtual.setDireita(atual.getDireita());
                    }
                }
            }
            else { // dois filhos
                No<T> paiSucessor = atual;
                No<T> sucessor = atual.getDireita();
                while (sucessor.getEsquerda() != null) {
                    paiSucessor = sucessor;
                    sucessor = sucessor.getEsquerda();
                }
                    
                atual.setInfo(sucessor.getInfo());
        
                if (paiSucessor == atual) { // Caso o sucessor seja o filho à direita do nó atual
                    paiSucessor.setDireita(sucessor.getDireita());
                } 
                else {
                    paiSucessor.setEsquerda(sucessor.getDireita());
                }
            }
        }
        else {
            System.out.println("Elemento não está presente na Ávore!");
        }
    }

    public void emOrdem(No<T> atual) {
        if (atual != null) {
            emOrdem(atual.getEsquerda());
            System.out.print(atual.getInfo() + " ");
            emOrdem(atual.getDireita());
        }
    }

    public void preOrdem(No<T> atual) {
        if (atual != null) {
            System.out.print(atual.getInfo() + " ");
            preOrdem(atual.getEsquerda());
            preOrdem(atual.getDireita());
        }
    }
    
    public void posOrdem(No<T> atual) {
        if (atual != null) {
            posOrdem(atual.getEsquerda());
            posOrdem(atual.getDireita());
            System.out.print(atual.getInfo() + " ");
        }
    }

    public Boolean arvoreVazia() {
        return raiz == null;
    }

    public Boolean procuraElemento(int info) {
        if (arvoreVazia()) {
            return false;
        }
        else {
            No<T> atual = raiz;
            while (atual != null) {
                if (info == atual.getInfo()) {
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

    public No<T> getRaiz() {
        return raiz;
    }
    public void setRaiz(No<T> raiz) {
        this.raiz = raiz;
    }
}