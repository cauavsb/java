public class TesteFila {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();
        fila.insere("1");
        fila.insere("2");
        fila.insere("3");
    
        System.out.print("Fila atual: ");
        fila.imprime(); // 1 2 3
        System.out.println("Início: " + fila.getInicio().getElemento()); // 1
        System.out.println("Fim: " + fila.getFim().getElemento()); // 3
        System.out.println("-----------------------------------");

        fila.remove();
        fila.remove();
        
        System.out.print("Fila atual: ");
        fila.imprime(); // 3
        System.out.println("Início: " + fila.getInicio().getElemento()); // 3
        System.out.println("Fim: " + fila.getFim().getElemento()); // 3
        System.out.println("-----------------------------------");

        fila.remove();
        
        System.out.print("Fila atual: ");
        fila.imprime(); // FILA VAZIA
        System.out.println("Início: " + fila.getInicio()); // null
        System.out.println("Fim: " + fila.getFim()); // null
        System.out.println("-----------------------------------");

        fila.insere("4");
        fila.insere("5");
        fila.insere("6");
        fila.insere("7");
        fila.insere("8");

        fila.remove();
        
        System.out.print("Fila atual: ");
        fila.imprime(); // 5 6 7 8
        System.out.println("Início: " + fila.getInicio().getElemento()); // 5
        System.out.println("Fim: " + fila.getFim().getElemento()); // 8
        System.out.println("-----------------------------------");

        fila.insere("9");
        
        System.out.print("Fila atual: ");
        fila.imprime(); // 5 6 7 8 9
        System.out.println("Início: " + fila.getInicio().getElemento()); // 5
        System.out.println("Fim: " + fila.getFim().getElemento()); // 9
    }
}