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
        arvoreAVL.inserir(8);
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
        arvoreAVL.remover(8);
        System.out.print("Árvore após a remoção do número 8: ");
        System.out.println(arvoreAVL.preOrdem());

        // 5) Remoção de nó com 2 filhos, e que seja um filho à direita
        System.out.println("5) remoção de nó com 2 filhos, e que seja um filho à direita");
        System.out.print("Árvore antes da remoção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.remover(10);
        System.out.print("Árvore após a remoção do número 10: ");
        System.out.println(arvoreAVL.preOrdem());

        // 6) Remoção de nó com 2 filhos, e que seja um filho à esquerda
        System.out.println("6) remoção de nó com 2 filhos, e que seja um filho à esquerda");
        System.out.print("Árvore antes da remoção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.remover(15);
        System.out.print("Árvore após a remoção do número 15: ");
        System.out.println(arvoreAVL.preOrdem());

        // 7) Inserção que requer rotação simples à direita
        System.out.println("7) inserção que requer rotação simples à direita");
        System.out.print("Árvore antes da inserção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.inserir(20);
        arvoreAVL.inserir(25);
        arvoreAVL.inserir(22);
        System.out.print("Árvore após a inserção dos números 20 25 22: ");
        System.out.println(arvoreAVL.preOrdem());

        // 8) Inserção que requer rotação simples à esquerda
        System.out.println("8) inserção que requer rotação simples à esquerda");
        System.out.print("Árvore antes da inserção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.inserir(30);
        arvoreAVL.inserir(27);
        arvoreAVL.inserir(35);
        System.out.print("Árvore após a inserção dos números 30 27 35: ");
        System.out.println(arvoreAVL.preOrdem());

        // 9) Inserção que requer rotação dupla à direita
        System.out.println("9) inserção que requer rotação dupla à direita");
        System.out.print("Árvore antes da inserção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.inserir(5);
        arvoreAVL.inserir(10);
        arvoreAVL.inserir(3);
        System.out.print("Árvore após a inserção dos números 5 10 3: ");
        System.out.println(arvoreAVL.preOrdem());

        // 10) Inserção que requer rotação dupla à esquerda
        System.out.println("10) inserção que requer rotação dupla à esquerda");
        System.out.print("Árvore antes da inserção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.inserir(40);
        arvoreAVL.inserir(35);
        arvoreAVL.inserir(50);
        System.out.print("Árvore após a inserção dos números 40 35 50: ");
        System.out.println(arvoreAVL.preOrdem());

        // 11) Inserção que requer balanceamento seguido de remoção que também requer balanceamento
        System.out.println("11) inserção que requer balanceamento seguido de remoção que também requer balanceamento");
        System.out.print("Árvore antes da inserção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.inserir(2);
        arvoreAVL.inserir(8);
        arvoreAVL.remover(50);
        System.out.print("Árvore após a inserção de 2 e 8, e remoção de 50: ");
        System.out.println(arvoreAVL.preOrdem());

        // 12) Inserção que requer balanceamento seguido de remoção que também requer balanceamento
        System.out.println("12) inserção que requer balanceamento seguido de remoção que também requer balanceamento");
        System.out.print("Árvore antes da inserção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.inserir(60);
        arvoreAVL.inserir(70);
        arvoreAVL.remover(35);
        System.out.print("Árvore após a inserção de 60 e 70, e remoção de 35: ");
        System.out.println(arvoreAVL.preOrdem());

        // 13) Remoção que requer balanceamento (rotação simples à direita)
        System.out.println("13) remoção que requer balanceamento (rotação simples à direita)");
        System.out.print("Árvore antes da remoção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.remover(27);
        System.out.print("Árvore após a remoção do número 27: ");
        System.out.println(arvoreAVL.preOrdem());

        // 14) Remoção que requer balanceamento (rotação simples à esquerda)
        System.out.println("14) remoção que requer balanceamento (rotação simples à esquerda)");
        System.out.print("Árvore antes da remoção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.remover(8);
        System.out.print("Árvore após a remoção do número 8: ");
        System.out.println(arvoreAVL.preOrdem());

        // 15) Inserção que requer balanceamento seguido de remoção que requer balanceamento
        System.out.println("15) inserção que requer balanceamento seguido de remoção que também requer balanceamento");
        System.out.print("Árvore antes da inserção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.inserir(80);
        arvoreAVL.inserir(75);
        arvoreAVL.remover(70);
        System.out.print("Árvore após a inserção de 80 e 75, e remoção de 70: ");
        System.out.println(arvoreAVL.preOrdem());

        // 16) Inserção que requer balanceamento seguido de remoção que requer balanceamento
        System.out.println("16) inserção que requer balanceamento seguido de remoção que também requer balanceamento");
        System.out.print("Árvore antes da inserção: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.inserir(65);
        arvoreAVL.inserir(90);
        arvoreAVL.remover(80);
        System.out.print("Árvore após a inserção de 65 e 90, e remoção de 80: ");
        System.out.println(arvoreAVL.preOrdem());

        // 17) Esvaziar AVL e reinserir elementos
        System.out.println("17) esvaziar AVL e reinserir elementos");
        arvoreAVL = new AVL<>();
        arvoreAVL.inserir(50);
        arvoreAVL.inserir(40);
        arvoreAVL.inserir(60);
        System.out.print("Árvore antes de esvaziar e reinserir: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.remover(40);
        arvoreAVL.remover(60);
        arvoreAVL.remover(50);
        arvoreAVL.inserir(70);
        arvoreAVL.inserir(30);
        System.out.print("Árvore após esvaziar e reinserir 70 e 30: ");
        System.out.println(arvoreAVL.preOrdem());

        // 18) Esvaziar AVL e reinserir elementos
        System.out.println("18) esvaziar AVL e reinserir elementos");
        arvoreAVL = new AVL<>();
        arvoreAVL.inserir(100);
        arvoreAVL.inserir(90);
        arvoreAVL.inserir(110);
        System.out.print("Árvore antes de esvaziar e reinserir: ");
        System.out.println(arvoreAVL.preOrdem());
        arvoreAVL.remover(90);
        arvoreAVL.remover(110);
        arvoreAVL.remover(100);
        arvoreAVL.inserir(120);
        arvoreAVL.inserir(80);
        System.out.print("Árvore após esvaziar e reinserir 120 e 80: ");
        System.out.println(arvoreAVL.preOrdem());

        // 19) Em aberto
        System.out.println("19) Em aberto");
        // Adicione o cenário de teste conforme necessário

        // 20) Em aberto
        System.out.println("20) Em aberto");
        // Adicione o cenário de teste conforme necessário
    }
}