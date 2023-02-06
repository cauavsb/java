import java.util.Scanner;
public class questao_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float media = 0;
		float cont = 0;
        float soma_idades = 0;
		while(true) {
		    System.out.print("Informe a sua idade: ");
            int idade = sc.nextInt();
            if(idade!=0) {
                soma_idades = soma_idades + idade;
                cont = cont + 1;
            }
            else {
                media = soma_idades/cont;
                System.out.print("A média de altura é "+media);
                break;
            }
		}
    }
}