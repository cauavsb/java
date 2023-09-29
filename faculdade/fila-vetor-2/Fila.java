public class Fila {
    private int inicio;
    private int elementosInseridos;
    private int tamanhoVetor;
    private String vetor[];

    public Fila(int tamanhoVetor) {
        this.inicio = 0;
        this.elementosInseridos = 0;
        this.tamanhoVetor = tamanhoVetor;
        this.vetor = new String[tamanhoVetor];
    }

    public void insere(String elemento) {
        if (filaCheia()) {
            System.out.println("FILA CHEIA");
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
            System.out.println("FILA VAZIA");
        }
        else {
            inicio = (inicio + 1) % tamanhoVetor;
            elementosInseridos--;
        }
    }

    public void imprime() {
        if (filaVazia()) {
            System.out.println("FILA VAZIA");
        }
        else {

        }
    }

    public Boolean filaVazia() {
        return elementosInseridos == 0;
    }

    public Boolean filaCheia() {
        return elementosInseridos == tamanhoVetor;
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
    public String[] getVetor() {
        return vetor;
    }
    public void setVetor(String[] vetor) {
        this.vetor = vetor;
    }
}