package lista_51;
import java.util.Scanner;
import java.util.ArrayList;
public class DadosEstudante {
    public static void desejo() {
	    System.out.println("[1] CRIAR UM ESTUDANTE");
	    System.out.println("[2] CALCULAR MÉDIA");
	    System.out.println("[3] OBTER NÚMERO DE MATRÍCULA");
	    System.out.println("[4] OBTER ENDEREÇO");
        System.out.println("[0] SAIR");
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Estudante> todos_estudantes = new ArrayList();
		while(true) {
			desejo();
			System.out.print("Qual opção você deseja? ");
			int resposta=sc.nextInt();
			sc.nextLine();
            if(resposta==1) {
                System.out.print("Nome: ");
				String n=sc.nextLine();
				System.out.print("Matrícula: ");
				int m=sc.nextInt();
				sc.nextLine();
                System.out.print("Endereço: ");
				String end=sc.nextLine();
				System.out.print("Nota 1: ");
				float n1=sc.nextFloat();
				sc.nextLine();
                System.out.print("Nota 2: ");
				float n2=sc.nextFloat();
				sc.nextLine();
                System.out.print("Nota 3: ");
				float n3=sc.nextFloat();
				sc.nextLine();
                System.out.print("Nota 4: ");
				float n4=sc.nextFloat();
				sc.nextLine();
                todos_estudantes.add(new Estudante(n,m,end,n1,n2,n3,n4));
                System.out.println("Estudante criado!");
            }
            else if(resposta==2) {
                if(todos_estudantes.size()==0) {
                    System.out.println("Nenhum estudante foi criado!");
                }
                else if(todos_estudantes.size()==1) {
                    System.out.println("Média: "+(todos_estudantes.get(0)).media());
                }
                else {
                    System.out.print("Você deseja calcular a média de qual dos "+todos_estudantes.size()+" estudantes criados? ");
					int opcao=sc.nextInt();
					sc.nextLine();
					System.out.println("Média: "+(todos_estudantes.get(opcao-1)).media());
                }
            }
            else if(resposta==3) {
                if(todos_estudantes.size()==0) {
                    System.out.println("Nenhum estudante foi criado!");
                }
                else if(todos_estudantes.size()==1) {
                    System.out.println("Matrícula: "+(todos_estudantes.get(0)).numero_matricula());
                }
                else {
                System.out.print("Você deseja obter a matrícula de qual dos "+todos_estudantes.size()+" estudantes criados? ");
				int opcao=sc.nextInt();
				sc.nextLine();
				System.out.println("Matrícula: "+(todos_estudantes.get(opcao-1)).numero_matricula());
                }
            }
            else if(resposta==4) {
                if(todos_estudantes.size()==0) {
                    System.out.println("Nenhum estudante foi criado!");
                }
                else if(todos_estudantes.size()==1) {
                    System.out.println("Endereço: "+(todos_estudantes.get(0)).endereco_aluno());
                }
                else {
                System.out.print("Você deseja obter o endereço de qual dos "+todos_estudantes.size()+" estudantes criados? ");
				int opcao=sc.nextInt();
				sc.nextLine();
				System.out.println("Endereço: "+(todos_estudantes.get(opcao-1)).endereco_aluno());
                }
            }
            else {
                break;
            }
    }
}
}