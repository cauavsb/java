public class ArvoreAVL<T> {
    private No<T> raiz;

    public void adiciona(int info) {
        raiz = adiciona(raiz, info);
    }
    
    private No<T> adiciona(No<T> atual, int info) {
        if (atual == null) {
            return new No<>(info);
        }
    
        if (info < atual.getInfo()) {
            atual.setEsquerda(adiciona(atual.getEsquerda(), info));
        } 
        else if (info > atual.getInfo()) {
            atual.setDireita(adiciona(atual.getDireita(), info));
        } 
        else {
            return atual;
        }
    
        atual.setAlturaNo(alturaNo(atual));

        return balancear(atual);
    }

    public void remove(int info) {
        raiz = remove(raiz, info);
    }
    
    private No<T> remove(No<T> atual, int info) {
        if (atual == null) {
            return null;
        }
    
        if (info < atual.getInfo()) {
            atual.setEsquerda(remove(atual.getEsquerda(), info));
        } 
        else if (info > atual.getInfo()) {
            atual.setDireita(remove(atual.getDireita(), info));
        } 
        else {
            if (atual.getEsquerda() == null && atual.getDireita() == null) {
                atual = null;
            } 
            else if (atual.getEsquerda() != null && atual.getDireita() != null) {
                No<T> sucessor = encontrarSucessor(atual.getDireita());
                atual.setInfo(sucessor.getInfo());
                atual.setDireita(remove(atual.getDireita(), sucessor.getInfo()));
            } 
            else {
                if (atual.getEsquerda() != null) {
                    atual = atual.getEsquerda();
                } 
                else {
                    atual = atual.getDireita();
                }
            }
        }
    
        if (atual != null) {
            atual.setAlturaNo(alturaNo(atual));
        }
    
        return balancear(atual);
    }
    
    private No<T> encontrarSucessor(No<T> atual) {
        while (atual.getEsquerda() != null) {
            atual = atual.getEsquerda();
        }
        return atual;
    }    

    public int alturaNo(No<T> atual) {
        if (atual == null) {
            return -1;
        }
        else {
            int alturaEsquerda = alturaNo(atual.getEsquerda());
            int alturaDireita = alturaNo(atual.getDireita());
            return Math.max(alturaEsquerda, alturaDireita) + 1;
        }
    }
    
    private int fatorBalanceamento(No<T> atual) {
        if (atual == null) {
            return 0;
        } 
        else {
            int alturaEsquerda = alturaNo(atual.getEsquerda());
            int alturaDireita = alturaNo(atual.getDireita());
            return alturaEsquerda - alturaDireita;
        }
    }
    
    private No<T> rotacionarEsquerda(No<T> atual) {
        No<T> novoPai = atual.getDireita();
        atual.setDireita(novoPai.getEsquerda());
        novoPai.setEsquerda(atual);
    
        atual.setAlturaNo(alturaNo(atual));
        novoPai.setAlturaNo(alturaNo(novoPai));

        return novoPai;
    }
    
    private No<T> rotacionarDireita(No<T> atual) {
        No<T> novoPai = atual.getEsquerda();
        atual.setEsquerda(novoPai.getDireita());
        novoPai.setDireita(atual);
    
        atual.setAlturaNo(alturaNo(atual));
        novoPai.setAlturaNo(alturaNo(novoPai));
    
        return novoPai;
    }
    
    private No<T> balancear(No<T> atual) {
        int fb = fatorBalanceamento(atual);
    
        if (fb > 1) {
            if (fatorBalanceamento(atual.getEsquerda()) < 0) {
                atual.setEsquerda(rotacionarEsquerda(atual.getEsquerda()));
            }
            return rotacionarDireita(atual);
        }
    
        if (fb < -1) {
            if (fatorBalanceamento(atual.getDireita()) > 0) {
                atual.setDireita(rotacionarDireita(atual.getDireita()));
            }
            return rotacionarEsquerda(atual);
        }
    
        return atual;
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
        
        int alturaEsquerda = alturaNo(atual.getEsquerda());
        int alturaDireita = alturaNo(atual.getDireita());
    
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

    public No<T> getRaiz() {
        return raiz;
    }
    public void setRaiz(No<T> raiz) {
        this.raiz = raiz;
    }
}