public class AVL<T> {
    private No<T> raiz;

    public AVL() {
        this.raiz = null;
    }

    public No<T> buscarSucessor(No<T> atual) {
        while (atual.getEsquerda() != null) {
            atual = atual.getEsquerda();
        }
        return atual;
    }

    public int alturaArvore(No<T> atual) {
        if (atual == null) {
            return -1;
        }

        int alturaEsquerda = alturaArvore(atual.getEsquerda());
        int alturaDireita = alturaArvore(atual.getDireita());
        return Math.max(alturaEsquerda, alturaDireita) + 1;
    }

    public int fatorBalanceamento(No<T> atual) {
        if (atual == null) {
            return 0;
        }

        int alturaEsquerda = alturaArvore(atual.getEsquerda());
        int alturaDireita = alturaArvore(atual.getDireita());
        return alturaEsquerda - alturaDireita;
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
        else {
            return atual;
        }

        atual.setFb(fatorBalanceamento(atual));

        return balancear(atual);
    }

    public String preOrdem() {
        String resultado = preOrdem(raiz);
        if (resultado.equals("")) {
            return "Árvore vazia!";
        }
        else {
            return resultado;
        }
    }

    public String preOrdem(No<T> atual) {
        if (atual != null) {
            String info = Integer.toString(atual.getInfo());
            String fb = Integer.toString(atual.getFb());
            String esquerda = preOrdem(atual.getEsquerda());
            String direita = preOrdem(atual.getDireita());
            return info + "(" + fb + ")" + " " + esquerda + direita;
        }
        return "";
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