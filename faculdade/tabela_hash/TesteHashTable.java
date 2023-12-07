public class TesteHashTable {
    public static void main(String[] args) {
        HashTable tabelaHash = new HashTable(1000);

        tabelaHash.insere("roma");
        tabelaHash.insere("ROMA");
        tabelaHash.insere("ROMA");
        tabelaHash.insere("ROMA");
        tabelaHash.insere("AAAA");
        int roma = tabelaHash.hash("ROMA");
        int aaaa = tabelaHash.hash("AAAA");
        int r = tabelaHash.encontrarPosicao("R");
        int o = tabelaHash.encontrarPosicao("O");
        int m = tabelaHash.encontrarPosicao("M");
        int a = tabelaHash.encontrarPosicao("A");
        System.out.println(roma);
        System.out.println(aaaa);
        System.out.println(r);
        System.out.println(o);
        System.out.println(m);
        System.out.println(a);

        tabelaHash.imprime(46);
    }
}