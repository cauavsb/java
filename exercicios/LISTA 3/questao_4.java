import java.util.Scanner;
public class questao_4 {
    static float imposto(float salario) {
    if(salario<=2000.00) {
        float valor=0.0f;
        return valor;
    }
    else if(salario>2000 && salario<=3500) {
        float valor=(salario*15)/100;
        return valor;
    }
    else if(salario>3500 && salario<=5000) {
        float valor=(salario*22)/100;
        return valor;
    }
    else {
        float valor=(salario*30)/100;
        return valor;
    }
    }

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Digite seu salário: ");
    float salario = sc.nextFloat();
    System.out.print("Você pagará R$ "+(imposto(salario))+" de imposto.");
}
}