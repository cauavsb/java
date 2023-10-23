public class TesteAVL {
    public static void main(String[] args) {
        AVL<Integer> arvoreAVL = new AVL<>();
        
        // 1) Inserções simples que não requeiram balanceamento
        System.out.println("1) inserções simples que não requeiram balanceamento");
        System.out.print("Árvore antes da inserção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.inserir(10);
        arvoreAVL.inserir(5);
        arvoreAVL.inserir(15);
        System.out.print("Árvore após a inserção dos números 10 5 15: ");
        System.out.println(arvoreAVL.preOrdem());
        
        // 2) Remoção de nó sem filhos
        System.out.println("2) remoção de nó sem filhos");
        System.out.print("Árvore antes da remoção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.remover(5);
        System.out.print("Árvore após a remoção do número 5: ");
        System.out.println(arvoreAVL.preOrdem());
        
        // 3) Remoção de nó com 1 filho à direita
        System.out.println("3) remoção de nó com 1 filho à direita");
        System.out.print("Árvore antes da remoção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.remover(10);
        System.out.print("Árvore após a remoção do número 10: ");
        System.out.println(arvoreAVL.preOrdem());
        
        // 4) Remoção de nó com 1 filho à esquerda
        System.out.println("4) remoção de nó com 1 filho à esquerda");
        arvoreAVL.inserir(3);
        System.out.print("Árvore antes da remoção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.remover(15);
        System.out.print("Árvore após a remoção do número 15: ");
        System.out.println(arvoreAVL.preOrdem());

        // 5) Remoção de nó com 2 filhos, e que seja um filho à direita
        System.out.println("5) remoção de nó com 2 filhos, e que seja um filho à direita");
        arvoreAVL.inserir(1);
        arvoreAVL.inserir(5);
        arvoreAVL.inserir(4);
        arvoreAVL.inserir(6);
        System.out.print("Árvore antes da remoção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.remover(5);
        System.out.print("Árvore após a remoção do número 5: ");
        System.out.println(arvoreAVL.preOrdem());

        // 6) Remoção de nó com 2 filhos, e que seja um filho à esquerda
        System.out.println("6) remoção de nó com 2 filhos, e que seja um filho à esquerda");
        arvoreAVL.inserir(0);
        arvoreAVL.inserir(2);
        System.out.print("Árvore antes da remoção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.remover(1);
        System.out.print("Árvore após a remoção do número 1: ");
        System.out.println(arvoreAVL.preOrdem());

        // 7) Inserção que requer rotação simples à direita
        System.out.println("7) inserção que requer rotação simples à direita");
        System.out.print("Árvore antes da inserção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.inserir(-1);
        System.out.print("Árvore após a inserção do número -1: ");
        System.out.println(arvoreAVL.preOrdem());

        // 8) Inserção que requer rotação simples à esquerda
        System.out.println("8) inserção que requer rotação simples à esquerda");
        System.out.print("Árvore antes da inserção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.inserir(8);
        arvoreAVL.inserir(10);
        arvoreAVL.inserir(12);
        System.out.print("Árvore após a inserção dos números 8 10 12: ");
        System.out.println(arvoreAVL.preOrdem());

        System.out.println("9) Remoção de todos os nós");
        arvoreAVL.remover(-1);
        arvoreAVL.remover(0);
        arvoreAVL.remover(2);
        arvoreAVL.remover(3);
        arvoreAVL.remover(4);
        arvoreAVL.remover(6);
        arvoreAVL.remover(8);
        arvoreAVL.remover(10);
        arvoreAVL.remover(12);
        System.out.print("Árvore após remoções: ");
        System.out.println(arvoreAVL.preOrdem());
    }
}