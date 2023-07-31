public class TesteListaDuplaCircular {
    public static void main(String[] args) {
        ListaDuplaCircular<Integer> lista = new ListaDuplaCircular();
        lista.adicionar(1);
        lista.adicionar(8);
        lista.adicionar(5);
        lista.adicionar(-5);
        lista.adicionar(99);
        lista.imprimir();
        System.out.println(lista.getRef().getInfo());
        lista.remover(-5);
        lista.imprimir();
        System.out.println(lista.getRef().getInfo());
    }
}