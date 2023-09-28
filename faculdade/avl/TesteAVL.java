public class TesteAVL {
    public static void main(String[] args) {
        AVL<Integer> arvoreAVL = new AVL<>();

        System.out.println("1) inserções simples que não requeiram balanceamento");
        System.out.print("Árvore antes da inserção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.inserir(5);
        arvoreAVL.inserir(3);
        arvoreAVL.inserir(7);
        arvoreAVL.inserir(1);
        arvoreAVL.inserir(4);
        arvoreAVL.inserir(9);
        System.out.print("Árvore após a inserção dos números 5 3 7 1 4 9: ");
        System.out.println(arvoreAVL.preOrdem());

        System.out.println("2) remoção de nó sem filhos");
        System.out.print("Árvore antes da remoção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.remover(9);
        System.out.print("Árvore após a remoção do número 9: ");
        System.out.println(arvoreAVL.preOrdem());

        System.out.println("3) remoção de nó com 1 filho à direita");
        arvoreAVL.inserir(8);
        System.out.print("Árvore antes da remoção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.remover(7);
        System.out.print("Árvore após a remoção do número 7: ");
        System.out.println(arvoreAVL.preOrdem());

        System.out.println("4) remoção de nó com 1 filho à esquerda");
        arvoreAVL.inserir(6);
        System.out.print("Árvore antes da remoção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.remover(6);
        System.out.print("Árvore após a remoção do número 6: ");
        System.out.println(arvoreAVL.preOrdem());
    }
}