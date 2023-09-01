public class TesteArvoreAVL {
    public static void main (String[] args) {
    ArvoreAVL<Integer> arvoreAVL = new ArvoreAVL<>();
        arvoreAVL.adiciona(10);
        arvoreAVL.adiciona(11);
        arvoreAVL.adiciona(10);
        arvoreAVL.adiciona(18);
        arvoreAVL.adiciona(47);
        arvoreAVL.adiciona(5);
        arvoreAVL.adiciona(3);
        arvoreAVL.adiciona(1);
        arvoreAVL.adiciona(7);
        arvoreAVL.adiciona(6);
        arvoreAVL.adiciona(9);
        System.out.println("Raiz da árvore: " + arvoreAVL.getRaiz().getInfo());
        System.out.print("Em ordem: ");
        arvoreAVL.emOrdem(arvoreAVL.getRaiz());
        System.out.println(arvoreAVL.alturaNo(arvoreAVL.getRaiz()));
        System.out.println(arvoreAVL.arvoreCompleta(arvoreAVL.getRaiz()));
        System.out.println();

        arvoreAVL.remove(7);

        System.out.println("Raiz da árvore: " + arvoreAVL.getRaiz().getInfo());
        System.out.print("Em ordem: ");
        arvoreAVL.emOrdem(arvoreAVL.getRaiz());
        System.out.println(arvoreAVL.alturaNo(arvoreAVL.getRaiz()));
        System.out.println(arvoreAVL.arvoreCompleta(arvoreAVL.getRaiz()));
        System.out.println();
    }
}