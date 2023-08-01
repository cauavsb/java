package lista_encadeada;

public class TesteListaEncadeada {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada();
        
        // Testando se a lista está vazia 
        System.out.println(lista.listaVazia()); // deve retornar true

        // Inserção em uma lista vazia 
        lista.adicionar(5);
        System.out.println(lista.listaVazia()); // deve retornar false

        // Inserção em uma lista contendo pelo menos um elemento
        lista.adicionar(2);
        lista.adicionar(7);
        lista.imprimir();  // [7, 2, 5]
        
        // Removendo elementos
        lista.remover(5);
        lista.remover(7);
        lista.remover(2);
        lista.imprimir();  // []
        
        // Testando se a lista está vazia após remoção de todss
        System.out.println(lista.listaVazia()); // deve retornar true
        System.out.println(lista.getTamanho()); // 0

        // Adicionando após a lista ficar vazia
        lista.adicionar(1);
        lista.adicionar(3);
        lista.adicionar(2);
        lista.imprimir(); // [2, 3, 1]
        System.out.println(lista.listaVazia()); // deve retornar false
        System.out.println(lista.getTamanho()); // 3

        // Removendo duplicadas no inicio
        lista.adicionar(1);
        lista.adicionar(1);
        lista.imprimir(); // [1, 1, 2, 3, 1]
        lista.remover(1);
        lista.imprimir(); // [2, 3]

        // Removendo duplicadas no fim
        lista.adicionar(3);
        lista.adicionar(3);
        lista.imprimir(); // [3, 3, 2, 3]
        lista.remover(3);
        lista.imprimir(); // [2]

        // Removendo duplicadas no meio
        lista.adicionar(1);
        lista.adicionar(3);
        lista.adicionar(2);
        lista.adicionar(2);
        lista.imprimir(); // [2, 2, 3, 1, 2]
        lista.remover(2);
        lista.imprimir(); // [3, 1]

        // Removendo elementos que não estão na lista sem que a lista seja modificada
        lista.remover(0);
        lista.remover(9);
        lista.imprimir(); // [3, 1]
        System.out.println(lista.listaVazia()); // deve retornar false
        System.out.println(lista.getTamanho()); // 2
    }
}