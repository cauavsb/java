package lista_91;
import java.util.ArrayList;
import java.util.Scanner;
public class DadosLivraria {
	public static void desejo() {
	    System.out.println("[1] CADASTRAR LIVRARIA");
        System.out.println("[2] CADASTRAR FUNCIONÁRIO EM UMA LIVRARIA");
        System.out.println("[3] DEFINIR GERENTE DE UMA LIVRARIA");
        System.out.println("[4] ADICIONAR LIVROS EM UMA LIVRARIA");
        System.out.println("[5] LISTAR OS LIVROS DE UMA LIVRARIA");
        System.out.println("[6] LISTAR OS FUNCIONÁRIOS DE UMA LIVRARIA");
        System.out.println("[7] LISTAR OS GERENTES DAS LIVRARIAS CADASTRADAS");
	    System.out.println("[0] SAIR DA BIBLIOTECA");
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Livraria> todas_livrarias = new ArrayList();
        ArrayList<Funcionario> todos_funcionarios = new ArrayList();
        ArrayList<Livro> todos_livros = new ArrayList();
        ArrayList<String> nomes_livrarias = new ArrayList();
		while(true) {
			desejo();
			System.out.print("Qual opção você deseja? ");
			int resposta=sc.nextInt();
			sc.nextLine();
			if(resposta==1) {
                System.out.print("Nome da livraria: ");
				String nome_l=sc.nextLine();
                nomes_livrarias.add(nome_l);
                System.out.print("Cidade da livraria: ");
				String cidade_l=sc.nextLine();
                System.out.print("Estado da livraria: ");
		        String estado_l=sc.nextLine();
                System.out.print("Gerente da livraria: ");
		        String gerente_l=sc.nextLine();
                while(true) {
                    System.out.print("Tem algum funcionário para ser cadastrado? [S/N] ");
                    String pergunta=sc.nextLine();
                    if(pergunta.equals("S")) {
                        System.out.print("CPF do funcionário: ");
		                String cpf_f=sc.nextLine();
                        System.out.print("Nome do funcionário: ");
		                String nome_f=sc.nextLine();
                        System.out.print("Endereço do funcionário: ");
		                String endereco_f=sc.nextLine();
                        System.out.print("Telefone do funcionário: ");
		                String telefone_f=sc.nextLine();
                        todos_funcionarios.add(new Funcionario(cpf_f, nome_f, endereco_f, telefone_f));
                    }
                    else {
                        break;
                    }
                }
                while(true) {
                    System.out.print("Tem algum livro para ser cadastrado? [S/N] ");
                    String pergunta=sc.nextLine();
                    if(pergunta.equals("S")) {
                        System.out.print("Nome do autor: ");
				        String nome_a=sc.nextLine();
                        System.out.print("ISBN: ");
		                String i=sc.nextLine();
                        System.out.print("Editora: ");
                        String e=sc.nextLine();
                        System.out.print("Título: ");
		                String t=sc.nextLine();
                        System.out.print("Ano de edição: ");
		                String ano=sc.nextLine();
                        todos_livros.add(new Livro(nome_a, i, e, t, ano));
                    }
                    else {
                        System.out.println("Cadastro finalizado!");
                        break;
                    }
                }
		        todas_livrarias.add(new Livraria(nome_l,cidade_l,estado_l,gerente_l,todos_funcionarios,todos_livros));
            }
            else if(resposta==2) {
                System.out.print("Qual o nome da livraria? ");
                String pergunta=sc.nextLine();
                if(nomes_livrarias.contains(pergunta)) {
                    int c=0;
                    for(c=0;c<todas_livrarias.size();c++) {
                        if(todas_livrarias.get(c).getNome_livraria().equals(pergunta)) {
                            System.out.print("CPF do funcionário: ");
		                    String cpf_f=sc.nextLine();
                            System.out.print("Nome do funcionário: ");
		                    String nome_f=sc.nextLine();
                            System.out.print("Endereço do funcionário: ");
		                    String endereco_f=sc.nextLine();
                            System.out.print("Telefone do funcionário: ");
		                    String telefone_f=sc.nextLine();
                            todas_livrarias.get(c).getFuncionarios().add(new Funcionario(cpf_f, nome_f, endereco_f, telefone_f));
                            System.out.println("Funcionário cadastrado!");
                            break;
                        }
                    }
                }
                else {
                    System.out.println("Não existe nenhuma livraria cadastrada com esse nome!");
                }
            }
            else if(resposta==3) {
                System.out.print("Qual o nome da livraria? ");
                String pergunta=sc.nextLine();
                if(nomes_livrarias.contains(pergunta)) {
                    int c=0;
                    for(c=0;c<todas_livrarias.size();c++) {
                        if(todas_livrarias.get(c).getNome_livraria().equals(pergunta)) {
                            System.out.print("Qual o nome do novo gerente da livraria: ");
		                    String gerente_l=sc.nextLine();
                            todas_livrarias.get(c).setGerente_livraria(gerente_l);;
                            System.out.println("Gerente atualizado!");
                            break;
                        }
                    }
                }
                else {
                    System.out.println("Não existe nenhuma livraria cadastrada com esse nome!");
                }
            }
            else if(resposta==4) {
                System.out.print("Qual o nome da livraria? ");
                String pergunta=sc.nextLine();
                if(nomes_livrarias.contains(pergunta)) {
                    int c=0;
                    for(c=0;c<todas_livrarias.size();c++) {
                        if(todas_livrarias.get(c).getNome_livraria().equals(pergunta)) {
                            System.out.print("Nome do autor: ");
				            String nome_a=sc.nextLine();
                            System.out.print("ISBN: ");
		                    String i=sc.nextLine();
                            System.out.print("Editora: ");
                            String e=sc.nextLine();
                            System.out.print("Título: ");
		                    String t=sc.nextLine();
                            System.out.print("Ano de edição: ");
		                    String ano=sc.nextLine();
                            todas_livrarias.get(c).getLivros().add(new Livro(nome_a, i, e, t, ano));
                            System.out.println("Livro cadastrado!");
                            break;
                        }
                    }
                }
                else {
                    System.out.println("Não existe nenhuma livraria cadastrada com esse nome!");
                }
            }
            else if(resposta==5) {
                System.out.print("Qual o nome da livraria? ");
                String pergunta=sc.nextLine();
                if(nomes_livrarias.contains(pergunta)) {
                    int c=0;
                    for(c=0;c<todas_livrarias.size();c++) {
                        if(todas_livrarias.get(c).getNome_livraria().equals(pergunta)) {
                            int a=0;
                            for(a=0;a<todos_livros.size();a++) {
                                System.out.println("Título: "+todos_livros.get(a).getTitulo_livro()+" -> Autor: "+todos_livros.get(a).getAutor_livro()+" -> Editora: "+todos_livros.get(a).getEditora_livro()+" -> Ano: "+todos_livros.get(a).getAno_livro());
                            }
                            break;
                        }
                    }
                }
                else {
                    System.out.println("Não existe nenhuma livraria cadastrada com esse nome!");
                }
            }
            else if(resposta==6) {
                System.out.print("Qual o nome da livraria? ");
                String pergunta=sc.nextLine();
                if(nomes_livrarias.contains(pergunta)) {
                    int c=0;
                    for(c=0;c<todas_livrarias.size();c++) {
                        if(todas_livrarias.get(c).getNome_livraria().equals(pergunta)) {
                            int a=0;
                            for(a=0;a<todos_funcionarios.size();a++) {
                                System.out.println("Funcionário: "+todos_funcionarios.get(a).getNome_funcionario());
                            }
                            break;
                        }
                    }
                }
                else {
                    System.out.println("Não existe nenhuma livraria cadastrada com esse nome!");
                }
            }
            else if(resposta==7) {
                if(todas_livrarias.size()>0) {
                    int c=0;
                    for(c=0;c<todas_livrarias.size();c++) {
                        System.out.println(todas_livrarias.get(c).getGerente_livraria()+" é o gerente da livraria "+todas_livrarias.get(c).getNome_livraria()+".");
                    }
                }
                else {
                    System.out.println("Nenhuma livraria foi cadastrada!");
                }
            }
            else if(resposta==0) {
                System.out.println("Saindo...");
                break;
            }
        }
    }
}