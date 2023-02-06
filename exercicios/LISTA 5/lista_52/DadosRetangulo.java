package lista_52;
import java.util.ArrayList;
import java.util.Scanner;
public class DadosRetangulo {
	public static void desejo() {
	    System.out.println("[1] CRIAR UM RETÂNGULO");
	    System.out.println("[2] CALCULAR ÁREA");
	    System.out.println("[3] CALCULAR PERÍMETRO");
	    System.out.println("[0] SAIR");
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Retangulo> todos_retangulos = new ArrayList();
		while(true) {
			desejo();
			System.out.print("Qual opção você deseja? ");
			int resposta=sc.nextInt();
			sc.nextLine();
			if(resposta==1) {
				System.out.print("Base: ");
				float b=sc.nextFloat();
				sc.nextLine();
				System.out.print("Altura: ");
				float h=sc.nextFloat();
				sc.nextLine();
				todos_retangulos.add(new Retangulo(b,h));
				System.out.println("Retêngulo criado!");
			}
			else if(resposta==2) {
				if(todos_retangulos.size()==0) {
					System.out.println("Não há nenhum retângulo criado!");
				}
				else if(todos_retangulos.size()==1) {
					System.out.println("Área: "+(todos_retangulos.get(0)).area());
				}
				else {
					System.out.print("Você deseja calcular a área de qual dos "+todos_retangulos.size()+" retângulos criados? ");
					int opcao=sc.nextInt();
					sc.nextLine();
					System.out.println("Área: "+(todos_retangulos.get(opcao-1)).area());
				}
			}
			else if(resposta==3) {
				if(todos_retangulos.size()==0) {
					System.out.println("Não há nenhum retângulo criado!");
				}
				else if(todos_retangulos.size()==1) {
					System.out.println("Perímetro: "+(todos_retangulos.get(0)).perimetro());
				}
				else {
					System.out.print("Você deseja calcular a área de qual dos "+todos_retangulos.size()+" retângulos criados? ");
					int opcao=sc.nextInt();
					sc.nextLine();
					System.out.println("Perímetro: "+(todos_retangulos.get(opcao-1)).perimetro());
				}
			}
			else {
				break;
			}
}
}
}