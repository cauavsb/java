public class TesteListaEncadeadaDupla {
    public static void main(String[] args) {
        ListaEncadeadaDupla lista = new ListaEncadeadaDupla();
        
        System.out.println("-> Verificando se a lista está vazia <-");
        System.out.println(lista.listaVazia()); // deve retornar true

        System.out.println("a) Remoção no início");
        lista.insere(5);
        lista.insere(2);
        lista.insere(7);
        lista.imprime(); // [2, 5, 7] -> [7, 5, 2]
        lista.remove(2); 
        lista.imprime(); // [5, 7] -> [7, 5]

        System.out.println("b) Remoção no final");
        lista.insere(5);
        lista.insere(2);
        lista.insere(9);
        lista.imprime(); // [2, 5, 5, 7, 9] -> [9, 7, 5, 5, 2]
        lista.remove(9); 
        lista.imprime(); // [2, 5, 5, 7] -> [7, 5, 5, 2]

        System.out.println("c) Remoção no meio");
        lista.insere(10);
        lista.insere(8);
        lista.imprime(); // [2, 5, 5, 7, 8, 10] -> [10, 8, 7, 5, 5, 2]
        lista.remove(7); 
        lista.imprime(); // [2, 5, 5, 8, 10] -> [10, 8, 5, 5, 2]

        System.out.println("d) Remoção de cópias no início");
        lista.insere(2);
        lista.insere(2);
        lista.imprime(); // [2, 2, 2, 5, 5, 8, 10] -> [10, 8, 5, 5, 2, 2, 2]
        lista.remove(2);
        lista.imprime();  // [5, 5, 8, 10] -> [10, 8, 5, 5]

        System.out.println("d) Remoção de cópias no final");
        lista.insere(10);
        lista.insere(10);
        lista.imprime(); // [5, 5, 8, 10, 10, 10] -> [10, 10, 10, 8, 5, 5]
        lista.remove(10);
        lista.imprime();  // [5, 5, 8] -> [8, 5, 5]

        System.out.println("d) Remoção de cópias no meio");
        lista.insere(7);
        lista.insere(7);
        lista.imprime(); // [5, 5, 7, 7, 8] -> [8, 7, 7, 5, 5]
        lista.remove(7);
        lista.imprime();  // [5, 5, 8] -> [8, 5, 5]
        
        System.out.println("e) Remoção de elementos inexistentes");
        lista.imprime();  // [5, 5, 8] -> [8, 5, 5]
        lista.remove(50);
        lista.remove(1);
        lista.remove(17);
        lista.imprime();  // [5, 5, 8] -> [8, 5, 5]

        System.out.println("g) Imprimir método listaVazia()");
        lista.imprime(); // [5, 5, 8] -> [8, 5, 5]
        System.out.println(lista.listaVazia()); // deve retornar false
        
        System.out.println("h) Esvaziando a lista e testando se ela está vazia");
        lista.remove(5);
        lista.remove(8);
        System.out.println(lista.listaVazia()); // deve retornar true
        lista.imprime(); // []

        System.out.println("h) Adicionando após a lista ficar vazia");
        lista.insere(1);
        lista.insere(3);
        lista.insere(2);
        lista.imprime(); // [1, 2, 3] - [3, 2, 1]

        System.out.println("-> Verificando se a lista está vazia <-");
        System.out.println(lista.listaVazia()); // deve retornar false
    }
}