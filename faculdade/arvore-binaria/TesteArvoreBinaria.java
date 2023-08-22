public class TesteArvoreBinaria {
    public static void main(String[] args) {
        ArvoreBinaria<Integer> arvoreBinaria = new ArvoreBinaria<>();
        arvoreBinaria.adiciona(10);
        arvoreBinaria.adiciona(11);
        arvoreBinaria.adiciona(10);
        arvoreBinaria.adiciona(18);
        arvoreBinaria.adiciona(47);
        arvoreBinaria.adiciona(5);
        arvoreBinaria.adiciona(3);
        arvoreBinaria.adiciona(1);
        arvoreBinaria.adiciona(7);
        arvoreBinaria.adiciona(6);
        arvoreBinaria.adiciona(9);
        System.out.println("Raiz da árvore: " + arvoreBinaria.getRaiz().getInfo());
        System.out.print("Em ordem: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println();

        arvoreBinaria.remove(10);
        System.out.print("Em ordem após remoção do 10: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println();
        System.out.println("Raiz após remoção: " + arvoreBinaria.getRaiz().getInfo());

        arvoreBinaria.remove(11);
        System.out.print("Em ordem após remoção do 11: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println();
        System.out.println("Raiz após remoção: " + arvoreBinaria.getRaiz().getInfo());

        arvoreBinaria.remove(10);
        System.out.print("Em ordem após remoção do 10: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println();
        System.out.println("Raiz após remoção: " + arvoreBinaria.getRaiz().getInfo());

        arvoreBinaria.remove(18);
        System.out.print("Em ordem após remoção do 18: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println();
        System.out.println("Raiz após remoção: " + arvoreBinaria.getRaiz().getInfo());

        arvoreBinaria.remove(47);
        System.out.print("Em ordem após remoção do 47: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println();
        System.out.println("Raiz após remoção: " + arvoreBinaria.getRaiz().getInfo());

        arvoreBinaria.remove(5);
        System.out.print("Em ordem após remoção do 5: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println();
        System.out.println("Raiz após remoção: " + arvoreBinaria.getRaiz().getInfo());

        arvoreBinaria.remove(6);
        System.out.print("Em ordem após remoção do 6: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println();
        System.out.println("Raiz após remoção: " + arvoreBinaria.getRaiz().getInfo());

        arvoreBinaria.remove(1);
        System.out.print("Em ordem após remoção do 1: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println();
        System.out.println("Raiz após remoção: " + arvoreBinaria.getRaiz().getInfo());

        arvoreBinaria.remove(7);
        System.out.print("Em ordem após remoção do 7: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println();
        System.out.println("Raiz após remoção: " + arvoreBinaria.getRaiz().getInfo());

        arvoreBinaria.remove(9);
        System.out.print("Em ordem após remoção do 9: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println();
        System.out.println("Raiz após remoção: " + arvoreBinaria.getRaiz().getInfo());

        arvoreBinaria.remove(3);
        System.out.println("Raiz após remoção: " + arvoreBinaria.getRaiz());
    }
}