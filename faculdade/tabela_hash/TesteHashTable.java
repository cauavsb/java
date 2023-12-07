public class TesteHashTable {
    public static void main(String[] args) {
        HashTable tabelaHash = new HashTable(1000);

        // ADICIONANDO ALGUNS ELEMENTOS
        tabelaHash.insere("CAUA");
        tabelaHash.insere("VINICIUS");
        tabelaHash.insere("SILVA");
        tabelaHash.insere("BARBOSA");
        tabelaHash.insere("ANA");
        tabelaHash.insere("VITORIA");
        tabelaHash.insere("SOUTO");
        tabelaHash.insere("ARTHUR");
        tabelaHash.insere("EMANUEL");
        tabelaHash.insere("JOAO");
        tabelaHash.insere("MIGUEL");
        tabelaHash.insere("HERMINIO");
        tabelaHash.insere("NOGUEIRA");
        tabelaHash.insere("FABIANA");
        
        // QUESTÃO 1
        System.out.println("");
        System.out.println("1. buscar um elemento existente que seja o primeiro da lista");
        System.out.print("Lista atual da posição 0: ");
        tabelaHash.imprime(0);
        System.out.println("A string FABIANA existe na tabela HASH? " + tabelaHash.busca("FABIANA"));

        // QUESTÃO 2
        System.out.println("");
        System.out.println("2. buscar um elemento existente que seja o último da lista e não seja o primeiro");
        System.out.print("Lista atual da posição 20: ");
        tabelaHash.imprime(20);
        System.out.println("A string VINICIUS existe na tabela HASH? " + tabelaHash.busca("VINICIUS"));

        // QUESTÃO 3
        System.out.println("");
        System.out.println("3. buscar um elemento que nunca foi inserido");
        System.out.println("A string EDUARDO existe na tabela HASH? " + tabelaHash.busca("EDUARDO"));

        // QUESTÃO 4
        System.out.println("");
        System.out.println("4. buscar um elemento que já foi inserido e removido");
        System.out.println("A string VINICIUS existe na tabela HASH? " + tabelaHash.busca("VINICIUS"));
        tabelaHash.remove("VINICIUS");
        System.out.println("A string VINICIUS existe na tabela HASH? " + tabelaHash.busca("VINICIUS"));

        // QUESTÃO 5
        System.out.println("");
        System.out.println("5. remover todos os elementos de uma posição da tabela e voltar a inserir elementos novamente");
        System.out.print("Lista atual da posição 15: ");
        tabelaHash.imprime(15);
        tabelaHash.remove("JOAO");
        tabelaHash.remove("VITORIA");
        System.out.print("Lista da posição 15 após a remoção das strings JOAO e VITORIA: ");
        tabelaHash.imprime(15);

        tabelaHash.insere("MARIA");
        tabelaHash.insere("ALINE");

        System.out.print("Lista da posição 15 após a adição das strings MARIA e ALINE: ");
        tabelaHash.imprime(15);
    }
}