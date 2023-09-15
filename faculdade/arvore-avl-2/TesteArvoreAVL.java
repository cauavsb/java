public class TesteArvoreAVL {
    public static void main (String[] args) {
        ArvoreAVL<Integer> arvoreAVL = new ArvoreAVL<>();
        arvoreAVL.adicionar(10);
        arvoreAVL.adicionar(5);
        arvoreAVL.adicionar(13);
        arvoreAVL.adicionar(12);
        arvoreAVL.adicionar(11);
        arvoreAVL.emOrdem(arvoreAVL.getRaiz());

        System.out.println("Raiz: " + arvoreAVL.getRaiz().getInfo());
        System.out.println("Raiz Esquerda: " + arvoreAVL.getRaiz().getEsquerda().getInfo());
        System.out.println("Raiz Direita: " + arvoreAVL.getRaiz().getDireita().getInfo());
        System.out.println("Raiz Direita Esquerda: " + arvoreAVL.getRaiz().getDireita().getEsquerda().getInfo());
        System.out.println("Raiz Direita Direita: " + arvoreAVL.getRaiz().getDireita().getDireita().getInfo());
    }
}