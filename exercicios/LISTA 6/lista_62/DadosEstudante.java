package lista_62;
import java.util.Scanner;
import java.util.ArrayList;
public class DadosEstudante {
    public static void desejo() {
	    System.out.println("[1] CADASTRAR UM ESTUDANTE");
	    System.out.println("[2] OBTER O NOME DO ESTUDANTE");
	    System.out.println("[3] CALCULAR MÉDIA");
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
				System.out.print("Nota 1: ");
				float n1=sc.nextFloat();
				sc.nextLine();
                System.out.print("Nota 2: ");
				float n2=sc.nextFloat();
				sc.nextLine();
                todos_estudantes.add(new Estudante(n,m,n1,n2));
                System.out.println("Estudante criado!");
            }
            else if(resposta==2) {
                if(todos_estudantes.size()==0) {
                    System.out.println("Nenhum estudante foi criado!");
                }
                else if(todos_estudantes.size()==1) {
                    System.out.println("Apenas um estudante estudante foi criado. Sendo assim, o nome dele é "+(todos_estudantes.get(0)).nome_pela_matricula());
                }
                else {
                    System.out.print("Digite o número da matrícula: ");
					int mat=sc.nextInt();
					sc.nextLine();
                    int i;
                    for(i=0;i<todos_estudantes.size();i++) {
                        if(todos_estudantes.get(i).matricula_estudante()==mat) {
					        System.out.println("Estudante: "+(todos_estudantes.get(i)).nome_pela_matricula());
                            break;
                        }
                    }
                }
            }
            else if(resposta==3) {
                if(todos_estudantes.size()==0) {
                    System.out.println("Nenhum estudante foi criado!");
                }
                else if(todos_estudantes.size()==1) {
                    System.out.println("Apenas um estudante foi criado! Sendo assim, a média de "+(todos_estudantes.get(0)).nome_pela_matricula()+" é "+(todos_estudantes.get(0)).media());
                    if(todos_estudantes.get(0).media()>=7) {
                        System.out.println("Estudante aprovado!");
                    }
                    else {
                        System.out.println("Estudante reprovado!");
                    }
                }
                else {
                System.out.print("Digite o número da matrícula do aluno que você deseja saber a média: ");
				int mat=sc.nextInt();
				sc.nextLine();
                int i;
                    for(i=0;i<todos_estudantes.size();i++) {
                        if(todos_estudantes.get(i).matricula_estudante()==mat) {
					        System.out.println("Média: "+(todos_estudantes.get(i)).media());
                            if(todos_estudantes.get(i).media()>=7) {
                                System.out.println("Estudante aprovado!");
                                break;
                            }
                            else {
                                System.out.println("Estudante reprovado!");
                                break;
                            }
                        }
                    }
                }
            }
            else {
                break;
            }
    }
}
}