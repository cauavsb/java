import java.util.Scanner;
public class questao_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float numero_1 = sc.nextFloat();
        sc.nextLine();
        System.out.print("Digite outro número: ");
        float numero_2 = sc.nextFloat();
        sc.nextLine();
        System.out.print("Deseja fazer qual operação? ");
        String operador = sc.nextLine();
        if(operador.equals("+")) {
            System.out.print("Resultado: "+(numero_1+numero_2));
        }
        else if(operador.equals("-")) {
            System.out.print("Resultado: "+(numero_1-numero_2));
        }
        else if(operador.equals("*")) {
            System.out.print("Resultado: "+(numero_1*numero_2));
        }
        else if(operador.equals("/")) {
            System.out.print("Resultado: "+(numero_1/numero_2));
        }
        else {
            System.out.print("Você digitou um operador inexistente! Tente novamente.");
        }
    }
}