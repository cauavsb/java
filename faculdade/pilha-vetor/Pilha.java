public class Pilha {
    private int elementosInseridos;
    private int tamanhoVetor;
    private String vetor[];

    public Pilha(int tamanhoVetor) {
        this.elementosInseridos = 0;
        this.tamanhoVetor = tamanhoVetor;
        this.vetor = new String[tamanhoVetor];
    }

    public void push(String elemento) {
        if (elementosInseridos >= tamanhoVetor) {
            System.out.println("PILHA CHEIA");
        }
        else {
            vetor[elementosInseridos] = elemento;
            elementosInseridos++;
        }
    }

    public void pop() {
        if (pilhaVazia()) {
            System.out.println("PILHA VAZIA");
        }
        else {
            elementosInseridos--;
        }
    }

    public void imprime() {
        if (pilhaVazia()) {
            System.out.println("PILHA VAZIA");
        }
        else {
            int i = 0;
            while (i < elementosInseridos) {
                System.out.print(vetor[i] + " ");
                i++;
            }
            System.out.println();
        }
    }

    public Boolean pilhaVazia() {
        return elementosInseridos == 0;
    }

    public int getTamanhoVetor() {
        return tamanhoVetor;
    }
    public void setTamanhoVetor(int tamanhoVetor) {
        this.tamanhoVetor = tamanhoVetor;
    }
    public String[] getVetor() {
        return vetor;
    }
    public void setVetor(String[] vetor) {
        this.vetor = vetor;
    }
    public int getElementosInseridos() {
        return elementosInseridos;
    }
    public void setElementosInseridos(int elementosInseridos) {
        this.elementosInseridos = elementosInseridos;
    }
}