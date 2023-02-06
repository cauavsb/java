import java.util.Scanner;
public class questao_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0;
        System.out.print("Digite uma frase: ");
        String frase=sc.nextLine();
        int tamanho=frase.length();
        for(int i=0;i<tamanho;i++) {
            char letra = frase.charAt(i);
            if(letra>=97 && letra<=122) {
            cont = cont + 1;
            }
        }
        System.out.print("Essa frase tem "+cont+" letras.");
    }
}