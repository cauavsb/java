import java.util.Scanner;
public class questao_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        float somador=0;
        float maior=0;
        float menor=0;
        float media=0;
        for(i=0;i<10;i++) {
            System.out.print("Digite um número: ");
            float numero = sc.nextFloat();
            somador+=numero;
            if(numero>maior) {
                maior=numero;
            }
            else if(numero<menor) {
                menor=numero;
            }
        }
        media=somador/10;
        System.out.println("O maior número digitado foi o "+maior);
        System.out.println("O menor número digitado foi o "+menor);
        System.out.println("A média dos números digitados foi igual a "+media);
    }
}