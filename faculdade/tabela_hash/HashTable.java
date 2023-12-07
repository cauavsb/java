public class HashTable<T> {
    private ListaEncadeada[] meuVetor;
    private Letra[] letras = retornaLetras();

    public Letra[] retornaLetras() {
        Letra[] letras = new Letra[27];

        for (int i = 0; i < letras.length; i++) {
            char letra = (char) ('A' + i);
            int valor = 10 + i;
            letras[i] = new Letra(String.valueOf(letra), valor);
        }

        letras[26] = new Letra(" ", 36);

        return letras;
    }

    public HashTable(int m) {
        int num = m/20;
        if (primoOuNao(num)) {
            meuVetor = new ListaEncadeada[num];
        }
        else {
            meuVetor = new ListaEncadeada[proximoPrimo(num)];
        }
    }

    public void insere(String str) {
        int local = hash(str);

        if (meuVetor[local] == null) {
            meuVetor[local] = new ListaEncadeada<>();
            meuVetor[local].adicionar(str);
        }
        else {
            meuVetor[local].adicionar(str);
        }
    }

    public void imprime(int p) {
        if (meuVetor[p] != null) {
            No<T> atual = meuVetor[p].getRef();
            while (atual != null) {
                System.out.println(atual.getInfo());
                atual = atual.getProx();
            }
        }
        else {
            System.out.println("Não existe nada na posição " + p + ".");
        }
    }
    
    //public boolean busca(String str) {

    //}

    //public void remove(String str) {

    //}

    public int hash(String str) {
        String palavra = str.toUpperCase();
        int retorno = 0;

        for (int x = 0; x < str.length(); x++) {
            retorno += (encontrarPosicao(String.valueOf(palavra.charAt(x))) * Math.pow(20, (str.length() - (x+1))));
        }

        retorno = retorno % meuVetor.length;

        return retorno;
    }

    public int encontrarPosicao(String letra) {
        letra = letra.toUpperCase();
        for (int i = 0; i < letras.length; i++) {
            if (letras[i].getLetra().equals(letra)) {
                return i + 10;
            }
        }
        return -1;
    }

    public static boolean primoOuNao(int num) {
        if (num <= 1) {
            return false;
        } 
        else if (num == 2) {
            return true;
        } 
        else if (num % 2 == 0) {
            return false;
        } 
        else {
            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int proximoPrimo(int num) {
        int numero = num + 1;

        while (true) {
            if (primoOuNao(numero)) {
                return numero;
            }
            numero++;
        }
    }
}