public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila(5);
        fila.insere(1);
        fila.insere(3);
        fila.insere(5);
        fila.insere(7);
        fila.insere(9);
        System.out.println("Fila após inserção: ");
        fila.imprime();

    
        fila.remove();
        fila.remove();
        System.out.println("Fila após remoção: ");
        fila.imprime();
    }
}