package lista_encadeada;

public class TesteListaEncadeada {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        lista.adicionarOrdenado(1);
        lista.adicionarOrdenado(1);
        lista.adicionarOrdenado(7);
        lista.adicionarOrdenado(3);
        lista.adicionarOrdenado(8);
        lista.adicionarOrdenado(99);
        lista.adicionarOrdenado(999);
        lista.adicionarOrdenado(0);
        lista.adicionarOrdenado(18);
        lista.remover(1);
        lista.imprimir();
    }
}