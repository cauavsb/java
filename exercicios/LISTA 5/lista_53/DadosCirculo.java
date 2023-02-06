package lista_53;
import java.util.ArrayList;
import java.util.Scanner;
public class DadosCirculo {
	public static void desejo() {
	    System.out.println("[1] CRIAR UM CÍRCULO");
	    System.out.println("[2] CALCULAR ÁREA");
	    System.out.println("[3] CALCULAR PERÍMETRO");
	    System.out.println("[0] SAIR");
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Circulo> todos_circulos = new ArrayList();
		while(true) {
			desejo();
			System.out.print("Qual opção você deseja? ");
			int resposta=sc.nextInt();
			sc.nextLine();
			if(resposta==1) {
				System.out.print("Raio: ");
				float r=sc.nextFloat();
				sc.nextLine();
				todos_circulos.add(new Circulo(r));
				System.out.println("Círculo criado!");
			}
			else if(resposta==2) {
				if(todos_circulos.size()==0) {
					System.out.println("Não há nenhum círculo criado!");
				}
				else if(todos_circulos.size()==1) {
					System.out.println("Área: "+(todos_circulos.get(0)).area());
				}
				else {
					System.out.print("Você deseja calcular a área de qual dos "+todos_circulos.size()+" círculos criados? ");
					int opcao=sc.nextInt();
					sc.nextLine();
					System.out.println("Área: "+(todos_circulos.get(opcao-1)).area());
				}
			}
			else if(resposta==3) {
				if(todos_circulos.size()==0) {
					System.out.println("Não há nenhum círculo criado!");
				}
				else if(todos_circulos.size()==1) {
					System.out.println("Perímetro: "+(todos_circulos.get(0)).perimetro());
				}
				else {
					System.out.print("Você deseja calcular a área de qual dos "+todos_circulos.size()+" círculos criados? ");
					int opcao=sc.nextInt();
					sc.nextLine();
					System.out.println("Perímetro: "+(todos_circulos.get(opcao-1)).perimetro());
				}
			}
			else {
				break;
			}
}
}
}