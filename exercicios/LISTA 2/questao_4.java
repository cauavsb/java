import java.util.Scanner;
public class questao_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] numeros=new float[10];
        for(int i=0;i<10;i++) {
            System.out.print("Digite um número: ");
            float numero = sc.nextFloat();
            numeros[i]=numero;
        }
        System.out.println("Números na ordem inversa: ");
        for(int i=9;i>=0;i--) {
            System.out.println(numeros[i]);
        }
    }
}