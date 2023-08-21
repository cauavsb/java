public class TesteArvoreBinaria {
    public static void main(String[] args) {
        ArvoreBinaria<Integer> arvoreBinaria = new ArvoreBinaria<>();
        arvoreBinaria.adicionar(10);
        arvoreBinaria.adicionar(11);
        arvoreBinaria.adicionar(10);
        arvoreBinaria.adicionar(18);
        arvoreBinaria.adicionar(47);
        arvoreBinaria.adicionar(5);
        arvoreBinaria.adicionar(3);
        arvoreBinaria.adicionar(1);
        arvoreBinaria.adicionar(7);
        arvoreBinaria.adicionar(6);
        arvoreBinaria.adicionar(9);


        System.out.print("Em ordem: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println();
        //System.out.print("Pré-ordem: ");
        //arvoreBinaria.preOrdem(arvoreBinaria.getRaiz());
        //System.out.println();
        //System.out.print("Pós-ordem: ");
        //arvoreBinaria.posOrdem(arvoreBinaria.getRaiz());
        //System.out.println();

        arvoreBinaria.remover(10);
        System.out.print("Em ordem: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println();
    }
}