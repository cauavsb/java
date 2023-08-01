package lista_encadeada_ordenada;

public class TesteListaEncadeada {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        
        // Testando se a lista está vazia 
        System.out.println(lista.listaVazia()); // deve retornar true

        // Inserção em uma lista vazia 
        lista.adicionarOrdenado(5);
        System.out.println(lista.listaVazia()); // deve retornar false

        // Inserção em uma lista contendo pelo menos um elemento
        lista.adicionarOrdenado(2);
        lista.adicionarOrdenado(7);
        lista.imprimir();  // [2, 5, 7]
        
        // Removendo elementos
        lista.removerOrdenado(5);
        lista.removerOrdenado(7);
        lista.removerOrdenado(2);
        lista.imprimir();  // []
        
        // Testando se a lista está vazia após remoção de todss
        System.out.println(lista.listaVazia()); // deve retornar true
        System.out.println(lista.getTamanho()); // 0

        // Adicionando após a lista ficar vazia
        lista.adicionarOrdenado(1);
        lista.adicionarOrdenado(3);
        lista.adicionarOrdenado(2);
        lista.imprimir(); // [1, 2, 3]
        System.out.println(lista.listaVazia()); // deve retornar false
        System.out.println(lista.getTamanho()); // 3

        // Removendo duplicadas no inicio
        lista.adicionarOrdenado(1);
        lista.adicionarOrdenado(1);
        lista.imprimir(); // [1, 1, 1, 2, 3]
        lista.removerOrdenado(1);
        lista.imprimir(); // [2, 3]

        // Removendo duplicadas no fim
        lista.adicionarOrdenado(3);
        lista.adicionarOrdenado(3);
        lista.imprimir(); // [2, 3, 3, 3]
        lista.removerOrdenado(3);
        lista.imprimir(); // [2]

        // Removendo duplicadas no meio
        lista.adicionarOrdenado(1);
        lista.adicionarOrdenado(3);
        lista.adicionarOrdenado(2);
        lista.adicionarOrdenado(2);
        lista.imprimir(); // [1, 2, 2, 2, 3]
        lista.removerOrdenado(2);
        lista.imprimir(); // [1, 3]

        // Removendo elementos que não estão na lista sem que a lista seja modificada
        lista.removerOrdenado(0);
        lista.removerOrdenado(9);
        lista.imprimir(); // [1, 3]
        System.out.println(lista.listaVazia()); // deve retornar false
        System.out.println(lista.getTamanho()); // 2
    }
}