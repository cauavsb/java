public class ArvoreAVL<T> {
    public void rotacionaEsquerda(No<T> pai) {
        No<T> novoPai = pai.getDireita();
        pai.setDireita(novoPai.getEsquerda());
        novoPai.setEsquerda(pai);
        pai = novoPai;
    }

    public void rotacionaDireita(No<T> pai) {
        No<T> novoPai = pai.getEsquerda();
        pai.setEsquerda(novoPai.getDireita());
        novoPai.setDireita(pai);
        pai = novoPai;
    }

    public void rotacionaEsquerdaDireita(No<T> pai) {
        No<T> filho = pai.getEsquerda();
        rotacionaEsquerda(filho);
        pai.setEsquerda(filho);
        rotacionaDireita(pai);
    }

    public void rotacionaDireitaEsquerda(No<T> pai) {
        No<T> filho = pai.getDireita();
        rotacionaDireita(filho);
        pai.setDireita(filho);
        rotacionaEsquerda(pai);
    }
}