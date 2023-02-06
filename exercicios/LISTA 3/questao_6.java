import java.util.Scanner;
public class questao_6 {
    static float fahrenheit_celsius(float graus) {
        float resultado=(5*(graus-32))/9;
        return resultado;
    }

    static float kelvin_celsius(float graus) {
        float resultado=graus-273;
        return resultado;
    }

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.println("[1] Transformar de Fahrenheit para Celsius");
    System.out.println("[2] Transformar de Kelvin para Celsius");
    System.out.print("Qual das opções você deseja? ");
    int escolha=sc.nextInt();
    if(escolha==1) {
        System.out.println("Ok. Agora, informe a temperatura em graus Fahrenheit.");
        System.out.print("Fahrenheit: ");
        float graus=sc.nextFloat();
        System.out.print("Resultado: "+fahrenheit_celsius(graus)+" graus Celsius");
    }
    else if(escolha==2) {
        System.out.println("Ok. Agora, informe a temperatura em Kelvin.");
        System.out.print("Kelvin: ");
        float graus=sc.nextFloat();
        System.out.print("Resultado: "+kelvin_celsius(graus)+" graus Celsius");
    }
    else {
        System.out.print("Essa opção não existe!");
    }
}
}