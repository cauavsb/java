public class TesteListaDuplaCircular {
    public static void main(String[] args) {
        ListaDuplaCircular<Integer> lista = new ListaDuplaCircular();
        lista.adicionar(1);
        lista.adicionar(1);
        lista.adicionar(5);
        lista.adicionar(6);
        lista.adicionar(99);
        lista.imprimir();
        lista.remover(1);
        lista.imprimir();
        lista.remover(5);
        lista.imprimir();
        lista.remover(6);
        lista.imprimir();
        lista.remover(99);
        lista.imprimir();
        System.out.println(lista.getRef());
    }
}