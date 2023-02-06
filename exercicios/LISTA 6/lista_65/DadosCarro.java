package lista_65;
import java.util.ArrayList;
import java.util.Scanner;
public class DadosCarro {
	public static void desejo() {
	    System.out.println("[1] ANDAR");
	    System.out.println("[2] REABASTECER");
        System.out.println("[3] VERIFICAR A QAUNTIDADE DE COMBUSTÍVEL RESTANTE");
	    System.out.println("[0] ENCERRAR A VIAGEM");
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Carro> todos_carros = new ArrayList();
        System.out.print("Vai colocar quanto de gasolina? ");
		float gasolina=sc.nextFloat();
        sc.nextLine();
        System.out.print("Qual a eficiência? ");
		float e=sc.nextFloat();
		sc.nextLine();
		todos_carros.add(new Carro(e));
		while(true) {
			desejo();
			System.out.print("Qual opção você deseja? ");
			int resposta=sc.nextInt();
			sc.nextLine();
			if(resposta==1) {
                System.out.print("Qual a quilometragem ");
				float km=sc.nextFloat();
                sc.nextLine();
                float possivel=gasolina*todos_carros.get(0).getEficiencia();
                if(possivel>=km) {
                    float necs=km/e;
                    gasolina-=necs;
                    System.out.println("Ok! Vai ser necessário utilizar "+necs+" litros de gasolina.");
                }
                else {
                    System.out.println("REABASTEÇA O CARRO! Não é possível andar essa quilometragem com a gasolina atual.");
                }
            }
            else if(resposta==2) {
                System.out.print("Vai colocar quanto de gasolina? ");
				float g=sc.nextFloat();
                sc.nextLine();
                gasolina+=g;
                System.out.println(g+" litros de gasolina adicionada!");
            }
            else if(resposta==3) {
                System.out.println("Ainda há "+gasolina+" litros de gasolina.");
            }
            else {
                System.out.println("Viagem encerrada...");
                break;
            }
        }
    }
}