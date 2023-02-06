package lista_71;
import java.util.ArrayList;
import java.util.Scanner;
public class DadosLivro {
	public static void desejo() {
	    System.out.println("[1] CADASTRAR LIVRO");
	    System.out.println("[2] BUSCAR LIVRO POR TÍTULO");
        System.out.println("[3] LISTAR LIVROS POR AUTOR");
        System.out.println("[4] LISTAR TODOS OS LIVROS");
	    System.out.println("[0] SAIR DA BIBLIOTECA");
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Livro> todos_livros = new ArrayList();
        ArrayList<String> nome_livros = new ArrayList();
        ArrayList<String> todos_autores = new ArrayList();
		while(true) {
			desejo();
			System.out.print("Qual opção você deseja? ");
			int resposta=sc.nextInt();
			sc.nextLine();
			if(resposta==1) {
                System.out.print("Autor: ");
				String a=sc.nextLine();
                System.out.print("Editora: ");
		        String e=sc.nextLine();
                System.out.print("ISBN: ");
		        int i=sc.nextInt();
		        sc.nextLine();
                System.out.print("Título: ");
		        String t=sc.nextLine();
                System.out.print("Ano de edição: ");
		        int ano=sc.nextInt();
		        sc.nextLine();
                nome_livros.add(t);
                todos_autores.add(a);
		        todos_livros.add(new Livro(a,e,i,t,ano));
            }
            else if(resposta==2) {
                if(todos_livros.size()==0) {
                    System.out.println("Ops... nenhum livro foi cadastrado!");
                }
                else {
                    System.out.print("Qual o título do livro? ");
				    String t=sc.nextLine();
                    if(todos_livros.size()==1) {
                        if(todos_livros.get(0).getTitulo().equals(t)) {
                            System.out.println("Livro encontrado! Pode pegar.");
                        }
                        else {
                            System.out.println("Livro não encontrado!");
                        }
                    }
                    else {
                        if(nome_livros.contains(t)) {
                            int i=0;
                            for(i=0;i<todos_livros.size();i++) {
                                if(todos_livros.get(i).getTitulo().equals(t)) {
                                    System.out.println("Livro encontrado! Pode pegar.");
                                    break;
                                }
                            }
                        }
                        else {
                            System.out.println("Nenhum livro com esse nome foi encontrado!");
                        }
                    }
                }
            }
            else if(resposta==3) {
                if(todos_livros.size()==0) {
                    System.out.println("Ops... nenhum livro foi cadastrado!");
                }
                else {
                    System.out.print("Qual o nome do autor? ");
				    String a=sc.nextLine();
                    if(todos_livros.size()==1) {
                        if(todos_livros.get(0).getAutor().equals(a)) {
                            System.out.println("Apenas um livro desse autor foi encontrado!");
                            System.out.println("Titulo: "+todos_livros.get(0).getTitulo()+" -> Editora: "+todos_livros.get(0).getEditora()+" -> Ano Edição: "+todos_livros.get(0).getAno_edicao());
                        }
                        else {
                            System.out.println("Nnenhum livro desse autor foi encontrado!");
                        }
                    }
                    else {
                        if(todos_autores.contains(a)) {
                            int i=0;
                            System.out.println("-> SEGUE ABAIXO OS LIVROS DESSE AUTOR <-");
                            for(i=0;i<todos_livros.size();i++) {
                                if(todos_livros.get(i).getAutor().equals(a)) {
                                    System.out.println("Titulo: "+todos_livros.get(i).getTitulo()+" -> Editora: "+todos_livros.get(i).getEditora()+" -> Ano Edição: "+todos_livros.get(i).getAno_edicao());
                                }
                            }
                        }
                        else {
                            System.out.println("Nenhum livro desse autor foi encontrado!");
                        }
                    }
                }
            }
            else if(resposta==4) {
                if(todos_livros.size()==0) {
                    System.out.println("Ops... nenhum livro foi cadastrado!");
                }
                else if(todos_livros.size()==1) {
                    System.out.println("Apenas um livro foi cadastrado! Sendo ele:");
                    System.out.println("Titulo: "+todos_livros.get(0).getTitulo()+" -> Editora: "+todos_livros.get(0).getEditora()+" -> Ano Edição: "+todos_livros.get(0).getAno_edicao());
                }
                else {
                    int i=0;
                    System.out.println("-> SEGUE ABAIXO TODOS OS LIVROS <-");
                    for(i=0;i<todos_livros.size();i++) {
                        System.out.println("Titulo: "+todos_livros.get(i).getTitulo()+" -> Editora: "+todos_livros.get(i).getEditora()+" -> Ano Edição: "+todos_livros.get(i).getAno_edicao());
                    }
                }
            }
            else {
                System.out.println("Biblioteca fechada!");
                break;
            }
        }
    }
}