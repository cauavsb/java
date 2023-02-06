import java.util.Scanner;
public class questao_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        float cont=0;
        float[] todos_numeros=new float[10];
        for(i=0;i<10;i++) {
            System.out.print("Digite um número: ");
            float numero = sc.nextFloat();
            cont = cont + numero;
            todos_numeros[i]=numero;
        }
        System.out.print("A soma dos números digitados é "+cont);
    }
}