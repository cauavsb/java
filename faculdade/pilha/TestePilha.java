package pilha;

public class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        
        // Testando se a pilha está vazia 
        System.out.println(pilha.pilhaVazia()); // deve retornar true

        // Inserção em uma pilha vazia 
        pilha.push(5);
        System.out.println(pilha.pilhaVazia()); // deve retornar false

        // Inserção em uma pilha contendo pelo menos um elemento
        pilha.push(2);
        pilha.push(7);
        pilha.imprimir();  // [7, 2, 5]
        
        // Removendo um elemento da pilha
        pilha.pop();
        pilha.imprimir();  // [2, 5]
        
        // Removendo todos os elementos da pilha e consultando se ela está vazia
        pilha.pop();
        pilha.pop();
        pilha.imprimir(); // []
        System.out.println(pilha.pilhaVazia()); // deve retornar true
        System.out.println(pilha.tamanhoPilha()); // 0

        // Adicionando após a pilha ficar vazia
        pilha.push(1);
        pilha.push(3);
        pilha.push(2);
        pilha.imprimir(); // [2, 3, 1]
        System.out.println(pilha.pilhaVazia()); // deve retornar false
        System.out.println(pilha.tamanhoPilha()); // 3
    }
}