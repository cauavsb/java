package lista_encadeada;

public class TesteListaEncadeada {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.imprimir();
        lista.adicionarOrdenado(1);
        lista.adicionarOrdenado(10);
        lista.adicionarOrdenado(7);
        lista.adicionarOrdenado(99);
        lista.adicionarOrdenado(99);
        lista.imprimir();
    }
}
