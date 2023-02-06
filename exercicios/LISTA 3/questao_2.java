import java.util.Scanner;
public class questao_2 {
    static float soma(float numero_1,float numero_2) {
        float cont=numero_1+numero_2;
        return cont;
    }

    static float subtracao(float numero_1,float numero_2) {
        float cont=numero_1-numero_2;
        return cont;
    }

    static float multiplicacao(float numero_1,float numero_2) {
        float cont=numero_1*numero_2;
        return cont;
    }

    static float divisao(float numero_1,float numero_2) {
        float cont=numero_1/numero_2;
        return cont;
    }

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Digite um número: ");
    float n1 = sc.nextFloat();
    sc.nextLine();
    System.out.print("Digite outro número: ");
    float n2 = sc.nextFloat();
    sc.nextLine();
    System.out.println("-> MENU DE OPÇÕES <-");
    System.out.println("[1] Retorna a soma entre os dois números");
    System.out.println("[2] Retorna a subtração entre os dois números");
    System.out.println("[3] Retorna a multiplicação entre os dois números");
    System.out.println("[4] Retorna a divisão entre os dois número");
    System.out.print("Deseja fazer qual operação? ");
    int operador = sc.nextInt();
    if(operador==1) {
        System.out.print("Resultado: "+soma(n1,n2));
    }
    else if(operador==2) {
        System.out.print("Resultado: "+subtracao(n1,n2));
    }
    else if(operador==3) {
        System.out.print("Resultado: "+multiplicacao(n1,n2));
    }
    else if(operador==4) {
        System.out.print("Resultado: "+divisao(n1,n2));
    }
    else {
        System.out.print("Você digitou uma opção inexistente! Tente novamente.");
    }
}
}