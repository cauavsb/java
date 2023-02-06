package lista_112;
import java.util.ArrayList;
import java.util.Scanner;
public class Teste {
	public static void desejo() {
	    System.out.println("[1] CADASTRAR HOMEM");
        System.out.println("[2] CADASTRAR MULHER");
        System.out.println("[3] CONSULTAR IMC");
        System.out.println("[4] LISTAR HOMENS");
        System.out.println("[5] LISTAR MULHERES");
        System.out.println("[6] LISTAR TODOS OS IMCs DOS HOMENS");
        System.out.println("[7] LISTAR TODOS OS IMCs");
        System.out.println("[0] SAIR");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Pessoa> pessoas = new ArrayList();
        ArrayList<String> todos_nomes = new ArrayList();
		while(true) {
			desejo();
            System.out.print("Qual opção você deseja? ");
            int resposta=sc.nextInt();
            sc.nextLine();
            if(resposta==1) {
                System.out.print("Nome: ");
                String n=sc.nextLine();
                System.out.print("Data de nascimento: ");
                String data=sc.nextLine();
                System.out.print("Peso: ");
                double p=sc.nextFloat();
                sc.nextLine();
                System.out.print("Altura: ");
                double a=sc.nextFloat();
                sc.nextLine();
                todos_nomes.add(n);
                pessoas.add(new Homem(n,data,p,a));
            }
            else if(resposta==2) {
                System.out.print("Nome: ");
                String n=sc.nextLine();
                System.out.print("Data de nascimento: ");
                String data=sc.nextLine();
                System.out.print("Peso: ");
                double p=sc.nextFloat();
                sc.nextLine();
                System.out.print("Altura: ");
                double a=sc.nextFloat();
                sc.nextLine();
                todos_nomes.add(n);
                pessoas.add(new Mulher(n,data,p,a));
            }
            else if(resposta==3) {
                System.out.print("Qual o nome da pessoa? ");
                String nome=sc.nextLine();
                if(todos_nomes.contains(nome)) {
                    int i=0;
                    for(i=0;i<pessoas.size();i++) {
                        if(pessoas.get(i).getNome().equals(nome)) {
                            if(pessoas.get(i) instanceof Homem) {
                                Homem h=(Homem) pessoas.get(i);
                                System.out.println(h.resultIMC());
                                break;
                            }
                            else if(pessoas.get(i) instanceof Mulher) {
                                Mulher m=(Mulher) pessoas.get(i);
                                System.out.println(m.resultIMC());
                                break;
                            }
                        }
                    }
                }
                else {
                    System.out.println("Não existe nenhuma pessoa cadastrado com esse nome...");
                }
            }
            else if(resposta==4) {
                int i=0;
                for(i=0;i<pessoas.size();i++) {
                    if(pessoas.get(i) instanceof Homem) {
                        Homem h=(Homem) pessoas.get(i);
                        h.info();
                        System.out.println("----------------------------");
                    }
                }
            }
            else if(resposta==5) {
                int i=0;
                for(i=0;i<pessoas.size();i++) {
                    if(pessoas.get(i) instanceof Mulher) {
                        Mulher m=(Mulher) pessoas.get(i);
                        m.info();
                        System.out.println("----------------------------");
                    }
                }
            }
            else if(resposta==6) {
                int i=0;
                System.out.println("-> IMCs DOS HOMENS CADASTRADOS <-");
                for(i=0;i<pessoas.size();i++) {
                    if(pessoas.get(i) instanceof Homem) {
                        Homem h=(Homem) pessoas.get(i);
                        System.out.println(h.calculaIMC(h.getPeso(),h.getAltura()));
                    }
                }
            }
            else if(resposta==7) {
                int i=0;
                System.out.println("-> IMCs DAS PESSOAS CADASTRADAS <-");
                for(i=0;i<pessoas.size();i++) {
                    if(pessoas.get(i) instanceof Homem) {
                        Homem h=(Homem) pessoas.get(i);
                        System.out.println(h.calculaIMC(h.getPeso(),h.getAltura()));
                    }
                    else if(pessoas.get(i) instanceof Mulher) {
                        Mulher m=(Mulher) pessoas.get(i);
                        System.out.println(m.calculaIMC(m.getPeso(),m.getAltura()));
                    }
                }
            }
            else if(resposta==0) {
                System.out.println("Até a próxima...");
                break;
            }
            else {
                System.out.println("Opção inexistente!");
            }
        }
    }
}