public class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(10);
        
        // Testando se a pilha está vazia 
        System.out.println(pilha.pilhaVazia()); // deve retornar true

        // Inserção em uma pilha vazia 
        pilha.push("5");
        System.out.println(pilha.pilhaVazia()); // deve retornar false

        // Inserção em uma pilha contendo pelo menos um elemento
        pilha.push("2");
        pilha.push("7");
        pilha.imprime();  // [5, 2, 7]
        
        // Removendo um elemento da pilha
        pilha.pop();
        pilha.imprime();  // [5, 2]
        
        // Removendo todos os elementos da pilha e consultando se ela está vazia
        pilha.pop();
        pilha.pop();
        pilha.imprime(); // []
        System.out.println(pilha.pilhaVazia()); // deve retornar true
        System.out.println(pilha.getElementosInseridos()); // 0

        // Adicionando após a pilha ficar vazia
        pilha.push("1");
        pilha.push("3");
        pilha.push("2");
        pilha.imprime(); // [1, 3, 2]
        System.out.println(pilha.pilhaVazia()); // deve retornar false
        System.out.println(pilha.getElementosInseridos()); // 3
    }
}