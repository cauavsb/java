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

    public String removerAcentos(String str) {
        if (str == null) {
            return null;
        }

        String semAcentos = str
                .replaceAll("[áàâã]", "a")
                .replaceAll("[éèê]", "e")
                .replaceAll("[íìî]", "i")
                .replaceAll("[óòôõ]", "o")
                .replaceAll("[úùû]", "u")
                .replaceAll("[ç]", "c")
                .replaceAll("[ÁÀÂÃ]", "A")
                .replaceAll("[ÉÈÊ]", "E")
                .replaceAll("[ÍÌÎ]", "I")
                .replaceAll("[ÓÒÔÕ]", "O")
                .replaceAll("[ÚÙÛ]", "U")
                .replaceAll("[Ç]", "C");

        return semAcentos;
    }

    public HashTable(int m) {
        int num = m / 20;
        if (primoOuNao(num)) {
            meuVetor = new ListaEncadeada[num];
        }
        else {
            meuVetor = new ListaEncadeada[proximoPrimo(num)];
        }
    }

    public void insere(String str) {
        String strSemAcento = removerAcentos(str);
        int local = hash(strSemAcento);

        if (meuVetor[local] == null) {
            meuVetor[local] = new ListaEncadeada<>();
            meuVetor[local].adicionar(str);
            System.out.println("A string " + str + " foi adicionada na posição " + local);
        }
        else {
            meuVetor[local].adicionar(str);
            System.out.println("A string " + str + " foi adicionada na posição " + local);
        }
    }

    public void imprime(int p) {
        if (meuVetor[p] == null) {
            System.out.println("Não existe nada na posição " + p + ".");
        }
        else {
            meuVetor[p].imprimir();
        }
    }
    
    public boolean busca(String str) {
        String strSemAcento = removerAcentos(str);
        int local = hash(strSemAcento);

        if (meuVetor[local] == null) {
            return false;
        }
        else if (meuVetor[local].getTamanho() == 0) {
            return false;
        }
        else {
            No<T> atual = meuVetor[local].getRef();
            while (atual != null) {
                if (atual.getInfo().equals(str)) {
                    return true;
                }
                else {
                    atual = atual.getProx();
                }
            }
            
            return false;
        }
    }

    public void remove(String str) {
        if (busca(str)) {
            String strSemAcento = removerAcentos(str);
            int local = hash(strSemAcento);
            meuVetor[local].remover(str);
            System.out.println("A string " + str + " foi removida.");
        }
        else {
            System.out.println("Essa string não existe!");
        }
    }

    public int hash(String str) {
        String palavra = str.toUpperCase();
        palavra = removerAcentos(palavra);
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
            return false;
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