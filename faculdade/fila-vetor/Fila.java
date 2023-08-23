public class Fila {
    private int inicio;
    private int elementosInseridos;
    private int tamanhoVetor;
    private float vetor[];

    public Fila(int tamanhoVetor) {
        this.inicio = 0;
        this.elementosInseridos = 0;
        this.tamanhoVetor = tamanhoVetor;
        this.vetor = new float[tamanhoVetor];
    }

    public void insere(float elemento) {
        if (elementosInseridos == tamanhoVetor) {
            System.out.println("A fila já está cheia!");
        }
        else {
            int localInserir;
            if ((inicio + elementosInseridos) >= tamanhoVetor) {
                localInserir = inicio + elementosInseridos - tamanhoVetor;
                vetor[localInserir] = elemento;
                elementosInseridos++;
            } 
            else {
                localInserir = inicio + elementosInseridos;
                vetor[localInserir] = elemento;
                elementosInseridos++;
            }
        }
    }

    public void remove() {
        if (filaVazia()) {
            System.out.println("A fila está vazia!");
        }
        else {
            inicio = (inicio + 1) % tamanhoVetor;
            elementosInseridos--;
        }    
    }

    public void imprime() {
        if (filaVazia()) {
            System.out.println("A fila está vazia!");
        }
        else {
            for (int i = 0; i < elementosInseridos; i++) {
                System.out.println(vetor[(inicio + i) % tamanhoVetor]);
            }
        }
    }

    public Boolean filaVazia() {
        return elementosInseridos == 0;
    }

    public int getInicio() {
        return inicio;
    }
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getElementosInseridos() {
        return elementosInseridos;
    }
    public void setElementosInseridos(int elementosInseridos) {
        this.elementosInseridos = elementosInseridos;
    }

    public int getTamanhoVetor() {
        return tamanhoVetor;
    }
    public void setTamanhoVetor(int tamanhoVetor) {
        this.tamanhoVetor = tamanhoVetor;
    }

    public float[] getVetor() {
        return vetor;
    }
    public void setVetor(float[] vetor) {
        this.vetor = vetor;
    }
}