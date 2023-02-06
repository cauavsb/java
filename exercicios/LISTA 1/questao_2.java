import java.util.Scanner;
public class questao_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float media = 0;
		float cont = 0;
		int i=0;
		for(i=0;i<5;i++) {
			System.out.print("Digite a altura: ");
			float altura = sc.nextFloat();
			cont = cont + altura;
		}
		media = cont/5;
		System.out.print("A média de altura é "+media);
	}
}