public class TesteArvoreBinaria {
    public static void main (String[] args) {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.inserir(10);
        arvore.inserir(9);
        arvore.inserir(7);
        arvore.inserir(16);
        arvore.inserir(27);
        arvore.emOrdem(arvore.getRaiz());
        arvore.buscarElemento(arvore.getRaiz(), 8);
        arvore.buscarMin(arvore.getRaiz());
        arvore.buscarMax(arvore.getRaiz());

        System.out.println(arvore.buscarSucessor(10));
        arvore.buscarSuc(10);
    }
}