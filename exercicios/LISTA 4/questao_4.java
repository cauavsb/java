import java.util.Scanner;
import java.util.ArrayList;
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
    ArrayList<String> nomes = new ArrayList();
    ArrayList<Float> salarios = new ArrayList();
    while(true) {
    System.out.println("-> MENU DE OPÇÕES <-");
    System.out.println("1. Cadastrar funcionário");
    System.out.println("2. Calcular imposto");
    System.out.println("0. Sair");
    System.out.print("Qual opção você deseja? ");
    int opcao=sc.nextInt();
    sc.nextLine();
    if(opcao==1) {
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        nomes.add(nome);
        System.out.print("Digite seu salário: ");
        float salario = sc.nextFloat();
        sc.nextLine();
        salarios.add(salario);
    }
    else if(opcao==2) {
        float salario_procurado=0;
        int posicao=0;
        System.out.print("Você deseja calcular o imposto de qual funcionário? ");
        String funcionario = sc.nextLine();
        for(int i=0;i<nomes.size();i++) {
            if(nomes.get(i).equals(funcionario)) {
                posicao=i;
                break;
            }
        }
        salario_procurado=salarios.get(posicao);
        System.out.println("Você pagará R$ "+(imposto(salario_procurado))+" de imposto.");
    }
    else if(opcao==0) {
        break;
    }
    else {
        System.out.println("Opção inexistente.");
    }
    }
}
}