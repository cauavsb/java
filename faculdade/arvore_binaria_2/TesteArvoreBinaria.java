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

        arvoreBinaria.remove(1);
        arvoreBinaria.remove(6);
        arvoreBinaria.remove(9);
        arvoreBinaria.remove(47);

        System.out.println(arvoreBinaria.arvoreCheia(arvoreBinaria.getRaiz()));
        System.out.println(arvoreBinaria.arvoreCompleta(arvoreBinaria.getRaiz()));
        System.out.println(arvoreBinaria.arvoreDegenerada(arvoreBinaria.getRaiz()));
    }
}