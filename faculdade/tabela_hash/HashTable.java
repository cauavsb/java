public class HashTable<T> {
    private ListaEncadeada[] meuVetor;

    public HashTable(int m) {
        if (primoOuNao(m)) {
            meuVetor = new ListaEncadeada[m];
        }
        else {
            meuVetor = new ListaEncadeada[proximoPrimo(m)];
        }
    }

    public int hash(String str) {
        int valor = 0;
        for (int i = 0; i < str.length(); i++) {
            char caractere = str.charAt(i);
            int valorAscii = (int) caractere;
            
            valor += valorAscii * (i + 1);
        }

        return valor % meuVetor.length;
    }

    public void insere(String str) {
        int local = hash(str);

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

    public void remove(String str) {
        if (busca(str)) {
            int local = hash(str);
            meuVetor[local].remover(str);
            System.out.println("A string " + str + " foi removida.");
        }
        else {
            System.out.println("Essa string não existe!");
        }
    }
    
    public boolean busca(String str) {
        int local = hash(str);

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

    public void imprime(int p) {
        if (p < 0) {
            System.out.println("O número passado não pode ser menor que 0.");
        }
        else if (p >= meuVetor.length) {
            System.out.println("O número " + p + " excede o tamanho do vetor.");
        }
        else if (meuVetor[p] == null) {
            System.out.println("Não existe nada na posição " + p + ".");
        }
        else {
            meuVetor[p].imprimir();
        }
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