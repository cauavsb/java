package lista_111;
import java.util.Scanner;
public class Teste {
	public static void desejo() {
	    System.out.println("[1] CADASTRAR RETÂNGULO");
        System.out.println("[2] CADASTRAR CÍRCULO");
        System.out.println("[3] CADASTRAR QUADRADO");
        System.out.println("[4] MOSTRAR O VALOR DE TODAS AS ÁREAS");
        System.out.println("[5] MOSTRAR O VALOR DE TODOS OS PERÍMETROS");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quadrilatero[] q=new Quadrilatero[10];
        int contagem=0;
		while(true) {
			desejo();
            System.out.print("Qual opção você deseja? ");
            int resposta=sc.nextInt();
            sc.nextLine();
            if(resposta==1) {
                if(contagem<10) {
                    System.out.print("Lado: ");
                    float l=sc.nextFloat();
                    sc.nextLine();
                    System.out.print("Altura: ");
                    float a=sc.nextFloat();
                    sc.nextLine();
                    q[contagem]=(new Retangulo(l,a));
                    contagem+=1;
                }
                else {
                    System.out.println("Você já cadastrou o máximo de figuras!");
                }
            }
            else if(resposta==2) {
                if(contagem<10) {
                    System.out.print("Raio: ");
                    float r=sc.nextFloat();
                    sc.nextLine();
                    q[contagem]=(new Circulo(r));
                    contagem+=1;
                }
                else {
                    System.out.println("Você já cadastrou o máximo de figuras!");
                }
            }
            else if(resposta==3) {
                if(contagem<10) {
                    System.out.print("Lado: ");
                    float l=sc.nextFloat();
                    sc.nextLine();
                    q[contagem]=(new Quadrado(l));
                    contagem+=1;
                }
                else {
                    System.out.println("Você já cadastrou o máximo de figuras!");
                }
            }
            else if(resposta==4) {
                int i=0;
                for(i=0;i<q.length;i++) {
                    if(q[i] instanceof Retangulo) {
                        Retangulo ret=(Retangulo) q[i];
                        System.out.println(ret.calcularArea());
                    }
                    else if(q[i] instanceof Circulo) {
                        Circulo cir=(Circulo) q[i];
                        System.out.println(cir.calcularArea());
                    }
                    else if(q[i] instanceof Quadrado) {
                        Quadrado qua=(Quadrado) q[i];
                        System.out.println(qua.calcularArea());
                    }
                }
            }
            else if(resposta==5) {
                int i=0;
                for(i=0;i<q.length;i++) {
                    if(q[i] instanceof Retangulo) {
                        Retangulo ret=(Retangulo) q[i];
                        System.out.println(ret.calcularPerimetro());
                    }
                    else if(q[i] instanceof Circulo) {
                        Circulo cir=(Circulo) q[i];
                        System.out.println(cir.calcularPerimetro());
                    }
                    else if(q[i] instanceof Quadrado) {
                        Quadrado qua=(Quadrado) q[i];
                        System.out.println(qua.calcularPerimetro());
                    }
                }
            }
            else {
                System.out.println("Opção inexistente!");
            }
        }
    }
}