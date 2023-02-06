package lista_113;
import java.util.Scanner;
import java.util.ArrayList;
public class Teste {
	public static void desejo() {
	    System.out.println("[1] ADICIONAR UMA NOTA");
        System.out.println("[2] REMOVER A ÚLTIMA NOTA");
        System.out.println("[3] CALCULAR A MÉDIA");
        System.out.println("[4] MOSTRAR A MAIOR NOTA TIRADA");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> notas=new ArrayList();
        int contagem=0;
		while(true) {
			desejo();
            System.out.print("Qual opção você deseja? ");
            int resposta=sc.nextInt();
            sc.nextLine();
            if(resposta==1) {
                System.out.print("Qual a nota? ");
                String n=sc.nextLine();
                notas.add(n);
                System.out.println("Nota adicionada!");
            }
            else if(resposta==2) {
                remover(notas);
                System.out.println("Última nota removida!");
            }
            else if(resposta==3) {
                
            }
            else if(resposta==4) {
                
            }
            else {
                System.out.println("Opção inexistente!");
            }
        }
    }
}