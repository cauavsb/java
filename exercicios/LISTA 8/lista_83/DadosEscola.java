package lista_83;
import java.util.ArrayList;
import java.util.Scanner;
public class DadosEscola {
	public static void desejo() {
	    System.out.println("[1] CADASTRAR TURMA");
	    System.out.println("[2] CADASTRAR ESTUDANTE");
        System.out.println("[3] LISTAR TURMAS");
        System.out.println("[4] LISTAR ESTUDANTES POR TURMA");
        System.out.println("[5] CONSULTAR MÉDIA DE UM ESTUDANTE");
        System.out.println("[6] ALTERAR NOTAS DE UM ESTUDANTE");
        System.out.println("[7] EXIBIR MÉDIA DOS ESTUDANTES DE UMA TURMA");
	    System.out.println("[0] SAIR");
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Turma> todas_turmas = new ArrayList();
        ArrayList<Estudante> todos_estudantes = new ArrayList();
        ArrayList<String> todos_codigos = new ArrayList();
        ArrayList<String> todas_matriculas = new ArrayList();
        int quantidade_turmas=0;
		while(true) {
			desejo();
			System.out.print("Qual opção você deseja? ");
			int resposta=sc.nextInt();
			sc.nextLine();
            int numero_alunos=0;
			if(resposta==1) {
                if(quantidade_turmas<10) {
                    System.out.print("Código da turma: ");
		            String c=sc.nextLine();
                    todos_codigos.add(c);
                    System.out.print("Nome da turma: ");
				    String n=sc.nextLine();
                    while(true) {
		                System.out.print("Tem algum estudante para ser cadastrado? [S/N] ");
			            String pergunta=sc.nextLine();
                        if(pergunta.equals("S")) {
                            if(numero_alunos<10) {
                                System.out.print("Matrícula do estudante: ");
		                        String m=sc.nextLine();
                                todas_matriculas.add(m);
                                System.out.print("Nome do estudante: ");
				                String nome_e=sc.nextLine();
                                System.out.print("1ª nota do estudante: ");
				                int n_1=sc.nextInt();
                                sc.nextLine();
                                System.out.print("2ª nota do estudante: ");
				                int n_2=sc.nextInt();
                                sc.nextLine();
                                System.out.print("3ª nota do estudante: ");
				                int n_3=sc.nextInt();
                                sc.nextLine();
                                System.out.print("4ª nota do estudante: ");
				                int n_4=sc.nextInt();
                                sc.nextLine();
                                todos_estudantes.add(new Estudante(m,nome_e,n_1,n_2,n_3,n_4));
                                numero_alunos+=1;
                            }
                        }
                        else {
                            quantidade_turmas+=1;
                            todas_turmas.add(new Turma(c,n,numero_alunos,todos_estudantes));
                            System.out.println("Cadastro finalizado!");
                            break;
                        }
                    }
                }
                else {
                    System.out.println("Ops... limite máximo de turmas atingido!");
                }
            }
            else if(resposta==2) {
                if(todas_turmas.size()==0) {
                    System.out.println("Ops... nenhuma turma foi cadastradoa!");
                }
                else {
                    System.out.print("Qual o código da turma? ");
				    String c=sc.nextLine();
                    if(todos_codigos.contains(c)) {
                        int i=0;
                        for(i=0;i<todas_turmas.size();i++) {
                            if(todas_turmas.get(i).getCodigo().equals(c)) {
                                System.out.println("Turma encontrada!");
                                if(todas_turmas.get(i).getNumero_alunos()<10) {
                                    System.out.print("Matrícula do estudante: ");
                                    String m=sc.nextLine();
                                    todas_matriculas.add(m);
                                    System.out.print("Nome do estudante: ");
                                    String nome_e=sc.nextLine();
                                    System.out.print("1ª nota do estudante: ");
                                    int n_1=sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("2ª nota do estudante: ");
                                    int n_2=sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("3ª nota do estudante: ");
                                    int n_3=sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("4ª nota do estudante: ");
                                    int n_4=sc.nextInt();
                                    sc.nextLine();
                                    todas_turmas.get(i).getEstudantes().add(new Estudante(m,nome_e,n_1,n_2,n_3,n_4));
                                    int nova_quant=todas_turmas.get(i).getNumero_alunos()+1;
                                    todas_turmas.get(i).setNumero_alunos(nova_quant);
                                    System.out.println("Estudante cadastrado com sucesso!");
                                    break;
                                }
                                else {
                                    System.out.print("Essa turma já alcançou o número máximo de estudantes!");
                                    break;
                                }
                            }
                        }
                    }
                    else {
                        System.out.println("Nenhuma turma com esse código foi encontrada!");
                    }
                }
            }
            else if(resposta==3) {
                if(todas_turmas.size()==0) {
                    System.out.println("Ops... nenhum turma foi cadastrada!");
                }
                else {
                    System.out.println("-> TURMAS CADASTRADAS <-");
                    int i=0;
                    for(i=0;i<todas_turmas.size();i++) {
                        System.out.println("Código: "+todas_turmas.get(i).getCodigo()+" -> Nome: "+todas_turmas.get(i).getNome());
                    }
                }
            }
            else if(resposta==4) {
                if(todas_turmas.size()==0) {
                    System.out.println("Ops... nenhuma turma foi cadastrada!");
                }
                else {
                    System.out.print("Qual o código da turma? ");
				    String c=sc.nextLine();
                    if(todos_codigos.contains(c)) {
                        int i=0;
                        for(i=0;i<todas_turmas.size();i++) {
                            if(todas_turmas.get(i).getCodigo().equals(c)) {
                                System.out.println("-> ESTUDANTES CADASTRADOS NA TURMA <-");
                                int a=0;
                                for(a=0;a<todos_estudantes.size();a++) {
                                    System.out.println("Matrícula: "+todos_estudantes.get(a).getMatricula()+" -> Nome: "+todos_estudantes.get(a).getAluno());
                                }
                                break;
                            }
                        }
                    }
                    else {
                        System.out.println("Nenhuma turma com esse código foi encontrada!");
                    }
                }
            }
            else if(resposta==5) {
                if(todas_turmas.size()==0) {
                    System.out.println("Ops... nenhuma turma foi cadastrada!");
                }
                else {
                    System.out.print("Qual o código da turma? ");
				    String c=sc.nextLine();
                    if(todos_codigos.contains(c)) {
                        System.out.print("Qual o número da matrícula do aluno? ");
				        String m=sc.nextLine();
                        if(todas_matriculas.contains(m)) {
                            int i=0;
                            for(i=0;i<todas_turmas.size();i++) {
                                if(todas_turmas.get(i).getCodigo().equals(c)) {
                                    int a=0;
                                    for(a=0;a<todos_estudantes.size();a++) {
                                        if(todos_estudantes.get(a).getMatricula().equals(m)) {
                                            System.out.println("Matrícula: "+todos_estudantes.get(a).getMatricula());
                                            System.out.println("Estudante: "+todos_estudantes.get(a).getAluno());
                                            System.out.println("Média: "+(todos_estudantes.get(a).getNota_1()+todos_estudantes.get(a).getNota_2()+todos_estudantes.get(a).getNota_3()+todos_estudantes.get(a).getNota_4())/4);
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        else {
                            System.out.println("Nenhum aluno com esse número de matrícula foi encontrado!");
                        }
                    }
                    else {
                        System.out.println("Nenhuma turma com esse código foi encontrada!");
                    }
                }
            }
            else if(resposta==6) {
                if(todas_turmas.size()==0) {
                    System.out.println("Ops... nenhuma turma foi cadastrada!");
                }
                else {
                    System.out.print("Qual o código da turma? ");
				    String c=sc.nextLine();
                    if(todos_codigos.contains(c)) {
                        System.out.print("Qual o número da matrícula do aluno? ");
				        String m=sc.nextLine();
                        if(todas_matriculas.contains(m)) {
                            int i=0;
                            for(i=0;i<todas_turmas.size();i++) {
                                if(todas_turmas.get(i).getCodigo().equals(c)) {
                                    int a=0;
                                    for(a=0;a<todos_estudantes.size();a++) {
                                        if(todos_estudantes.get(a).getMatricula().equals(m)) {
                                            System.out.print("1ª nota já alterada: ");
                                            int nova_n1=sc.nextInt();
                                            sc.nextLine();
                                            System.out.print("2ª nota já alterada: ");
                                            int nova_n2=sc.nextInt();
                                            sc.nextLine();
                                            System.out.print("3ª nota já alterada: ");
                                            int nova_n3=sc.nextInt();
                                            sc.nextLine();
                                            System.out.print("4ª nota já alterada: ");
                                            int nova_n4=sc.nextInt();
                                            sc.nextLine();
                                            todos_estudantes.get(a).setNota_1(nova_n1);
                                            todos_estudantes.get(a).setNota_2(nova_n2);
                                            todos_estudantes.get(a).setNota_3(nova_n3);
                                            todos_estudantes.get(a).setNota_4(nova_n4);
                                            System.out.println("Notas modificadas com sucesso!");
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        else {
                            System.out.println("Nenhum aluno com esse número de matrícula foi encontrado!");
                        }
                    }
                    else {
                        System.out.println("Nenhuma turma com esse código foi encontrada!");
                    }
                }
            }
            else if(resposta==7) {
                if(todas_turmas.size()==0) {
                    System.out.println("Ops... nenhuma turma foi cadastrada!");
                }
                else {
                    System.out.print("Qual o código da turma? ");
				    String c=sc.nextLine();
                    if(todos_codigos.contains(c)) {
                        System.out.println("-> MÉDIAS DOS ALUNOS DESTA TURMA <-");
                        int i=0;
                        for(i=0;i<todas_turmas.size();i++) {
                            if(todas_turmas.get(i).getCodigo().equals(c)) {
                                int a=0;
                                for(a=0;a<todos_estudantes.size();a++) {
                                    System.out.println("Estudante: "+todos_estudantes.get(a).getAluno()+" -> Média: "+(todos_estudantes.get(a).getNota_1()+todos_estudantes.get(a).getNota_2()+todos_estudantes.get(a).getNota_3()+todos_estudantes.get(a).getNota_4())/4);
                                }
                                break;
                            }
                        }
                    }
                    else {
                        System.out.println("Nenhum aluno com esse número de matrícula foi encontrado!");
                    }
                }
            }
            else {
                System.out.println("Saindo...");
                break;
            }
        }
    }
}