package pilha;

public class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        
        pilha.push(10);

        System.out.println(pilha.getTopo());
    }
}