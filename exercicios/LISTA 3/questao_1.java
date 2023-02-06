import java.util.Scanner;
public class questao_1 {
    static String par_impar(int numero) {
        if(numero%2==0) {
            String resposta="Esse número é par!";
            return resposta;
        }
        else {
            String resposta="Esse número é ímpar!";
            return resposta;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        System.out.print(par_impar(numero));
    }
}