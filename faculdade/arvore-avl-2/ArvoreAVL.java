public class ArvoreAVL<T> {
    private No<T> raiz;

    public ArvoreAVL() {
        this.raiz = null;
    }

    public No<T> getRaiz() {
        return raiz;
    }
    public void setRaiz(No<T> raiz) {
        this.raiz = raiz;
    }

    public Boolean arvoreVazia() {
        return raiz == null;
    }

    public void emOrdem(No<T> atual) {
        if (atual != null) {
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getInfo());
            emOrdem(atual.getDireita()); 
        }
    }

    public No<T> buscarSucessor(No<T> atual) {
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

    public int fatorBalanceamento(No<T> atual) {
        if (atual == null) {
            return 0;
        }
        else {
            int alturaEsquerda = alturaNo(atual.getEsquerda());
            int alturaDireita = alturaNo(atual.getDireita());
            return alturaEsquerda - alturaDireita;
        }
    }

    public No<T> rotacionaEsquerda(No<T> atual) {
        No<T> novoPai = atual.getDireita();
        atual.setDireita(novoPai.getEsquerda());
        novoPai.setEsquerda(atual);

        atual.setFb(fatorBalanceamento(atual));
        novoPai.setFb(fatorBalanceamento(novoPai));

        return novoPai;
    }

    public No<T> rotacionaDireita(No<T> atual) {
        No<T> novoPai = atual.getEsquerda();
        atual.setEsquerda(novoPai.getDireita());
        novoPai.setDireita(atual);

        atual.setFb(fatorBalanceamento(atual));
        novoPai.setFb(fatorBalanceamento(novoPai));

        return novoPai;
    }

    public No<T> balancear(No<T> atual) {
        int fb = fatorBalanceamento(atual);

        if (fb > 1) {
            if (fatorBalanceamento(atual.getEsquerda()) < 0) {
                atual.setEsquerda(rotacionaEsquerda(atual.getEsquerda()));
            }
            return rotacionaDireita(atual);
        }
        if (fb < -1) {
            if (fatorBalanceamento(atual.getDireita()) > 0) {
                atual.setDireita(rotacionaDireita(atual.getDireita()));
            }
            return rotacionaEsquerda(atual);
        }

        return atual;
    }

    public void adicionar(int info) {
        raiz = adicionar(raiz, info);
    }

    public No<T> adicionar(No<T> atual, int info) {
        if (atual == null) {
            return new No<>(info);
        }

        if (info < atual.getInfo()) {
            atual.setEsquerda(adicionar(atual.getEsquerda(), info));
        }
        else if (info > atual.getInfo()) {
            atual.setDireita(adicionar(atual.getDireita(), info));
        }
        else {
            return atual;
        }

        atual.setFb(fatorBalanceamento(atual));

        return balancear(atual);
    }

    public void remover(int info) {
        raiz = remover(raiz, info);
    }

    public No<T> remover(No<T> atual, int info) {
        if (atual == null) {
            return null;
        }
        else if (info < atual.getInfo()) {
            atual.setEsquerda(remover(atual.getEsquerda(), info));
        }
        else if (info > atual.getInfo()) {
            atual.setDireita(remover(atual.getDireita(), info));
        }
        else {
            if (atual.getEsquerda() == null && atual.getDireita() == null) {
                atual = null;
            }
            else if (atual.getDireita() != null && atual.getEsquerda() != null) {
                No<T> sucessor = buscarSucessor(atual.getDireita());
                atual.setInfo(sucessor.getInfo());
                atual.setDireita(remover(atual.getDireita(), sucessor.getInfo()));
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
            atual.setFb(fatorBalanceamento(atual));
        }

        return balancear(atual);
    }
}