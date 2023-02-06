import java.util.Scanner;
public class questao_5 {
    static float area(float base,float altura) {
        float resultado=base*altura;
        return resultado;
    }

    static float perimetro(float base,float altura) {
        float resultado=(base*2)+(altura*2);
        return resultado;
    }

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.print("Base: ");
    float base=sc.nextFloat();
    System.out.print("Altura: ");
    float altura=sc.nextFloat();
    System.out.println("[1] Área do retângulo");
    System.out.println("[2] Perímetro do retângulo");
    System.out.print("Qual das opções você deseja? ");
    int escolha=sc.nextInt();
    if(escolha==1) {
        System.out.print("A área desse retângulo é igual a "+area(base,altura)+" metros.");
    }
    else if(escolha==2) {
        System.out.print("O perímetro desse retângulo é igual a "+perimetro(base,altura)+" metros.");
    }
    else {
        System.out.print("Essa opção não existe!");
    }
}
}