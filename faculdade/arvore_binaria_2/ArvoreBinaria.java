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
        if (pertenceArvore(info)) {
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

            if (atual.getDireita() == null && atual.getEsquerda() == null) {
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
            else if (atual.getDireita() != null && atual.getEsquerda() == null || atual.getDireita() == null && atual.getEsquerda() != null) {
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
            else {
                No<T> paiSucessor = atual;
                No<T> sucessor = atual.getDireita();
                while (sucessor.getEsquerda() != null) {
                    paiSucessor = sucessor;
                    sucessor = sucessor.getEsquerda();
                }
                    
                atual.setInfo(sucessor.getInfo());
        
                if (paiSucessor == atual) { // Caso o sucessor seja o filho à direita do nó atual
                    paiSucessor.setDireita(sucessor.getDireita());
                    //if (procuraElemento(info)) {
                        //remove(info);
                    //}
                } 
                else {
                    paiSucessor.setEsquerda(sucessor.getDireita());
                    //if (procuraElemento(info)) {
                        //remove(info);
                    //}
                }
            }
        }
        else {
            System.out.println("Elemento não está presente na Ávore!");
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

    public Boolean arvoreCheia(No<T> atual) {
        if (atual == null) {
            return false;
        }
        
        if (atual.getEsquerda() == null && atual.getDireita() == null) {
            return true;
        }
    
        if (atual.getEsquerda() != null && atual.getDireita() != null) {
            return arvoreCheia(atual.getEsquerda()) && arvoreCheia(atual.getDireita());
        }
    
        return false;
    }

    public Boolean arvoreCompleta(No<T> atual) {
        if (atual == null) {
            return true;
        }
        
        int alturaEsquerda = alturaArvore(atual.getEsquerda());
        int alturaDireita = alturaArvore(atual.getDireita());
    
        if (Math.abs(alturaEsquerda - alturaDireita) <= 1 &&
            arvoreCompleta(atual.getEsquerda()) && arvoreCompleta(atual.getDireita())) {
            return true;
        }
    
        return false;
    }

    public Boolean arvoreDegenerada(No<T> atual) {
        if (atual == null) {
            return true;
        }
    
        if (atual.getEsquerda() != null && atual.getDireita() != null) {
            return false;
        }

        return arvoreDegenerada(atual.getDireita()) || arvoreDegenerada(atual.getEsquerda());
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