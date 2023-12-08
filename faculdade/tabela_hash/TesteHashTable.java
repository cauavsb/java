public class TesteHashTable {
    public static void main(String[] args) {
        HashTable tabelaHash = new HashTable(53);
        // O QUE EU FIZ PARA CHEGAR A 53?
        
        // 1. CALCULEI O FATOR DE CARGA
        // NA QUESTÃO, DIZ-SE QUE É ESPERADO A INSERÇÃO DE 1000 ELEMENTOS
        // E QUE É ACEITÁVEL UMA MÉDIA DE 20 ELEMENTOS POR POSIÇÃO
        // ENTÃO, a = 1000 / 20 = 50

        // 2. FIZ UMA VALIDAÇÃO PARA SABER SE O NÚMERO É PRIMO
        // SABENDO QUE SE NÃO FOR, VAMOS EM BUSCA DO PRÓXIMO PRIMO MAIS PERTO DELE
        // LEVANDO EM CONTA TAMBÉM QUE NÃO PODEMOS ESCOLHER UMA POTÊNCIA DE 2!

        // AVALIANDO QUEM VEM DEPOIS DO 50:
        // 51: NÃO É POTÊNCIA DE 2, MAS TAMBÉM NÃO É PRIMO, POIS É DIVISÍVEL POR {1, 3, 17, 51}
        // 52: TAMBÉM NÃO É PRIMO, POIS É DIVISÍVEL POR {1, 2, 4, 13, 26, 52}
        // 53: É PRIMO, POIS SÓ É DIVISÍVEL POR 1 E ELE MESMO. 
        // FEITO ISSO, ACHEI O 53 COMO NÚMERO IDEAL PARA NOSSA APLICAÇÃO.

        // ADICIONANDO ALGUNS ELEMENTOS
        tabelaHash.insere("CAUÃ");
        tabelaHash.insere("VINÍCIUS");
        tabelaHash.insere("SILVA");
        tabelaHash.insere("BARBOSA");
        tabelaHash.insere("ARTHUR");
        tabelaHash.insere("EMANUEL");
        tabelaHash.insere("JOÃO");
        tabelaHash.insere("MIGUEL");
        tabelaHash.insere("ANA");
        tabelaHash.insere("VITÓRIA");
        tabelaHash.insere("SOUTO");
        tabelaHash.insere("HERMÍNIO");
        tabelaHash.insere("NOGUEIRA");
        tabelaHash.insere("JOSÉ");
        tabelaHash.insere("LAILTON");
        tabelaHash.insere("HIGOR");
        tabelaHash.insere("MARCELO");
        tabelaHash.insere("FELIPE");
        tabelaHash.insere("ALMEIDA");
        tabelaHash.insere("YASMIN");
        tabelaHash.insere("SANTOS");
        tabelaHash.insere("5j5jjj");
        tabelaHash.insere("RUAN");
        tabelaHash.insere("ALINE");
        tabelaHash.insere("MARTA");
        tabelaHash.insere("MÁRCIA");
        tabelaHash.insere("MÉRCIA");
        tabelaHash.insere("DYMAS");
        tabelaHash.insere("SINARA");
        tabelaHash.insere("NIDA");
        tabelaHash.insere("QUINHA");
        tabelaHash.insere("ANINHA");
        tabelaHash.insere("ELOISA");
        tabelaHash.insere("DAPHNY");
        tabelaHash.insere("RAFAEL");
        tabelaHash.insere("DINHA");
        tabelaHash.insere("FERNANDO");
        tabelaHash.insere("CRISTINA");
        tabelaHash.insere("EDVALDO");
        tabelaHash.insere("ILKA");
        tabelaHash.insere("ÍRIS");
        tabelaHash.insere("IVONE");
        tabelaHash.insere("IALY");
        tabelaHash.insere("PEDRO");
        tabelaHash.insere("MATHEUS");
        tabelaHash.insere("ABIEZEL");
        tabelaHash.insere("JUNIOR");
        tabelaHash.insere("JUNINHO");
        tabelaHash.insere("GIOVANNA");
        tabelaHash.insere("DEDINHO");
        tabelaHash.insere("ANDRÉ");
        tabelaHash.insere("MARIA");
        tabelaHash.insere("RITA");
        tabelaHash.insere("CELSO");
        tabelaHash.insere("CÍCERO");
        tabelaHash.insere("JÚLIA");
        tabelaHash.insere("SOUZA");
        tabelaHash.insere("BERNARDO");
        tabelaHash.insere("LUCINHA");
        
        // QUESTÃO 1
        System.out.println("");
        System.out.println("1. buscar um elemento existente que seja o primeiro da lista");
        System.out.print("Lista atual da posição 0: ");
        tabelaHash.imprime(0);
        System.out.println("A string 5j5jjj existe na tabela HASH? " + tabelaHash.busca("5j5jjj"));

        // QUESTÃO 2
        System.out.println("");
        System.out.println("2. buscar um elemento existente que seja o último da lista e não seja o primeiro");
        System.out.print("Lista atual da posição 13: ");
        tabelaHash.imprime(13);
        System.out.println("A string CAUÃ existe na tabela HASH? " + tabelaHash.busca("CAUÃ"));

        // QUESTÃO 3
        System.out.println("");
        System.out.println("3. buscar um elemento que nunca foi inserido");
        System.out.println("A string EDUARDO existe na tabela HASH? " + tabelaHash.busca("EDUARDO"));

        // QUESTÃO 4
        System.out.println("");
        System.out.println("4. buscar um elemento que já foi inserido e removido");
        System.out.println("A string VINÍCIUS existe na tabela HASH? " + tabelaHash.busca("VINÍCIUS"));
        tabelaHash.remove("VINÍCIUS");
        System.out.println("A string VINÍCIUS existe na tabela HASH? " + tabelaHash.busca("VINÍCIUS"));

        // QUESTÃO 5
        System.out.println("");
        System.out.println("5. remover todos os elementos de uma posição da tabela e voltar a inserir elementos novamente");
        System.out.print("Lista atual da posição 10: ");
        tabelaHash.imprime(10);
        tabelaHash.remove("MARIA");
        tabelaHash.remove("DEDINHO");
        tabelaHash.remove("MATHEUS");
        System.out.print("Lista da posição 10 após a remoção das strings MARIA, DEDINHO e MATHEUS: ");
        tabelaHash.imprime(10);
        tabelaHash.insere("SANDREANE");
        tabelaHash.insere("GUILHERME");
        System.out.print("Lista da posição 10 após a adição das strings SANDREANE e GUILHERME: ");
        tabelaHash.imprime(10);
    }
}