import java.util.Scanner;
public class questao_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase=sc.nextLine();
        int cont=frase.length();
        for(int i=cont-1;i>=0;i--) {
            System.out.print(frase.charAt(i));
        }
    }
}