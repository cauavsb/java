import java.util.Scanner;
public class questao_3 {
    static int vogais(String frase) {
    int cont=0;
    int tamanho=frase.length();
    for(int i=0;i<tamanho;i++) {
    char letra = frase.charAt(i);
    if(letra==97 | letra==101 | letra==105 | letra==111 | letra==117) {
        cont = cont + 1;
    }
    }
    return cont;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.print("Digite uma frase: ");
    String frase=sc.nextLine();
    System.out.print("Essa frase tem "+vogais(frase)+" vogais.");
}
}