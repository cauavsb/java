package lista_114;
import java.util.Scanner;
import java.util.ArrayList;
public class Teste {
	public static void desejo() {
        System.out.println("[1] CADASTRAR CÍRCULO");
        System.out.println("[2] CADASTRAR RETÂNGULO");
        System.out.println("[3] CALCULAR MÉDIA DAS ÁREAS");
        System.out.println("[4] CALCULAR MÉDIA DOS PERÍMETROS");
        System.out.println("[0] SAIR");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ObjetoGeometrico> todos_objetos = new ArrayList();
		while(true) {
			desejo();
            System.out.print("Qual opção você deseja? ");
            int resposta=sc.nextInt();
            sc.nextLine();
            if(resposta==1) {
                System.out.print("Raio: ");
                float r=sc.nextFloat();
                sc.nextLine();
                System.out.print("PI: ");
                float p=sc.nextFloat();
                sc.nextLine();
                todos_objetos.add(new Circulo(r,p));
            }
            else if(resposta==2) {
                System.out.print("Comprimento: ");
                float c=sc.nextFloat();
                sc.nextLine();
                System.out.print("Largura: ");
                float l=sc.nextFloat();
                sc.nextLine();
                todos_objetos.add(new Retangulo(c,l));
            }
            else if(resposta==3) {
                float soma_areas=0;
                int i=0;
                for(i=0;i<todos_objetos.size();i++) {
                    if(todos_objetos.get(i) instanceof Retangulo) {
                        Retangulo ret=(Retangulo) todos_objetos.get(i);
                        soma_areas+=ret.calcularArea();
                    }
                    else if(todos_objetos.get(i) instanceof Circulo) {
                        Circulo cir=(Circulo) todos_objetos.get(i);
                        soma_areas=cir.calcularArea();
                    }
                }
                System.out.println("A média de todas as áreas é: "+soma_areas/todos_objetos.size());
            }
            else if(resposta==4) {
                float soma_perimetros=0;
                int i=0;
                for(i=0;i<todos_objetos.size();i++) {
                    if(todos_objetos.get(i) instanceof Retangulo) {
                        Retangulo ret=(Retangulo) todos_objetos.get(i);
                        soma_perimetros+=ret.calcularArea();
                    }
                    else if(todos_objetos.get(i) instanceof Circulo) {
                        Circulo cir=(Circulo) todos_objetos.get(i);
                        soma_perimetros+=cir.calcularArea();
                    }
                }
                System.out.println("A média de todos os perimetros é: "+soma_perimetros/todos_objetos.size());
            }
            else if(resposta==0) {
                System.out.println("Programa finalizado...");
                break;
            }
            else {
                System.out.println("Opção inexistente!");
            }
        }
    }
}